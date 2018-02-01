package tree;

public class CheckIdentical {
	
	public static boolean identical(Node root1,Node root2)
	{
		if(root1 == null && root2 == null)
		return true;
		if(root1 == null || root2 == null)
			return false;
		
		if(root1.data == root2.data &&
				identical(root1.left, root2.left) && identical(root1.right, root2.right))
		 return true;
		else
			return false;
		
	}

	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(10);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		Node tree1 = new Node(1);
		tree1.left = new Node(2);
		tree1.right = new Node(3);
		tree1.left.left = new Node(4);
		tree1.left.right = new Node(5);
		tree1.left.left.left = new Node(10);
		tree1.right.left = new Node(6);
		tree1.right.right = new Node(7);

		
	  System.out.println("Identical  :"+identical(root, tree1));
	}
}
