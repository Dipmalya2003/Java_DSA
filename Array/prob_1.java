package Array;

class Array_1 {
	void sumOfArray() {
		int[]arr = {1,4,5,6,1};
		int sum=0;
		
		for (int i=0 ;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum);
	}
	void maxOfArray() {
		int[] arr= {5, 3, 6, 2, 8 ,4};
		int ans=0;
		for(int i=0 ;i<arr.length;i++) {
			if(arr[i]>ans) {
				ans=arr[i];
			}
		}
		System.out.println(ans);
		
	}
	void searching() {
		int[] arr= {5, 3, 6, 2, 8 ,3,4};
		int n = 10;
		int ans =-1;
		for (int i = 0 ;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(i);
			break;
			}
			
			
		}
		System.out.println(-1);
//		if(ans==-1) {
//			System.out.println("not found");
//		}
//		else {
//		System.out.println(ans);
//		}
		
	}
}
public class prob_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_1  obj = new Array_1();
		obj.sumOfArray();
		obj.maxOfArray();
		obj.searching();
	}

}
