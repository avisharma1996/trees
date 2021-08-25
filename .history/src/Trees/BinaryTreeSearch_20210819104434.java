package Trees;

public class BinaryTreeSearch {
    Node root;

    public static void preOrder(Node node) {
        System.out.println(node.val);

        if (node.left != null)
            preOrder(node.left);

        if (node.right != null)
            preOrder(node.right);
    }

    public static void inOrder(Node node) {

        if (node.left != null)
            inOrder(node.left);

        System.out.println(node.val);

        if (node.right != null)
            inOrder(node.right);
    }

    public static void postOrder(Node node) {

        if (node.left != null)
            postOrder(node.left);

        if (node.right != null)
            postOrder(node.right);

        System.out.println(node.val);
    }

    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;

        preOrder(a);
        inOrder(a);
        postOrder(a);
    }

}