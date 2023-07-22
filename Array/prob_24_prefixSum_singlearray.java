package Array;

import java.util.Scanner;

public class prob_24_prefixSum_singlearray {
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void Prefixsum(int [] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++)
			arr[i]=arr[i]+arr[i-1];
		
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
		Prefixsum(arr);
		Print(arr);
	}

}
