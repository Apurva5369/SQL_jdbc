package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception4 {

	public static void main(String[] args)  
	{
		System.out.println("Open a file");
		try
		{
		FileInputStream file=new FileInputStream("C://Abcde.t");
		
		}
		catch(FileNotFoundException e)
		{
		System.out.println("File not found");
		}
		}

	}


