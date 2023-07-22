package Array;
import java.util.*;
public class prob_4 {
	static int countGreater(int[]arr,int x) {
		int count=0;
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]>x) {
				count++;
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(countGreater(arr, x));
	}

}
