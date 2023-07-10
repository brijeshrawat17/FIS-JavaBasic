package com;

public class JavaException {

	public static void WithoutTry()
	{
		    
		      //code that may raise exception  
		      int data=100/0;  
		
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		   
		
	}
	public static void WithTry()
	{
		  try{  
		      //code that may raise exception  
		      int data=100/0;  
		   }catch(ArithmeticException e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		int a=10;
		int b=11;
		System.out.println(a+b);
		
	}
	
	
	public static void throwNotEligible(int age) {
if(age<18)
	    // throw an exception
	    throw new ArithmeticException("Not eligible to vote");  

	else
	
		System.out.println("eligible to vote");
	}

		  public static void main(String args[])
		  {  
			// WithoutTry();
			  WithTry();
			 // throwNotEligible(17);
		  }  
		
}
