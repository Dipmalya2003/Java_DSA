package Array;

import java.util.Scanner;

public class prob_18 {
	static int[] rotate(int[] arr , int k) {
		int n= arr.length;
		k =k%n;
		int[] ans= new int[n];
		int j=0;
		
		for(int i= n-k ;i<n ;i++) {
			ans[j++]=arr[i];
		}
		for(int i=0;i<n-k;i++) {
			ans[j++]=arr[i];
		}
		return ans;
		
	}
	static void printArray(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		int[]ans = rotate(arr, k);
		printArray(ans);
		
	}

}
