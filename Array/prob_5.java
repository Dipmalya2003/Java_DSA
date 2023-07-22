package Array;
import java.util.*;
public class prob_5 {
	static boolean isSorted(int [] arr) {
		boolean check = true;
		for(int i=0 ;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					check=false;
					break;
				}
			}
			}
		return check;
		}
	static boolean isSorted_2(int [] arr) {
		boolean check = true;
		for(int i=1 ;i<arr.length;i++) {
			
				if(arr[i]<arr[i-1]) {
					check=false;
					break;
				}
			}
			
		return check;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(isSorted(arr));
		System.out.println(isSorted_2(arr));
	}

}
