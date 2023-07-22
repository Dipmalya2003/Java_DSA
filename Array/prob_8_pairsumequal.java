package Array;

import java.util.Scanner;

public class prob_8_pairsumequal {

	static int pairSum(int[]arr,int x) {
		int count=0;
		for(int i=0 ;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]== x) {
				count+=1;
			}
		}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(pairSum(arr, x));
	}

}
