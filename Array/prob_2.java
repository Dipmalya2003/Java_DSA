package Array;
import java.util.*;
public class prob_2 {
	
	static int occurrence(int [] arr,int x) {
		int count=0;
		for(int i=0 ;i<arr.length;i++) {
			
			if(arr[i]==x) {
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr_1 = new int[n];
		for(int i=0 ;i<arr_1.length;i++) {
			arr_1[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(occurrence(arr_1, x));
	}

}
