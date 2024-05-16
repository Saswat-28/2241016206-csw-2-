import java.util.ArrayList;
import java.util.List;
class BSTNode {
    int info;
    BSTNode left, right;

    public BSTNode(int info) {
        this.info = info;
        left = right = null;
    }
}

class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int info) {
        root = insertRec(root, info);
    }

    BSTNode insertRec(BSTNode root, int info) {
        if (root == null) {
            root = new BSTNode(info);
            return root;
        }
        if (info < root.info) {
            root.left = insertRec(root.left, info);
        } else if (info > root.info) {
            root.right = insertRec(root.right, info);
        }
        return root;
    }

    public List<Integer> preorderTraversal() {
        List<Integer> result = new ArrayList<>();
        preorderRec(root, result);
        return result;
    }

    void preorderRec(BSTNode node, List<Integer> result) {
        if (node != null) {
            result.add(node.info);
            preorderRec(node.left, result);
            preorderRec(node.right, result);
        }
    }

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }

    void inorderRec(BSTNode node, List<Integer> result) {
        if (node != null) {
            inorderRec(node.left, result);
            result.add(node.info);
            inorderRec(node.right, result);
        }
    }

    public List<Integer> postorderTraversal() {
        List<Integer> result = new ArrayList<>();
        postorderRec(root, result);
        return result;
    }

    void postorderRec(BSTNode node, List<Integer> result) {
        if (node != null) {
            postorderRec(node.left, result);
            postorderRec(node.right, result);
            result.add(node.info);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Pre-order traversal: " + bst.preorderTraversal());
        System.out.println("In-order traversal: " + bst.inorderTraversal());
        System.out.println("Post-order traversal: " + bst.postorderTraversal());
    }
}

