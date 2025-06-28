import java.util.*;
import javax.lang.model.element.QualifiedNameable;

public class dst {
    static class node{
        int data;
        node left;
        node right;

        node(int data,node left,node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }

    }

    static class tree {
        node root;
        static int i=-1;
        public node buildT(int arr[]){
            i++;
            if(arr[i]==-1){
                return null;
            }
            node treenode=new node(arr[i], null, null);
            treenode.left=buildT(arr);
            treenode.right=buildT(arr);
            return treenode;
        }

        public void inorder(node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public void preorder(node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public void postorder(node root){
            if(root==null){
                System.out.print(-1+" ");
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public void levelOrder(node root){
            if(root==null) return;

            Queue<node> q=new LinkedList();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                node temp=q.poll();
                if(q.isEmpty()) break;
                if(temp==null){
                    System.out.println();
                    q.add(null);
                }else{
                    System.out.print(temp.data);
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
                
            }
        }


    }

   


    public static void main(String[] args) {
        int []arr={1,2,-1,-1,-1};
        tree t1=new tree();
        t1.root=t1.buildT(arr);
        //t1.inorder(t1.root);
        t1.levelOrder(t1.root);
    }
}
