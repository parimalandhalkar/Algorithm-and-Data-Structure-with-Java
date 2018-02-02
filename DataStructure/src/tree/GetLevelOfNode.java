package tree;

public class GetLevelOfNode {
	
	
	public static void getLevel(Node root,int key,int level)
	{
		if(root!=null)
		{
			if(root.data == key)
			{
				System.out.print(level);
				System.exit(0);
			}
				
			
			
			getLevel(root.left, key, level + 1);
			getLevel(root.right, key, level + 1);
		}
		//return 0;
	}
	
	
	public static void main(String args[])
	{
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.left.left = new Node(9);
		root.left.right = new Node(5);
		root.left.right.right = new Node(7);
		root.left.right.right.right = new Node(6);
		root.right.left = new Node(4);
	
		getLevel(root,9 , 0);
		//System.out.print();
	}

}
