package Array;
import java.util.Scanner;
public class main_3 {
	
	
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
		int[] arr_2 = arr;
		printArray(arr_2);
//		changing some values of arr_2
		arr_2[0]=5;
		arr_2[1]=0;
		System.out.println("original array after changing arr_2");
		printArray(arr);
		System.out.println("copied arr_2 after changing arr_2 ");
		printArray(arr_2);	
		
//		cloning an array
		
		int[] arr_3= arr.clone();
		arr_3[0]=9;
		arr_3[1]=0;
		System.out.println("original array after cloning arr_3");
		printArray(arr);
		System.out.println("copied arr_2 after cloning arr_3 ");
		printArray(arr_3);	
		}
	}


