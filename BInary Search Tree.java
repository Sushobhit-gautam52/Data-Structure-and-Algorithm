class BST{
    class Node{
        int key;
        Node left,right;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    BST(){
        root=null;
    }
    BST(int value){
        root=new Node(value);
    }
    void insert(int key){
        root=insertrec(root,key);
    }
    Node insertrec(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insertrec(root.left,key);
            else if(key>root.key)
                root.right=insertrec(root.right,key);
            return root;
        }
        void inorder(){

            inorderrec(root);}
    void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.left);
            System.out.println(root.key);
            inorderrec(root.right);
        }
    }    

    public static void main(String[] args) {
        BST tree=new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();

    }
}
