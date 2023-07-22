package Array;

class ArrayExample{
	void demoArrays() {
		int[] ages =new int[3];
		float[] weight = new float[3];
		String[] names =new String[3];
		String[] names_1 = {"rahul","raj","dip","vaishali"};
		
		ages[0]=34;
		ages[1]= 12;
		ages[2]= 45;
//		ages[5]= 45;out of bounce
//		ages[-1]=3;		
		
		
			System.out.println(ages[0]);
			System.out.println(ages[1]);
			System.out.println(ages[2]);
			
			System.out.println(names_1[0]);
			System.out.println(names_1[1]);
			System.out.println(names_1[2]);
			
			System.out.println(ages.length);
			System.out.println(weight.length);
			System.out.println(names_1.length);
		
	}
	
	void multiArrays() {
		int[][] arr_1 =new int[5][3];
		int[][] arr = {{56,43,6},{34,7,8},{12,56,8}};
		int [][][]arr_3=new int [5][3][2];
		
		arr_3[0][0][0]=1;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample obj =new ArrayExample();
		obj.demoArrays();
		obj.multiArrays();

	}

}
