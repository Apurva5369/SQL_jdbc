package javapack;

public class Bird implements Swim, Flyable 
{

	public void fly() {
		System.out.println("Currently Flying");
		
	}

	public void swim() {
		System.out.println("Currently Swimming");
		
	}

}
