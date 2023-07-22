package Array;


class array {
	void looparr(){
		int[] ages =new int[3];
		float[] weight = new float[3];
		String[] names =new String[3];
		String[] names_1 = {"rahul","raj","dip","vaishali"};
		
		ages[0]=34;
		ages[1]= 12;
		ages[2]= 45;
//		for loop
		for (int i=0 ;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
	
//	for each loop
	for(int age:ages) {
		System.out.println(age);
	}
	
	int i=0;
	while(i<ages.length) {
		System.out.println(ages[i]);
		i++;
	}
	
}
	
	void multi_arr() {
		int[][] arr = {{56,43,6},{34,7},{12,56,8}};
		
		for (int i=0 ;i<arr.length;i++) {
			for (int j=0 ;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
//			System.out.println();
		}
	}
}
public class Main_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array obj =new array();
//		obj.looparr();
		obj.multi_arr();
	}

}
