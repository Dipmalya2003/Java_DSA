package Array;

import java.util.Arrays;
import java.util.Scanner;

public class main_5 {

	
		static void printArray(int[] arr) {
			for(int i=0 ;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				
			}
			System.out.println();
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0 ;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				
			}
			System.out.println("Original array:");
			printArray(arr);
			System.out.println("copy array:");
//			Arrays.copyof(array,no.of element in array)
//			int[] arr_2 = Arrays.copyOf(arr,arr.length);
//			printArray(arr_2);
//			Arrays.copyofRange(array,no.of element in array)
			int[] arr_3 =Arrays.copyOfRange(arr, 1, 4);
//			changing some values of arr_2
//			arr_2[0]=5;
//			arr_2[1]=0;
			System.out.println("original array after changing arr_2");
			printArray(arr);
			System.out.println("copied arr_2 after changing arr_2 ");
			printArray(arr_3);	
			

	}

}
