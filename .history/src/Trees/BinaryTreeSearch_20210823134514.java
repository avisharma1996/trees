package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSearch {
    public static Node root;

    BinaryTreeSearch() {
        root = null;
    }

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

    public static void BFS(Node node) {
        Queue<Node> q = new LinkedList<Node>();

        q.add(node);

        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            System.out.println(currentNode.val);
            if (currentNode.left != null)
                q.add(currentNode.left);
            if (currentNode.right != null)
                q.add(currentNode.right);
        }
    }

    public static void insert(int val) {
        root = insertBST(root, val);
    }

    public static Node insertBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val)
            insertBST(root.left, val);
        else if (val > root.val)
            insertBST(root.right, val);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);

        Node b = new Node(2);
        Node c = new Node(3);

        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        preOrder(a);
        System.out.println("_______________________");
        inOrder(a);
        System.out.println("_______________________");
        postOrder(a);
        System.out.println("_______________________");
        BFS(a);

        BinaryTreeSearch bst = new BinaryTreeSearch();

        bst.insert(50);
        bst.insert(40);
        bst.insert(80);
        bst.insert(45);
        bst.insert(90);

        bst.inorder();
    }

}