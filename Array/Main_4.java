package Array;

public class Main_4 {
	
	static void change_array(int[]arr) {
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=0;
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0 ;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[3];
		arr[0]= 5;
		arr[1]= 6;
		arr[2]= 7;
		 change_array(arr);
		 printArray(arr);
	}

}
