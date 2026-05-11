public static void main ()
tree traversal tree tree = new treeTraversal();
tree.root = new Node(1)( data 12);
tree.root.left = new Node(2)( data 5);
tree.root.right = new Node(3)( data 15);
tree.root.left.left = new Node(4)( data 3);
tree.root.left.right = new Node(5)( data 7);
tree.root.right.left = new Node(6)( data 13);
tree.root.right.right = new Node(7)( data 17);
System.out.println("Inorder Traversal:");
tree.inorderTraversal(tree.root);
System.out.println("\nInorder Traversal:");
tree.preorderTraversal(tree.root);
System.out.println("\nInorder Traversal:");
tree.postorderTraversal(tree.root);