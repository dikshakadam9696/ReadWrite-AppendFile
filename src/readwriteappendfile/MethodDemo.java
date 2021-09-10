package readwriteappendfile;
//Importing File class  
import java.io.File;  
//Importing the IOException class for handling errors  
import java.io.IOException;  
//Importing the FileWriter class
import java.io.FileWriter;  
import java.lang.*;

public class MethodDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		   try {  
               // Creating an object of a file  
               File f = new File("c:FileOperationExample.txt");   
               if (f.createNewFile()) {  
                          System.out.println("File " + f.getName() + " is created successfully.");  
               } else {  
                          System.out.println("File is already exist in the directory.");  
               }  
             } catch (IOException exception) {  
                      System.out.println("An unexpected error is occurred.");  
                      exception.printStackTrace();  
          }   
	
		   try {  
		        FileWriter fwrite = new FileWriter("c:FileOperationExample.txt");  
		        // writing the content into the FileOperationExample.txt file  
		        fwrite.write("A named location used to store related information is referred to as a File.");   
		   
		        // Closing the stream  
		        fwrite.close();   
		        System.out.println("Content is successfully wrote to the file.");  
		    } catch (IOException e) {  
		        System.out.println("Unexpected error occurred");  
		        e.printStackTrace();  
		        }  
		   {
			   
		        StringBuilder sb1 = new 
		                      StringBuilder("Welcome to Simplilearn ");
		        System.out.println("Input: " + sb1);
		        
		        // Appending the boolean value
		        sb1.append(true);
		        System.out.println("Output: " + sb1);
		       
		        System.out.println();
		        
		        StringBuilder sb2 = new StringBuilder("We fail- ");
		        System.out.println("Input: " + sb2);
		  
		        // Appending the boolean value
		        sb2.append(false);
		        System.out.println("Output: " + sb2);
	       }

      }
 }
