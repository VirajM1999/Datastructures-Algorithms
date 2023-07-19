package BinaryST;
public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void addNode(int data) throws Exception  
	{
		Node newnode=new Node();
		newnode.setData(data);
		newnode.setLeft(null);
		newnode.setRight(null);
		
		if(root==null)
		{
			root=newnode;
		}
		else
		{
			Node trav=root;
			while(true)
			{
				if(newnode.getData()<trav.getData())
				{
					if(trav.getLeft()==null)
					{
						trav.setLeft(newnode);
						break;
					}
					else
						trav=trav.getLeft();
				}
				else if(newnode.getData()>trav.getData())
				{
					if(trav.getRight()==null)
					{
						trav.setRight(newnode);
						break;
					}
					else
						trav=trav.getRight();
				}
				else
					throw new Exception("Duplicate value!");
			}
		}
		
	}
	
	public void Inorder() {
		Inorder(root);
	}
	
	public void Inorder(Node trav) {
		if(trav!=null)
		{
			Inorder(trav.getLeft());
			System.out.print(trav.getData()+"   ");
			Inorder(trav.getRight());
		}
	}
	
}
