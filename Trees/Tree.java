public class Tree {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public Tree() {
        this.root = null;
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private void inorder(Node root) {
        if (root.left != null) {
            inorder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right != null) {
            inorder(root.right);
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void postorder(Node root) {
        if (root.left != null) {
            postorder(root.left);
        }
        if (root.right != null) {
            postorder(root.right);
        }
        System.out.print(root.data + " ");
    }

    public void postorder() {
        postorder(root);
    }

    private void preorder(Node root) {
        System.out.print(root.data + " ");
        if (root.left != null) {
            preorder(root.left);
        }
        if (root.right != null) {
            preorder(root.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(20);
        tree.insert(50);
        tree.insert(10);
        tree.insert(70);
        tree.insert(60);
        tree.insert(10);

        System.out.println("THE INORDER DATA:");
        tree.inorder();

        System.out.println("\nTHE POSTORDER DATA:");
        tree.postorder();

        System.out.println("\nTHE PREORDER DATA:");
        tree.preorder();
    }
}
