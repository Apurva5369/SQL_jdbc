package javapack;

public class Exception {

	public static void main(String[] args)
	{
		System.out.println("Program Started");
		try
		{
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		
		}
		
				
		catch (ArithmeticException e)
		{
			System.out.println("Arithmatic Exception founf");
		}
		
		
		try
		{
		String e=null;
		int strlen = e.length();
		System.out.println(strlen);
		
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Null pointer Exception found in above code");
		}
		
		try
		{
			int arr[]= {10,30,46};
			System.out.println(arr[6]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" ArrayIndexOutofBound Exception found in above code");
		}
		
		try
		{
			String name="Files";
			System.out.println(name.charAt(10));
		}
		
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndex Exception found in above code");
		}
			


		
		System.out.println("Program Finished");


	}


}
