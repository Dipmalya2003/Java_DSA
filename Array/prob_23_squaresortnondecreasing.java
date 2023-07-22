package Array;

import java.util.*;

public class prob_23_squaresortnondecreasing {
	static void Print(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void swap(int []arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
	}
	static void reverse(int[] arr) {
		int i=0 ,j= arr.length-1;
		while(i<j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	static int[] Sort(int[]arr) {
		int n =arr.length;
		int left=0 ,right=n-1;
		int ans[]=new int[n];
		int k=n-1;
		while(left<=right) {
			if(Math.abs(arr[left])>Math.abs(arr[right])) {
				ans[k--]=arr[left]*arr[left];
				left++;
			}
			else {
				ans[k--]= arr[right]* arr[right];
				right--;
			}

		}
//		reverse(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int [] arr = new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		Print(arr);
		int ans[] =Sort(arr);
		
		System.out.println("Sorted Array:");
		Print(ans);
		
	}

}
