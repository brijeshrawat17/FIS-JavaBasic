package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {

	
	   
	    public static void FileOutputStreamExample()
	    {
	           try{    
	             FileOutputStream fout=new FileOutputStream("testout.txt");    
	             String s="Welcome to Everyone";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	    
	    public static void FileInputStreamExample()
	    {
	    	try{    
	            FileInputStream fin=new FileInputStream("testout.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
	         
	public static void main(String[] args) {
		
		FileOutputStreamExample();
		FileInputStreamExample();
	    
	}

}
