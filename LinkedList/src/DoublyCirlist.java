import java.util.Scanner;




public class DoublyCirlist {
	
	

	static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void LLcreate() {
		int data ,n;
		try(Scanner sc=new Scanner (System.in)){
		
			do {
		
			System.out.print("enter the data =");
			data=sc.nextInt();
			Node newNode=new Node(data);

		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			
			System.out.print("enter position to add at 1.begining \n"
					+ "2.end \n"
					+ "3.at specific position");
			Node temp=head;
			switch(sc.nextInt()) {
			case 1:
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			
			break;
			case 2:
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
				break;
			case 3:
				System.out.print("enter the position to enter");
				n=sc.nextInt();
				Node ptr=temp.next;
				for(int i=1;i<n-1;i++) {
					temp=ptr;
					ptr=ptr.next;
					
				}
				newNode.prev=temp;
				newNode.next=ptr;
				temp.next=newNode;
				ptr.prev=newNode;
				break;
				
			}
			
		
		}
		System.out.print("press 1 for entering data again");
		n=sc.nextInt();
			
			}while(n==1);
		
		
	}}
	
	public void DoublyCirLdelete() {
		int delete,c;
			try(Scanner sc=new Scanner (System.in)){
				
				do {
	
					if (head == null) {
						System.out.print("no linked list present");
	
					} else {
	
						System.out.print(
								"enter position to delete at 1.begining \n" + "2.end \n" + "3.at specific position");
						 c=sc.nextInt();
						Node temp=head;
				switch(c) {
				case 1:
					
					temp=temp.next;
					head=temp;
					head.prev=null;
				break;
				case 2:
					Node temp1=tail;
					temp1=temp1.prev;
					temp1.next=null;
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
					ptr1.next.prev=temp2;
					break;
					
				}
				
			
			}
			System.out.println("press 1 for delete data again");
			delete=sc.nextInt();
				
				}while(delete==1);
			
			
		}}
	
	
	public void traverseLL() {
		Node temp=head;
		if(head==null) {
			System.out.println("no linked list");
		}else {
			System.out.print("printing data of linkedlist ==");
			while(temp!=null) {
			System.out.print(temp.data+" ");
			
			temp=temp.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		DoublyCirlist cl=new DoublyCirlist();
	 cl.LLcreate();
cl.DoublyCirLdelete();
	 cl.traverseLL();
		
	}

	
	
	
}
	
	
	