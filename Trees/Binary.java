public class Binary {
    private Node root;

    private class Node {
        private Node right;
        private Node left;
        private int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Binary binaryTree = new Binary();
        binaryTree.createBinaryTree();

        System.out.println("Pre-Order Traversal:");
        binaryTree.preOrderTraversal(binaryTree.root);

        System.out.println("\nIn-Order Traversal:");
        binaryTree.inOrderTraversal(binaryTree.root);

        System.out.println("\nPost-Order Traversal:");
        binaryTree.postOrderTraversal(binaryTree.root);
    }
}
