package tree;


public class ConnectNodesAtSameLevel {

	// complete Binary Tree
	public static void connect(Node1 root)
	{
		if(root !=null)
		{
			if(root.left !=null)
				root.left.next = root.right;
			
			if(root.right !=null)
				root.right.next = root.next == null ? null : root.next.left ;
			
			connect(root.left);
			connect(root.right);
		}
	}
	
	public static void main(String args[])
	{
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);
		root.right.left = new Node1(6);
		root.right.right = new Node1(7);
		
		root.next = null;
	}
}
