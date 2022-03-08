package practiceprojects;
import java.io.*;
public class FileHandlingWri {
 public static void main(String[] args){
 //Writing in the file
 
 try
 {
FileWriter f = new FileWriter("C:\\Users\\abdulla\\Desktop\\phase1.txt");
 try
 {
 f.write("pathan is the employee in It..!!");
 }
 finally
 {
 f.close();
 }
 System.out.println("Successfully Written..!! ");
 }
 catch(IOException i)
 {
 System.out.println(i);
 } 
 
 }
}


