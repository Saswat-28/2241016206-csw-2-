package Q6;
import java.util.LinkedList;
import java.util.Queue;
class Country {
    private String name;
    private int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + '}';
    }
}
class BNode {
    Country info;
    BNode left, right;

    public BNode(Country info) {
        this.info = info;
        this.left = this.right = null;
    }
}

public class BST {
    private BNode root;

    public BST() {
        root = null;
    }

    public void insert(Country info) {
        root = insertRec(root, info);
    }

    private BNode insertRec(BNode root, Country info) {
        if (root == null) {
            root = new BNode(info);
            return root;
        }
        if (info.getPopulation() < root.info.getPopulation()) {
            root.left = insertRec(root.left, info);
        } else if (info.getPopulation() > root.info.getPopulation()) {
            root.right = insertRec(root.right, info);
        }
        return root;
    }

    public void delete(int population) {
        root = deleteRec(root, population);
    }

    private BNode deleteRec(BNode root, int population) {
        if (root == null) {
            return null;
        }

        if (population < root.info.getPopulation()) {
            root.left = deleteRec(root.left, population);
        } else if (population > root.info.getPopulation()) {
            root.right = deleteRec(root.right, population);
        } else {
            // Node to be deleted found
            // Case 1: No children
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            // Find in-order successor (smallest in the right subtree)
            BNode successor = findMin(root.right);
            root.info = successor.info;
            root.right = deleteRec(root.right, successor.info.getPopulation());
        }

        return root;
    }

    private BNode findMin(BNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(BNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.println(node.info);
            inorderRec(node.right);
        }
    }

    public void preorderTraversal() {
        preorderRec(root);
    }

    private void preorderRec(BNode node) {
        if (node != null) {
            System.out.println(node.info);
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }

    public void postorderTraversal() {
        postorderRec(root);
    }

    private void postorderRec(BNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.println(node.info);
        }
    }

    public void levelOrderTraversal() {
        if (root == null) return;

        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BNode current = queue.poll();
            System.out.println(current.info);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public Country findMax() {
        if (root == null) return null;

        BNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.info;
    }

    public Country findMin() {
        if (root == null) return null;

        BNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.info;
    }

    public void createTree(int[] sortedArray) {
        root = createTreeRec(sortedArray, 0, sortedArray.length - 1);
    }

    private BNode createTreeRec(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Country country = new Country("Country" + array[mid], array[mid]);
        BNode node = new BNode(country);

        node.left = createTreeRec(array, start, mid - 1);
        node.right = createTreeRec(array, mid + 1, end);

        return node;
    }

    public static void main(String[] args) {
        BST bst = new BST();

        int[] elements = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        bst.createTree(elements);

        System.out.println("In-order traversal:");
        bst.inorderTraversal();

        System.out.println("Pre-order traversal:");
        bst.preorderTraversal();

        System.out.println("Post-order traversal:");
        bst.postorderTraversal();

        System.out.println("Level-order traversal:");
        bst.levelOrderTraversal();

        System.out.println("Node with maximum population: " + bst.findMax());
        System.out.println("Node with minimum population: " + bst.findMin());

        System.out.println("Deleting node with population 50");
        bst.delete(50);

        System.out.println("In-order traversal after deletion:");
        bst.inorderTraversal();

        System.out.println("Is the tree a BST? " + bst.isBST());
    }

    public boolean isBST() {
        return isBSTRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTRec(BNode node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.info.getPopulation() <= min || node.info.getPopulation() >= max) {
            return false;
        }

        return isBSTRec(node.left, min, node.info.getPopulation()) &&
               isBSTRec(node.right, node.info.getPopulation(), max);
    }
}
