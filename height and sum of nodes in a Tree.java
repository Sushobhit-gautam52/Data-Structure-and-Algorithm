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

    }
    public static int sumnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumnodes(root.left);
        int rightsum=sumnodes(root.right);
        return leftsum +rightsum +root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        int myheight=Math.max(leftheight,rightheight);
        return myheight+1;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree=new binarytree();
        Node root=tree.build(nodes);

  
        System.out.println(sumnodes(root));
        System.out.println(height(root));
    }
}
