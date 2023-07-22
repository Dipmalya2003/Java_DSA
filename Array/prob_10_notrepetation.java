package Array;

import java.util.Scanner;

public class prob_10_notrepetation {
	static int notrepeat(int[]arr) {
		
		for(int i=0 ;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
//		int ans = 0;
//		for(int i= 0 ;i<arr.length;i++) {
//			if(arr[i]!= -1) {
//				ans=arr[i];
//			}
//		
        int ans= 0;
        for(int i= 0 ;i<arr.length;i++) {
        	if(arr[i]>0) {
        		ans= arr[i];
        	}
        }
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]arr= new int[n];
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(notrepeat(arr));
	}

}
