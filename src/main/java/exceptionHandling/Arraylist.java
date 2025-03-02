package exceptionHandling;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("ArrayList: " + list); 
        System.out.println("Size of ArrayList =" + list.size()); 
        
        list.clear();
        System.out.println("ArrayList: " + list); 
        System.out.println("Size of ArrayList =" + list.size()); 
	}

}
