package Array;

import java.util.Scanner;

public class prob_9_tripletsum {
	static int tripletsum(int[]arr,int x) {
		int count=0;
		for(int i=0 ;i<arr.length-2;i++) {
			for(int j= i+1;j<arr.length-1;j++) {
				for(int k= j+1 ;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
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
		System.out.println(tripletsum(arr, x));
	}

}
