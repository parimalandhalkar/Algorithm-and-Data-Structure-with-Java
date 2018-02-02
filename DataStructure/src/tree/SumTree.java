package tree;

public class SumTree {

	static boolean ans = true;
	public static int isSum(Node root)
	{
	if(root !=null)
	{
		if(root.left ==null && root.right == null)
			return root.data;
		int left = isSum(root.left);
		int right = isSum(root.right);
		
		if(root.data != left + right)
		{
			ans = false;
			//System.exit(0);
		}
		return root.data + left + right;
	}
	return 0;
	
	}
	
	
	public static void main(String args[])
	{
		Node root = new Node(26);
		root.left = new Node(10);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(6);
		root.right.right = new Node(13);
		
		System.out.println(isSum(root));
		System.out.println(SumTree.ans);
	}
}
