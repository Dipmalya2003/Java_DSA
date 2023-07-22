package Array;

import java.util.Scanner;

public class prob_3 {

	static int lastoccurrence(int [] arr,int x) {
		int lastIndex=-1;
		for(int i=0 ;i<arr.length;i++) {
			
			if(arr[i]==x) { 
				
					lastIndex=i;
				
				
			}
			
		}
		
		return lastIndex;
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
		int ans = lastoccurrence(arr_1, x);
		if (ans==-1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println(ans);
		}
}
}
