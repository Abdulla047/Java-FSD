package practiceprojects;
import java.io.*;
public class FileHandlingRead {
	

	 public static void main(String[] args){
		 
	 //Reading an Existing file
	 try
	 {
	 FileReader r = new FileReader("C:\\Users\\abdulla\\Desktop\\phase1");
	 try
	 {
	 int i;
	 while((i=r.read())!=-1)
	 {
	 System.out.print((char)i);
	 }
	 }
	 finally
	 {
	 r.close();
	 System.out.print("\n");
	 System.out.print("File Closed successfully.");
	 }
	 }
	 catch(IOException e)
	 {
	 System.out.println("Exception handled..");
	}
	 
	 }
	 }
	
	
