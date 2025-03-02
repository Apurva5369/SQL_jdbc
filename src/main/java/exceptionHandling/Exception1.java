package exceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First num:-");
	int a=sc.nextInt();
	System.out.println("Enter Second num:-");
	int b=sc.nextInt();
	
	System.out.println("First num:-"+a);
	System.out.println("First num:-"+b);
	try
	{
	int c=a/b;
	System.out.println(c);
	}
	catch(ArithmeticException e)
	{
	System.out.println(" Invalid Data");
	}
	}
}
