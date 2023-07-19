import java.util.Scanner;

public class new_BinaryTree_creation {
	
	static Node create() {
		Scanner sc=new Scanner(System.in);
//			Node root=null;
			
			System.out.println("enter the data " );
			int data=sc.nextInt();
			if(data==0) {
				return null;}
			else {
			Node root=new Node(data);
			System.out.println("leftnode of "+root.data+" ");
			root.Left=create();
			System.out.println("enter the RightNode of "+root.data+"=");
			root.Right=create();
			return root;
			}
			
		}
	
	
	public static void inorder(Node root){//LNR
		if(root==null) 
		return;
			inorder(root.Left);
			System.out.print(root.data+" ");
			inorder(root.Right);
		
		
	}
	public static void preorder(Node root){//NLR
		if(root==null) 
		return;
		System.out.print(root.data+" ");
			preorder(root.Left);
			preorder(root.Right);
		
		
	}
	public static void postorder(Node root) {//lRN
		if(root==null) 
			return;
		postorder(root.Left);
		postorder(root.Right);
		System.out.print(root.data+" ");
		
		
		
	}
		
	
	

	public static void main(String[] args) {
		Node root=create();
		System.out.println("displaying inorder traversal");
		inorder(root);
		System.out.println("displaying preorder traversal");
		preorder(root);
		System.out.println("displaying postorder traversal");
		postorder( root);
//		System.out.println();

		

	}
	}
	class Node{
		Node Left,Right;
		int data;
		
		
		public Node(int data) {
			this.data=data;
			Left=null;
			Right=null;
		}
	}


