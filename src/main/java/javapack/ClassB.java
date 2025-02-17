package javapack;

public class ClassB extends ClassA {

	public void run()
	{
		System.out.println("In child Class");
		

	}
	
	public static void main(String[] args) 
	{
	ClassB obj2= new ClassB();
	obj2.run();
	ClassA obj1= new ClassA();
	obj1.run();

	}

}
