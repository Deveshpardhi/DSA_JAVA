

public class linkedlist_2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycleFound = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleFound = true;
                break;
            }
        }

        if (!cycleFound) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        if (prev != null) {
            prev.next = null;
        }
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public Node merge(Node h1, Node h2) {
        Node mergedList = new Node(-1);
        Node temp = mergedList;

        while (h1 != null && h2 != null) {
            if (h1.data < h2.data) {
                temp.next = h1;
                h1 = h1.next;
            } else {
                temp.next = h2;
                h2 = h2.next;
            }
            temp = temp.next;
        }

        while (h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }

        while (h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return mergedList.next;
    }

    public static void printll() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linkedlist is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist_2 ll = new linkedlist_2();

        ll.addFirst(5);
        ll.addFirst(22);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println("Original Linked List:");
        ll.printll();

        System.out.println("After Merge Sort:");
        ll.head = ll.mergeSort(ll.head);
        ll.printll();
    }
}
