package Array;

import java.util.Scanner;

public class prob_11 {
	static int findMax(int[] arr){
		int mx = Integer.MIN_VALUE;
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]>mx) {
				mx =arr[i];
			}
		}
		return mx;
	}
	static int secondMax(int[] arr) {
		int mx= findMax(arr);
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]== mx) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int second_Max=findMax(arr);
		return second_Max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(secondMax(arr));
	}
}
