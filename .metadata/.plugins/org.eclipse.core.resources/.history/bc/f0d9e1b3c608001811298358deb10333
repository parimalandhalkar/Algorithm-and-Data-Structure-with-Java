package tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompleteBinaryTree {

	static boolean flag1= true, flag2 = false;
	public static void checkcomplete(Node root)
	{
		if(root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			if(temp !=null && temp.left ==null && temp.right !=null)
			{
				flag1 = false;
				break;
			}
			if(temp.left !=null)
				q.add(temp.left);
			else
				flag2 = true;
			
			if(temp.right !=null && flag2 == true)
			{
				flag1 = false;
				break;
			}else
				q.add(temp.right);
		}
	}
	
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		
		checkcomplete(root);
		System.out.print(flag1);
	
	}
}
