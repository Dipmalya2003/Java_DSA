package Array;

import java.util.Scanner;

public class prob_25_prefixsumquery1based {
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] Prefixsum(int [] arr) {
		int n = arr.length;
		
		for(int i=1;i<n;i++)
			arr[i]=arr[i]+arr[i-1];
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int [] arr = new int[n+1];
		for(int i=1 ;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		Print(arr);

		int[]prefsum= Prefixsum(arr);
		System.out.println("Enter number of queries:");
		int q =sc.nextInt();
		
		while(q-->0) {
			System.out.println("Enter the range:");
			int l =sc.nextInt(),r=sc.nextInt();
			int ans= prefsum[r]-prefsum[l-1];
			System.out.println("Sum"+ ans);
			
		}
		
	}

}
