package com.java;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,add;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1 = sc.nextInt();
		System.out.println("Enter num2");
		num2 = sc.nextInt();
		
		add = num1 + num2;
		System.out.println("Addition of two numbers are : "+add);
		
		
	}

}
