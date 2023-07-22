package Array;

import java.util.Scanner;

public class prob_24_prefixorruningSum {
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int[] Prefixsum(int [] arr) {
		int n = arr.length;
		int[]pref = new int[n];
		pref[0]=arr[0];
		for(int i=1;i<n ;i++) {
			pref[i]=pref[i-1]+arr[i];
		}
		return pref;
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
		int ans[]=Prefixsum(arr);
		Print(ans);
		
	}

}
