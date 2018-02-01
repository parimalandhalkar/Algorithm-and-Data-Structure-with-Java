package tree;

public class HeightBalanced {
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1+ Math.max(height(root.left),height(root.right));
	}
	
	public static boolean heightBalanced(Node root)
	{
		if(root == null)
			return true;
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(Math.abs(lh-rh)<=1 && heightBalanced(root.left) && heightBalanced(root.right))
		return true;
		return false;
		
	}
	
	
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		//root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		//root.left.left.left = new Node(10);
		//root.right.left = new Node(6);
		//root.right.right = new Node(7);
	
	System.out.println("Height Balanced :"+heightBalanced(root));
	}

}
