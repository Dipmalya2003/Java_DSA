package Array;

import java.util.Scanner;

public class prob_26_suffixsum {
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int FindArraysum(int[]arr) {
		int totalSum=0;
		for(int i=0 ;i<arr.length;i++) {
			totalSum+=arr[i];
		}
		return totalSum;
	}
	static boolean equalSumPartition(int [] arr) {
		int totalsum=FindArraysum(arr);
		int i =0;
		int n = arr.length;
		int prefsum=0,sufsum=0;
		while(i<n) {
			 prefsum+=arr[i];
			 sufsum=totalsum-prefsum;
			 if(prefsum==sufsum) {
				 return true;
			 }
			 i++;
		}
		return false;
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
		System.out.println(FindArraysum(arr)); 
		System.out.println("Equal Partition Possible:"+equalSumPartition(arr));
		
	}

}
