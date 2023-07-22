package Array;

import java.util.Arrays;
import java.util.Scanner;

public class prob_7 {
	static int[] kthsmallestAndLargestElement(int[]arr,int k) {
		Arrays.sort(arr);
		int[]ans = {arr[k-1],arr[arr.length-(1+(k-1))]};
		
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
		int k = sc.nextInt();
		for(int i :kthsmallestAndLargestElement(arr, k))
			System.out.print(i+" ");
		
	}

}
