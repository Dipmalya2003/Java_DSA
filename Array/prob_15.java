package Array;

import java.util.Scanner;

public class prob_15 {
	static void swap(int a,int b) {
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int a = sc.nextInt();
	       int b= sc.nextInt();
	       swap(a, b);
	}

}
