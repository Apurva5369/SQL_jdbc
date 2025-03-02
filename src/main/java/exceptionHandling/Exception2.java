package exceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		 
		try {
		int x = numbers[5]; 
		System.out.println(x);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
		System.out.println("Array index is out of bounds");
		}

		String str = "Hello, World!";
        try
        {
        char ch = str.charAt(20); 
        }
        
        catch(StringIndexOutOfBoundsException e)
        {
        System.out.println("String index out of bound exception");
        }
		
	}

}
