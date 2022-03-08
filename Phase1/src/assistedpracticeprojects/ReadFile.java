package assistedpracticeprojects;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile 
{

	public static void main(String[] args)
	{
		try
		{
			FileReader  r=new FileReader("C:\\Users\\abdulla\\Desktop\\phase1");
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


