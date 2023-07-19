import java.util.Scanner;

public class SinglyLL {
	public static class Node{
		int data;
		Node next;
			Node(int data) {
			this.data=data;
			this.next=null;
		}
			
	
	}
	Node head=null;
	
	
	//TO ADD DATA TO END OF LIST
	public void addlast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	
	
	// TO DISPLAY LIST
	public void display() {
		if(head==null) {
			System.out.println("empty linkedlist");
		}
		else {
		Node temp=head;
		while(temp!=null) {
			
			System.out.print(temp.data+" ");
			temp=temp.next;
			
		}
		
		}
	}
	//TO REMOVEALL OCCURENCE FROM LIST
	
	public void removeAll(int data) {
		if (head == null) {
			System.out.println("empty linkedlist");
		}
		
		else {
			Node temp = head;
			Node ptr = null;
			while (temp != null) {
				if (temp.data == data) {
					if (temp == head) {
						head = temp.next;
					} else
						ptr.next = temp.next;
				} else {
					ptr = temp;
				}
				temp = temp.next;
			}
		}
	}
		//get pair of sum
		public void getpairSum(int sum) {
			boolean flag =false;
			for(Node i=head;i.next!=null;i =i.next) {
				for(Node j=head.next;j.next!=null;j=j.next) {
					if(i.data+j.data==sum) {
						System.out.println("("+i.data +" "+j.data +")"+" ");
						flag=true;
					}
				}
			}
			if(flag==false)
				System.out.println("no pairs present");
			
		}
	
	
	
	public static void main(String[] args) {
		
		SinglyLL LL=new SinglyLL();
		try(Scanner sc=new Scanner(System.in)){
			
			boolean flag=false;
			while(!flag) {
				System.out.println("\npress 1.to add data at last position\n"
						+ "2.to remove all occurence of data\n"
						+ "3.display the list\n"
						+ "4.to get pair of sum \n"
						+ "5.to exit == ");
				
				switch (sc.nextInt()) {
				case 1: 
					System.out.println("enter the data");
					LL.addlast(sc.nextInt());
					break;
					
				case 2: 
					System.out.println("enter the data to remove");
					LL.removeAll(sc.nextInt());
				
					
					break;
				case 3: 
					LL.display();
					break;
				case 4: 
					System.out.println("enter the sum to get pairs");
					LL.getpairSum(sc.nextInt());
					
					break;
				case 5: 
					flag=false;
					break;
					
			
					
				}
				
				
				
				
			}
			
		}
		
	
	}

}
