package Bubblesort;

public class Bubblesort {
   //time complexity =O(n^2)
	public static void main(String[] args) {
		int arr[]= {5, 2, 8, 1, 9, 3, 7, 4, 6, 10, 15, 12, 18, 11, 20, 
				25, 22, 28, 21, 30, 35, 32, 38, 31, 40, 45, 42, 48, 41, 
				50, 55, 52, 58, 51, 60, 65, 62, 68, 61, 70, 75, 72, 78, 
				71, 80, 85, 82, 88, 81, 90};
		
		   
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
