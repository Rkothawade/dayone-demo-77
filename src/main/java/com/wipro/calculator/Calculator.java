package com.wipro.calculator;

import java.util.Scanner;

public class Calculator {
 
	public static void main(String args[]){
		
     Scanner scan=new Scanner(System.in);
		
	
	int numberOne,numberTwo;
	System.out.println("Enter No one");
	numberOne=scan.nextInt();
	System.out.println("Enter No two");
	numberTwo=scan.nextInt();
	
	int result=numberOne+numberTwo;
	System.out.println("Addition of two nos is:= "+result);
	
	}
	
	
	
}
 