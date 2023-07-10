package com;
import java.util.*;
public class ExampleHashset {
	
	
	  
	  
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	  HashSet<String> set=new HashSet<String>();  
	  set.add("Ravi");  
	  set.add("Vijay");  
	  set.add("Ravi");  
	  set.add("Ajay");  
	  set.add("Ajay"); 
	  //Traversing elements  
	 
	  for(String out :set)
	  {
	  
	  System.out.println("Hashset: "+out);  
	  }

}}
