package tree;

import java.util.ArrayList;

public class PrintRootToLeafPaths {
	
	
	public static void printArray(int [] list,int len)
	{
		for(int i=0;i<len;i++)
			System.out.print(list[i]+" ");
	
		System.out.println();
	}
	
	public static void printPath(int path[],Node root,int pathIndex)
	{
	
		if(root  !=null)
		{
			path[pathIndex++] = root.data;
			if(root.left ==null && root.right == null)
			{
				printArray(path,pathIndex);
			}
			
			printPath(path, root.left, pathIndex);
			printPath(path, root.right, pathIndex);
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		//root.left.left.left = new Node(15);
		root.right.left = new Node(6);
		root.right.left.left = new Node(8);
		root.right.right = new Node(7);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int pathIndex=0;
		int path[] = new int[100];
		
		printPath(path, root,pathIndex);
		
		System.out.println();
	}
}
