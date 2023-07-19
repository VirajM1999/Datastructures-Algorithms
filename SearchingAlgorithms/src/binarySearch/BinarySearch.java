package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter the size of array");
			int BS[]=new int[sc.nextInt()];
			System.out.println("enter the elements");
			for(int i=0;i<BS.length;i++) {
				BS[i]=sc.nextInt();
			}
			Arrays.sort(BS);
			int begin=0,end,mid=0;
			boolean flag=false;
			end=BS.length-1;
			System.out.println("enter the item to search");
			int item=sc.nextInt();
			while(begin<=end) {
				
				mid=(begin+end)/2;
				if(item==BS[mid]) {
					flag=true;
					break;
					}
				
				else if(item>BS[mid]) {
					begin=mid+1;
				}
				else if(item<BS[mid]) {
					end=mid-1;
				}
			}
			if(flag==false) {
				System.out.println("item does not exist");
			}
			else
				System.out.println("item "+item+" exist at position ="+mid);
			
			
		}
		
	}

}
