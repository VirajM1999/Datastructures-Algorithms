package insertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter the size of array");
			int arr[]=new int[sc.nextInt()];
			System.out.println("enter the elements");
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			
			for(int j=1;j<arr.length;j++) {
				int current=arr[j];
				int k=j-1;
				while(current<arr[k] && k>-1) {
					arr[k+1]=arr[k];
					k--;
					
				}
				arr[k+1]=current;
			}

			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				
			}
	
		} 
	}
}
