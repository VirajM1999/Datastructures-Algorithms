import java.util.Scanner;


public class CircularList {
	
	

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	
	public void CirLcreate() {
		int data ,n;
		try(Scanner sc=new Scanner (System.in)){
		
			do {
		
			System.out.print("enter the data =");
			data=sc.nextInt();
			Node newNode=new Node(data);

		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else {
			
			System.out.println("enter position to add at 1.begining \n"
					+ "2.end \n"
					+ "3.at specific position");
			
			switch(sc.nextInt()) {
			case 1:
			
			newNode.next=head;
			head=newNode;
			tail.next=head;
			break;
			case 2:
				tail.next=newNode;
				tail=newNode;
				newNode.next=head;
				break;
			case 3:
				System.out.println("enter the position to enter");
				n=sc.nextInt();
				Node temp1=head;
				for(int i=1;i<n-1;i++) {
					temp1=temp1.next;
					newNode.next=temp1.next;
					temp1.next=newNode;
				}
				break;
				
			}
			
		
		}
		System.out.println("press 1 for enter data again");
		n=sc.nextInt();
			
			}while(n==1);
		
		
	}}
	
	public void CirLdelete() {
	int n;
		try(Scanner sc=new Scanner (System.in)){
		
			do {

				if (head == null) {

				} else {

					System.out.println(
							"enter position to delete at 1.begining \n" + "2.end \n" + "3.at specific position");
			
			switch(sc.nextInt()) {
			case 1:
				Node temp=head;
				temp=temp.next;
				head=temp;
				tail.next=head;
			
			break;
			case 2:
				Node temp1=head;
				Node ptr=temp1.next;
				while(temp1!=head) {
					temp1=ptr;
					ptr=ptr.next;
				}
				tail=temp1;
				break;
			case 3:
				int position;
				System.out.println("enter the position to enter");
				position=sc.nextInt();
				Node temp2=head;
				Node ptr1=temp2.next;
				for(int i=1;i<position-1;i++) {
					temp2=ptr1.next;
					ptr1=ptr1.next;
					
				}
				temp2.next=ptr1.next;
				break;
				
			}
			
		
		}
		System.out.println("press 1 for entering data again");
		n=sc.nextInt();
			
			}while(n==1);
		
		
	}}
//		

	
	public void traverseCirL() {
		Node temp=head;
		if(head==null) {
			System.out.println("no linked list");
		}else {
			System.out.print("printing data of linkedlist ==");
			while(temp.next!=head) {
			System.out.print(temp.data+" ");
			
			temp=temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		
		CircularList cl=new CircularList();
	 cl.CirLcreate();
	 cl.CirLdelete();
	 cl.traverseCirL();
		
	}

}
