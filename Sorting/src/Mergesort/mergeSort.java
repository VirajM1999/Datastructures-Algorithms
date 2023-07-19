package Mergesort;

public class mergeSort {
	//nlogn
	public static void conquer(int a[],int start,int mid,int end) {
		int merge[]=new int[end-start+1];
		
		int idx1=start;
		int idx2=mid+1;
		int x=0;
		
		while(idx1<=mid && idx2 <=end) {
			if(a[idx1] <=a[idx2]) {
				merge[x++]=a[idx1++];
			}else
				merge[x++]=a[idx2++];
		}
		
		while(idx1<=mid) {
			merge[x++]=a[idx1++];
		}
		
		while(idx2<=end) {
			merge[x++]=a[idx2++];
		}
		
		
		for(int i=0,j=start;i<merge.length;i++,j++) {
			a[j]=merge[i];
		}
	}
	
	
	public static void divide(int a[],int start,int end) {
		
		if(start >=end) {
			return;
		}
		
			int mid=start+(end-start)/2;
			divide(a,start,mid);
			divide(a,mid+1,end);
			conquer(a,start,mid,end);
		}
		
	

	public static void main(String[] args) {
		int arr[]= {5, 2, 8, 1, 9, 3, 7, 4, 6, 10, 15, 12, 18, 11, 20, 
				25, 22, 28, 21, 30, 35, 32, 38, 31, 40, 45, 42, 48, 41, 
				50, 55, 52, 58, 51, 60, 65, 62, 68, 61, 70, 75, 72, 78, 
				71, 80, 85, 82, 88, 81, 90};
		int n=arr.length;
		
		for(int j=0;j<n;j++) {
			 System.out.print(arr[j]+" ");
		}
		divide(arr, 0, n-1);
		
		System.out.print("\nafter sorting \n");
		for(int j=0;j<arr.length;j++) {
			 System.out.print(arr[j]+" ");
		}
	}

}
