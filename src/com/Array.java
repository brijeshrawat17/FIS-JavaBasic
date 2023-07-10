package com;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		  
		   // create an array
		int[] num = new int[5];
		// initialize array
		num[0] = 12;
		num[1] = 4;
		num[2] = 5;
		num[3]=2;
		num[4]=5;
		//num[6]=6;


	System.out.println(num[2]);
		   
		// loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i = 0; i < num.length; i++) {
		     System.out.println(num[i]);
		   }
		   
		   
		   
		   Arrays.sort(num);
		   
		  
	
		   
		   System.out.println("Using for sort:");
		   for(int i = 0; i < num.length; i++) {
		     System.out.println(num[i]);
		   }
		   
//		   
//int [] num1=num.clone();
//num1[0]=10;
//
//
//for(int out:num1)
//{
//	System.out.println(out);
//}
		   
}

	
}
