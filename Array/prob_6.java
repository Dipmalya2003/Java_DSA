package Array;

import java.util.Arrays;
import java.util.Scanner;

public class prob_6 {
	static int[] smallestAndLargestElement(int[]arr) {
		
		Arrays.sort(arr);
		int[]ans= {arr[0],arr[arr.length-1]};
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i:smallestAndLargestElement(arr)) {
			System.out.print(i+" ");
		}
	}

}
