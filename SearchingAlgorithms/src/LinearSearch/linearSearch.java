package LinearSearch;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int[] arr=new int[sc.nextInt()];
		int i=0;
		while(i<arr.length) {
			System.out.println("enter the elemnets");
			arr[i]=sc.nextInt();
			i++;
			
		}
		System.out.println("enter the item to be searched");
		int item=sc.nextInt();
		boolean flag=false;
		for(int j=0;j<arr.length-1;j++) {
		if(arr[j]==item) {
			
			flag=true;
			break;
		}
	}
		if(flag==true)
			System.out.println("items exits");
		else
			System.out.println("items does not exists!!!");
		sc.close();
	}
}
