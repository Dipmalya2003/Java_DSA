package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class prob_17 {
	static void swapInArray(int[]arr,int i, int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
		
	}
	static void reverseArray(int[] arr) {
		int i=0, j=arr.length-1;
		while(i<j) {
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	static void PrintArray(int[] arr) {
		for(int i=0 ;i>arr.length;i++) {
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
	    PrintArray(arr);
	}

}
