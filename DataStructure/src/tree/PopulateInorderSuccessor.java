package tree;



public class PopulateInorderSuccessor {

	public static void main(String args[])
	{
		Node1 root= new Node1(10);
		root.left = new Node1(8);
		root.right = new Node1(2);
		root.left.left = new Node1(3);
		root.left.right = new Node1(5);
		root.left.left.left = new Node1(15);
		
	}
}
