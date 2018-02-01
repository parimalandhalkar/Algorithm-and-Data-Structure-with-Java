package tree;

public class RootToLeafPathSum {

	// easy  && correct 
	public static boolean rootToLeafSum1(Node root,int sum)
	{
		if(root!=null)
		{
			if(root.left ==null && root.right ==null && sum ==root.data)
				return true;
			
			return rootToLeafSum1(root.left, sum-root.data) || rootToLeafSum1(root.right, sum-root.data);
			
		}
		return false;
	}
	
	
	
	public static boolean rootToLeafSum(Node root,int sum)
	{
		if(root.left ==null && root.right==null && sum == root.data)
		{
			System.out.println(root.data+" "+"Sum :"+sum);
			return true;
		}
			
		if(root.left !=null && sum !=0)
		{
			System.out.println(root.left.data+" "+(sum-root.data));
			if(rootToLeafSum(root.left, sum-root.data))
			{
				return true;
			}
		
		}
		if(root.right != null && sum !=0)
		{
			System.out.println(root.left.data+" "+(sum-root.data));
			return rootToLeafSum(root.right, sum-root.data);
			//System.out.println(root.left.data+" "+sum);
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
	
		int sum =234;
	  System.out.println("Sum Exist :"+rootToLeafSum1(root, sum));
	}

}
