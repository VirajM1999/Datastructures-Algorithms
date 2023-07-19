package queue;

import java.util.Scanner;
class queue{
	int front=-1;
	int rear=-1;
	int[] queue=new int[10];
	
	void enqueue(Scanner sc) {
		if(rear==queue.length-1) {
			System.out.println("quueue is overflow");
		}
		else {
			System.out.println("enter the data");
			int data=sc.nextInt();
			if(front==-1 && rear==-1) {
				rear=0;
				front=0;
				queue[rear]=data;
			}
			else {
				rear++;
				queue[rear]=data;
			}
	}
	}
	void dequeue() {
		if(front==-1 &&rear==-1) {
			System.out.println("undeflow queue");
		}
		else {
			front++;
		}
	}
		
	void display() {
		
		System.out.println("queue is ");
		for(int i=front;i<=rear;i++) 
			System.out.println(queue[i] +"");
		
	}
	
}

public class StackQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		queue s=new queue();
			

			
			int l;
			do {
				System.out.println("press 1.to push\n "
						+ "2.to pop \n"
						+ "3.display");
				switch(sc.nextInt()) {
				case 1:
					s.enqueue(sc);
					break;
				case 2:
					s.dequeue();
					break;
				case 3 :
					s.display();
					break;
				}
			
				System.out.println("press 0 to process again");
				l=sc.nextInt();
			}while(l==0);
				
			}

	}

