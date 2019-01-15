class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class BinarySearchTree {
    
    Node root;
    private int ctr;
    
    public BinarySearchTree(Node root) {
        this.root = root;
    }
    
    public void insert(int val) {
        root = insert(root, val);
    }
    
    private Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        
        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    
    
    public void search(int val) {
        ctr = 0;
        boolean status = search(root, val);
        if (status) {
            System.out.println("Found " + val + " in " + ctr + " iterations");
        }
        else {
            System.out.println("Couldn't find " + val + " in " + ctr + " iterations");
        }
    }
    
    private boolean search(Node root, int data) {
        ctr++;
        if (root == null) 
            return false;
        else if (root.data == data)
            return true;
        
        if (data > root.data)
            return search(root.right, data);
        else
            return search(root.left, data);
    }
    
    
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(null);
        int arr[] = {5, 2, 6, 1, 3};
        System.out.println("Elements in array: ");
        for (int i : arr) {
            bst.insert(i);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Inorder Traversal of BST: ");
        bst.inorder();
        bst.search(3);
        bst.search(5);
        bst.search(6);
        bst.search(10);
    }
}