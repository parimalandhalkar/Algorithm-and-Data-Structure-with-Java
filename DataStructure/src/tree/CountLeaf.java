package tree;

public class CountLeaf {
	static int count=0;
	
	public static void countLeafNodes(Node root)
	{
		if(root == null)
			return;
		
		if(root.left ==null && root.right == null)
			count++;
		
		countLeafNodes(root.left);
		countLeafNodes(root.right);
		
		
	}

	// bfs traversal can also be used
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		//root.left.left.left = new Node(10);
		//root.right.left = new Node(6);
		//root.right.right = new Node(2);
		
		
		countLeafNodes(root);
		
		System.out.println(CountLeaf.count);
	}
}
