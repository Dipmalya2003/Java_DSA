package Array;

import java.util.Scanner;

public class prob_22_OddEvenSort {
	static void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	static void OddEvenSort(int arr[]) {
		int n= arr.length;
		int left=0,right=n-1;
		
		while(left<right) {
			if(arr[left]%2!=0 && arr[right]%2== 0) {
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]%2==0)
				left++;
			if(arr[right]%2!=0)
				right--;
				
		}
		
	}
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int [] arr = new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		Print(arr);
		OddEvenSort(arr);
		System.out.println("Sorted Array:");
		Print(arr);
		
	}

}
