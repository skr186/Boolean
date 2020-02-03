package com.smtech;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a No.: " );
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		Boolean xyz = abc(a);
		System.out.println(xyz);
	}
	
	public static Boolean abc(int a) {
	
		if(a>5){
			return true;
		}else {
			return false;
		}
		
	}

}
