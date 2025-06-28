public class linkedList_1 {
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

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void add(int data, int index) {
        Node temp = head;
        Node newNode = new Node(data);
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst() {
        if (head == null) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void remove(int idx) {
        if (head == null || idx < 0) return;
        if (idx == 0) {
            head = head.next;
            return;
        }
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            if (prev.next == null) return;
            prev = prev.next;
        }
        if (prev.next == null) return;
        prev.next = prev.next.next;
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPallindrom() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        linkedList_1 ll = new linkedList_1();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(0);
        ll.addLast(1);
        boolean a = isPallindrom();
        System.out.println(a);
        ll.printll();
    }
}
