package Array;

import java.util.Scanner;

public class prob_20_Nquery {
	static int[] makeFrequencyArray(int[] arr){
		int[] freq = new int[100005];
		for(int i=0 ; i< arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[]freq= makeFrequencyArray(arr);
		int q = sc.nextInt();
		while(q>0) {
			System.out.println("Enter number to be searched:");
			int x = sc.nextInt();
			if(freq[x]>0) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");
			}
			q--;
		}
		
	}

}
