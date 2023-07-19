package selectionSort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			
			System.out.println("enter the size of array");
			int BS[]=new int[sc.nextInt()];
			System.out.println("enter the elements");
			for(int i=0;i<BS.length;i++) {
				BS[i]=sc.nextInt();
			}
			
			for(int i=0;i<BS.length-1;i++) {
				int  smallest=i;
				for(int k=i+1;k<BS.length;k++) {
					
					if(BS[k]<BS[smallest]) {
						smallest=k;
					}
					
				}
				int temp=BS[i];
				BS[i]=BS[smallest];
				BS[smallest]=temp;
				
			}
			
			for(int i=0;i<BS.length;i++) {
				System.out.print(BS[i]+" ");
				
			}

	}

}
}