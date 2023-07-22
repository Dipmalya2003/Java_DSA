package Array;

import java.util.Scanner;

public class prob_13 {
	static int lastreapeted(int[]arr) {
		int ans=-1;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ans= arr[i];
				}
			}
		}
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
		System.out.println(lastreapeted(arr));
	}

}
