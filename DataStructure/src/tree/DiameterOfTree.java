package tree;

public class DiameterOfTree {
	
	
//efficient  : O(n)
	
	static int diameter = 0;
	public static int diameterOfTree(Node root)
	{
		if(root!=null)
		{
			int left = diameterOfTree(root.left);
			int right= diameterOfTree(root.right);
			
			diameter = Math.max(1+left + right ,diameter);
			//System.out.println("diameter :"+diameter);
			return (1+Math.max(left, right));
		}
		return 0;
	}
	
	
	
	public static int height(Node root)
	{
		if(root == null)
			return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	//  O(n^2)
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
		root.right.right = new Node(8);
		root.left.left.left = new Node(6);
	
		diameterOfTree(root);
	System.out.println("Diameter :"+DiameterOfTree.diameter);
	}
}
