import java.util.Scanner;

public class BasicLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;

	public void LLcreate() {
		int data ,n;
		Scanner sc=new Scanner (System.in);
		
			do {
		
			System.out.print("enter the data =");
			data=sc.nextInt();
			Node newNode=new Node(data);

		if(head==null) {
			head=newNode;
		}
		else {
			
			System.out.print("enter position to add at 1.begining \n"
					+ "2.end \n"
					+ "3.at specific position");
			
			switch(sc.nextInt()) {
			case 1:
			
			newNode.next=head;
			head=newNode;
			break;
			case 2:
				Node temp=head;
				while(temp.next!=null) {
				temp=temp.next;
				}
				temp.next=newNode;
				break;
			case 3:
				System.out.print("enter the position to enter");
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
		System.out.print("press 1 for entering data again");
		n=sc.nextInt();
			
			}while(n==1);
			sc.close();
		
		
	}

	public void traverseLL() {
		Node temp = head;
		if (head == null) {
			System.out.print("no linked list");
		} else {
			System.out.print("printing data of linkedlist ==");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	public void sorting() {
		int cnt = 0;
		if (head != null) {
			Node temp = head;
			while (temp != null) {
				temp = temp.next;
				cnt++;
			}
		}
		System.out.println("no of nodes " + cnt);
		for (int i = 0; i < cnt; i++) {
			Node temp = head;
			Node temp1 = temp.next;
			for (int j = 0; j < cnt - 1; j++) {
				int t = 0;
				if (temp.data > temp1.data) {
					t = temp.data;
					temp.data = temp1.data;
					temp1.data = t;
				}
				temp = temp1;
				temp1 = temp1.next;
			}
		}
		System.out.println("sorted array ");

		Node temp2 = head;
		while (temp2 != null) {
			System.out.print(temp2.data + " ");
			temp2 = temp2.next;
		}
	}

//	public void  mergesorting() {
//		Node temp=head;
//		if(temp==null ||temp.next==null) {
//			System.out.println("no linkedlist");
//		}
//		Node trav=head;
//		Node slow=head;
//		Node fast=head;
//		if(fast!=null && fast.next!=null) {
//			trav=slow;
//			slow=slow.next;
//			fast=fast.next.next;
//		}
//		trav.next=null;
//		Node left=mergesorting();
//		 Node right=mergesorting();
//		merge(left,right);
//	}
//	
//	public void merge(Node l1,Node l2) {
//		
//		Node sortedtemp= new Node(0);
//		Node currenttemp=sortedtemp;
//		while(l1!=null &&l2!=null) {
//			if(l1.data<l2.data) {
//				currenttemp=l1;
//				l1=l1.next;
//			}
//			else {
//				currenttemp=l2;
//			l2=l2.next;
//			}
//			currenttemp=currenttemp.next;
//		}
//		
//		if(l1!=null) {
//			currenttemp=l1;
//			l1=l1.next;
//		}
//		if(l2!=null) {
//			currenttemp=l2;
//			l2=l2.next;
//		}
//		
//		while (sortedtemp != null) {
//			System.out.print(sortedtemp.data + " ");
//			sortedtemp = sortedtemp.next;
//		}
//	}
	public void deleteLinkedlist() {
		int x, y;
		Scanner s = new Scanner(System.in);
		do {
			if (head == null) {
				System.out.print("no linkedlist");
			} 
			 else {
				System.out.print("enter the position to delete \n" + "1.from the beginning \n" + "2.from end \n"
						+ "3.from specific position ");
				
				y = s.nextInt();
				switch (y) {
				case 1:
					Node temp = head;
					temp = temp.next;
					head = temp;

					break;
				case 2:
					Node temp1 = head;
					Node trav = temp1.next;
					while (trav.next != null) {
						temp1 = trav;
						trav = trav.next;
					}
					trav.next = null;

					break;
				case 3:
					int pos;
					System.out.print("enter the specific position to delete");
					pos = s.nextInt();
					Node temp2 = head;
					Node trav1 = temp2.next;
					for (int i = 1; i < pos-1; i++) {
						temp2 = trav1;
						trav1 = trav1.next;
					}
					temp2.next = trav1.next;
					break;
				}
			}
			System.out.print("press 1  continue deleting");
			x = s.nextInt();
		} while (x == 1);

		Node temp2 = head;
		while (temp2 != null) {
			System.out.print(temp2.data + " ");
			temp2 = temp2.next;
		}
		s.close();

	}

	public static void main(String[] args) {

		BasicLinkedList ll = new BasicLinkedList();
		ll.LLcreate();

//	ll.deleteLinkedlist();
		ll.traverseLL();
//	 ll.sorting();

	}

	// 1.Get all data and store it in array.
	// 2.Sort the array.
	// 3.Create new linked list from sorted array.

}
