package quicksort;

import java.util.Scanner;

public class QuickSort {
//	int partition(int a[],int start,int end) { //  a<40 90 20 30 50 >   0 4/a<40 20 30 > 0 2
//		int pivot=a[end];           //90   30
//		int Pindex=start;           //0,1     
//		
//		for(int i=start;i<end;i++) {    //i=0,1,         2,       3     / i=0,     1       
//			if(a[i]<=pivot) {    //40<50   90<50       20<50   30<50    / 40</30  20<30
//				int t=a[Pindex]; //t=40	        	t=90       t=90     /		   t=40
//				a[Pindex]=a[i];		                //a<40 20 30 90 50> /
//				a[i]=t;			//a[i]=40			 a[i]=90    a[i]=90 /          a[i]=40
//				Pindex++;      //1 ,2 ,3                                /  1
//			}
//
//		}
//		int j=a[Pindex];      //j=90            j=40
//		a[Pindex]=a[end];     //a[p]=50
//		a[end]=j;			  //a[e]=90	       a[e]=40
//		return (Pindex);	  //3              //1
//	}
//	
//	void sort(int a[],int start,int end) {
//		if(start<end) {
//			int p=partition(a, start, end); //a 0  4  p=3 /   a<40 20 30>  0 2
//			sort(a,start,p-1);  // a<40 20 30>  0 2
//			sort(a,p+1,end); //  <90>  4 4
//			
//		}
//		
//	}
//	int partition(int a[],int start,int end) {
//		int pivot=a[end];
//		int pindex=start;
//		
//		for(int i=start;i<end;i++) {
//			if(a[i]<=pivot) {
//				int k=a[i];
//				a[i]=a[pindex];
//				a[pindex]=k;
//				pindex++;
//			}
//		}
//		int k=a[pindex];
//		a[pindex]=a[end];
//		a[end]=k;
//		
//		return pindex ;
//		
//	}
	public int partition(int a[],int start,int end) {
		int pivot=a[end];
		int pindex=start;
		
		for(int i=start;i<end;i++) {
			if(a[i]<=pivot) {
				int k=a[i];
				a[i]=a[pindex];
				a[pindex]=k;	
				pindex++;
			}
			
			
		}
	int y=a[pindex];
	a[pindex]=a[end];
	a[end]=y;
		return pindex;
	}
	public void sort(int a[],int start,int end) {
		if(start<end) {
			int p=partition(a,start,end);
			sort(a,start,p-1);
			sort(a,p+1,end);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		{

			int arr[]= {5, 2, 8, 1, 9, 3, 7, 4, 6, 10, 15, 12, 18, 11, 20, 25, 22, 28, 21, 
					30, 35, 32, 38, 31, 40, 45, 42, 48, 41, 
					50, 55, 52, 58, 51, 60, 65, 62, 68, 61, 70, 75, 72, 78, 71, 80, 85,
					82, 88, 81, 90};//5

			
			int n=arr.length;
			QuickSort q=new QuickSort();
			q.sort(arr, 0, n-1);  // 0 4
			
			//displaying
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
	}sc.close();

}
}
