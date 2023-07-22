package Array;

import java.util.Scanner;

public class prob_16_reversearray {
	static void reverseArray(int []arr) {
		for(int i=arr.length-1 ;i>=0;i--) {
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
		reverseArray(arr);
	}

}
