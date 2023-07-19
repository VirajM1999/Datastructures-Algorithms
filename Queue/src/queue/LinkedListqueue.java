package queue;
import java.util.Scanner;
class QueueLinkedL{
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	Node f=null;
	Node r=null;
	

	public void enqueue(Scanner sc) 
	{
		System.out.println("enter the data");
		Node newNode=new Node(sc.nextInt());
			if(f==null) {
				f=newNode;
				r=newNode;
			}
			else {
				r.next=newNode;
				r=newNode;
		}
	}

	public void dequeue() {
		if(f==null &&r==null) {
			System.out.println("underflow linkedlist");	
		}
		else {
			f=f.next;
		}	
	}

	public void display() {
			Node temp=f;
			while(temp!=null) {
				System.out.println("items are " +temp.data);
				temp=temp.next;
				
			}
		
	}
	
}

public class LinkedListqueue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QueueLinkedL ql=new QueueLinkedL();
		boolean flag=false;
		while(!flag) {
			System.out.println("press 1.to enqueue\n"
					+ "2.to dequeue \n"
					+ "3.display"
					+ "4.exit");
			switch (sc.nextInt()) {
			case 1:
				ql.enqueue(sc);
				
				break;
			case 2:
				ql.dequeue();
				break;
			case 3:
				ql.display();
				break;
			case 4:
				flag=true;
				break;
			
			}
		} 
		

	}

}
