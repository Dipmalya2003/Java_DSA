package Array;

import java.util.Scanner;

public class prob_21_sorting0and1 {
	static void swap(int arr[],int i ,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void Sort(int [] arr) {
		int n = arr.length;
		int left= 0;
		int right= n-1;
		
			while(left<right) {
			if(arr[left]==1 && arr[right]==0) {
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]==0)
				left++;
			if(arr[right]==1)
				right--;
		}
	}
			
	static void Print(int []arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" "); 
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:");
		Print(arr);
		Sort(arr);
		System.out.println("Sorted array:");
		Print(arr);
	}

}
