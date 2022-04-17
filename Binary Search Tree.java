class bst{
    class Node{
        int key;
        Node left,right;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    bst(){
        root=null;
    }
    void insert(int key){
        root=insertkey(root,key);
    }
    Node insertkey(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insertkey(root.left,key);
        else if(key>root.key)
            root.right=insertkey(root.right,key);
        return root;
    }
    void inorder(){
        inorderrec(root);
    }
    void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.left);
            System.out.print(root.key + "--> ");
            inorderrec(root.right);
        }
    }

    public static void main(String[] args) {
        bst treee=new bst();
        treee.insert(8);
        treee.insert(3);
        treee.insert(1);
        treee.insert(6);
        treee.insert(7);
        treee.inorder();

    }
}
