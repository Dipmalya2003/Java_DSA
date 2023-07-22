package Array;

import java.util.Scanner;

public class prob_14 {
	static void swap(int a, int b) {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a is"+a);
		System.out.println("The value of b is "+b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b= sc.nextInt();
       swap(a, b);
	}

}
