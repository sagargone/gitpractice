package com.Program;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		System.out.println("Eneter first Num");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("Enter Second Num");
		int num2=sc.nextInt();
		int Sub=0;
		Sub=num1-num2;
		System.out.println(Sub);

	}

}
