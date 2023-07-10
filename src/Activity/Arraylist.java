package Activity;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
	 public static void main(String args[]){    
	     
		  List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Red");//adding object in arraylist    
		  al.add("Bue");    
		  al.add("Green");    
		  al.add("Purple");   
		  al.add("White");
		 
	
		 
		  al.forEach(
		            (element) -> System.out.print(element + " "));
		  System.out.println("");
		  System.out.println("===============================================================================");
		  al.remove(3);
		  al.forEach(
		            (element) -> System.out.print(element + " "));
	 }

}
