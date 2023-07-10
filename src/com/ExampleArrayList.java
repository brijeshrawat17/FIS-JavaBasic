package com;


import java.util.*;

public class ExampleArrayList {
	
	
	 public static void main(String args[]){    
	     
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");   
		  al.add(4,"Sachin");
		  al.add(0,"b");
	
		 
		  al.forEach(
		            (element) -> System.out.print(element + " "));
		    
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");    
		
		  //  al.addAll(al2);
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);  
		  
		  al.forEach((element)->{
			  System.out.println(element);
		  });

}
}