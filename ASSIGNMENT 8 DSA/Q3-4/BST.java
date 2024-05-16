class Country {
    String name;
    int population;
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
    BNode root;
    public BST() {
        root = null;
    }
    public void insert(Country info) {
        root = insertRec(root, info);
    }
    BNode insertRec(BNode root, Country info) {
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
    public void inorderTraversal() {
        inorderRec(root);
    }
    void inorderRec(BNode node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.println(node.info);
            inorderRec(node.right);
        }
    }
    public void preorderTraversal() {
        preorderRec(root);
    }
    void preorderRec(BNode node) {
        if (node != null) {
            System.out.println(node.info);
            preorderRec(node.left);
            preorderRec(node.right);
        }
    }
    public void postorderTraversal() {
        postorderRec(root);
    }
    void postorderRec(BNode node) {
        if (node != null) {
            postorderRec(node.left);
            postorderRec(node.right);
            System.out.println(node.info);
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
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(new Country("CountryA", 500000));
        bst.insert(new Country("CountryB", 200000));
        bst.insert(new Country("CountryC", 800000));
        bst.insert(new Country("CountryD", 300000));
        bst.insert(new Country("CountryE", 700000));
        System.out.println("In-order traversal:");
        bst.inorderTraversal();
        System.out.println("Pre-order traversal:");
        bst.preorderTraversal();
        System.out.println("Post-order traversal:");
        bst.postorderTraversal();
        System.out.println("Node with maximum population: " + bst.findMax());
        System.out.println("Node with minimum population: " + bst.findMin());
    }
}
