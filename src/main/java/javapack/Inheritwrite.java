package javapack;

import java.util.Scanner;

public class Inheritwrite extends InheritRead 
{
	
	
	public void write()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Write Something");
		String a=sc.nextLine();
	}

	public static void main(String[] args)
	{
		Inheritwrite obj=new Inheritwrite();
		obj.write();
		obj.read();

	}

}
