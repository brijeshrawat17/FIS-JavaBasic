package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public static void CreateFile() throws IOException 
	{

        File myFile = new File("file1.txt");
     
            myFile.createNewFile();
            System.out.println("File created successfully.");
     
         
        
	}   
        public static void WriteFile() {

        	 // File myFile = new File("file1.txt");
              try {
                  FileWriter fileWriter = new FileWriter("file1.txt");
                  fileWriter.write("Hello Everyone");
                  fileWriter.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
              
        }
              
              public static void ReadFile() throws FileNotFoundException {

            	  File myFile = new File("file1.txt");
               
                      Scanner sc = new Scanner(myFile);
                      while(sc.hasNextLine()){
                          String line = sc.nextLine();
                          System.out.println(line);

                      }
                
            
    }
    
              public static void DeleteFile() {

                  File myFile = new File("file1.txt");
                  if(myFile.delete()){
                      System.out.println("I have deleted: " + myFile.getName());
                  }
                  else{
                      System.out.println("Some problem occurred while deleting the file");
                  }
            	 
              
    }
	

	public static void main(String[] args) throws IOException {
		//CreateFile();
		//WriteFile();
	ReadFile(); 
		//DeleteFile();
	}

}
