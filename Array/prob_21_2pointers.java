package Array;

import java.util.Scanner;
	

public class prob_21_2pointers {
	
	static void Print(int[]arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swap(int []arr,int i,int j) {
		int temp =  arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
	}
	
	static void sortZeroesAndOnes(int [] arr) {
		int zero=0;
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
			}
		}
		for(int i=0 ;i<arr.length;i++) {
			if(i< zero ) {
				arr[i]=0;
			}
			else {
				arr[i]=1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of elemnet in array:");
		int n= sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Input the array:");
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array:");
		Print(arr);
		
		sortZeroesAndOnes(arr);
		System.out.println("Sorted array:");
		Print(arr);
	}
}
