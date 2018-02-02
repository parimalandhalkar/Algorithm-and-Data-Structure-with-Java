package tree;

public class RootToLeafPathSum {

	// easy  && correct 
	public static boolean rootToLeafSum(Node root,int sum)
	{
		if(root!=null)
		{
			if(root.left ==null && root.right ==null && sum ==root.data)
				return true;
			
			return rootToLeafSum(root.left, sum-root.data) || rootToLeafSum(root.right, sum-root.data);
			
		}
		return false;
	}
	
	
	
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(2);
	
		int sum =23;
	  System.out.println("Sum Exist :"+rootToLeafSum(root, sum));
	}

}