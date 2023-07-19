package BinaryST;

public class Tester {

	public static void main(String[] args) throws Exception {
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.addNode(50);
		bst.addNode(20);
		bst.addNode(40);
		bst.addNode(10);
		bst.addNode(70);
		bst.addNode(24);
		
		bst.Inorder();
		
		

	}

}
