package exceptionHandling;

import java.util.ArrayList;

public class ListToString {

	public static void main(String[] args) {
		ArrayList<String> languages= new ArrayList<String>();

	   
	    languages.add("Agastya");
	    languages.add("Manas");
	    languages.add("Apurva");
	    System.out.println("ArrayList: " + languages);

	    String arraylist = languages.toString();
	    System.out.println("String: " + arraylist);
	}

}