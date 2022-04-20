import java.util.LinkedList;
import java.util.Queue;

class myclas{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
     static class binarytree{
        static int index=-1;
        public Node build(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newnode=new Node(nodes[index]);
            newnode.left=build(nodes);
            newnode.right=build(nodes);
            return newnode;
        }
        
    }public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);

        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,7,-1,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.build(nodes);

        preorder(root);
       inorder(root);
        postorder(root);
        levelorder(root);
    }
}
