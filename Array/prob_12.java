package Array;

import java.util.Scanner;

public class prob_12 {
	static int firstreapeat(int [] arr) {
		int ans=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1 ;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					ans=arr[i];
					break;
				}
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
		System.out.println(firstreapeat(arr));
	}

}
