package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSearch {
    Node root;

    public static Node bstRoot;

    BinaryTreeSearch() {
        bstRoot = null;
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
        bstRoot = insertBST(bstRoot, val);
    }

    public static Node insertBST(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < bstRoot.val)
            insertBST(node.left, val);
        else if (val > bstRoot.val)
            insertBST(node.right, val);

        return node;
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
    }

}