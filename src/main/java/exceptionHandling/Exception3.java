package exceptionHandling;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age-");
		int a=sc.nextInt();
		
		try
		{
		if(a>=18)
		System.out.println("Age is valid:-"+a);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
	           System.exit(1);
		System.out.println(" Invalid age! Please enter valid age");
		}
		}

	}


