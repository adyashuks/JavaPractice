package pract;

public class Ne {
	Node root;
	private static class Node {
		int data;
		Node left, right;
		public Node(int item) {
			data = item;
			left = right = null;
		}
		
	}
	public static void print(Node node) {
		if(node == null) {return ;}
		if(node.left == null && node.right == null) {
			System.out.println(node);
		}
		print(node.left);
		print(node.right);
	}
	public static void main(String[] args) throws Exception { 
		Ne tree = new Ne();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        System.out.println("The leaf count of binary tree is : " 
//                + tree.print(root)
                ); 
	}
}

