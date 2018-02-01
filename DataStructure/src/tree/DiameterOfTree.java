package tree;

public class DiameterOfTree {
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	public static int diameter(Node root)
	{
		if(root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);
		
		return Math.max(lh+ rh+ 1, Math.max(ldiameter, rdiameter));
	}
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
	
	System.out.println("Diameter :"+diameter(root));
	}
}
