//finding height of a tree
class node1 {

    int Data;
    node1 left, right;

    node1(int data) {
        this.Data = data;
        this.left = null;
        this.right = null;
    }
}

public class P1day9 {

    node1 root;

    public static void main() {
        p2 tree = new p2();
        tree.root = new node1(12);
        tree.root.left = new node1(10);
        tree.root.right = new node1(15);
        tree.root.left.left = new node1(11);
        tree.root.left.right = new node1(13);
        tree.root.right.left = new node1(14);
        tree.root.right.right = new node1(16);

        int height = findHeight(tree.root);
        System.out.println("Height of the tree: " + height);
    }

    public static int findHeight(node1 node) {
        if (node == null) {
            return -1;
        }
        
        return 1 + Math.max(findHeight(node.left), findHeight(node.right));
    }
    
}