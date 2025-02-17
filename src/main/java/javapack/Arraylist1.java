package javapack;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) 
	{
	ArrayList mylist = new ArrayList();
	
	mylist.add("Sunday");
	mylist.add("Monday");
	mylist.add("Tuesday");
	mylist.add("Wednesday");
	mylist.add("Thursday");
	mylist.add("Friday");
	
	System.out.println("Show data in Arraylist"+mylist);
	
	System.out.println("Show size of data in Arraylist "+mylist.size());
	
	System.out.println("Remove data in Arraylist "+mylist.remove(1));
	
	System.out.println("After Removing"+mylist);
	
	mylist.add(1,"Holiday");
	
	System.out.println("After Adding data in Arraylist"+mylist);

	mylist.set(1, "Vacation");
	
	System.out.println("After Adding data in Arraylist"+mylist);
	
	for(int i=0;i<mylist.size();i++)
	{
		System.out.println(mylist.get(i));
	}
	
	mylist.clear();
	
	System.out.println("after clearing the Arraylist"+mylist);
	}

}
