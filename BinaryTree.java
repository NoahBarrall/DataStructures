class Node {
    int element;
    Node left, right;
    public Node(int item){
        element = item;

        //create left and right pointer and point it to null
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    void PrintTree() {
        PrintPreOrder(root);
        System.out.println();
        PrintInOrder(root);
        System.out.println();
        PrintPostOrder(root);
    }

    void PrintPreOrder(Node node) {
        if(node == null)
            return;
        System.out.print(node.element + " ");
        PrintPreOrder(node.left);
        PrintPreOrder(node.right);

    }


    void PrintInOrder(Node node) {
        if(node == null)
            return;
        PrintInOrder(node.left);
        System.out.print(node.element + " ");
        PrintInOrder(node.right);
        
    }

      void PrintPostOrder(Node node) {
        if(node == null)
            return;
        PrintPostOrder(node.left);
        PrintPostOrder(node.right);
        System.out.print(node.element + " ");
    }

    public static void main(String[] args){
        //Create binary tree and defines root that is pointed to null...empty tree basically
        BinaryTree BT = new BinaryTree();

        BT.root = new Node(1);
        BT.root.left = new Node(2);
        BT.root.right = new Node(3);
        BT.root.left.left = new Node(4);
        BT.root.left.right = new Node(5);
        BT.root.right.left = new Node(6);
        BT.root.right.right = new Node(7);

        BT.PrintTree();

    }

}