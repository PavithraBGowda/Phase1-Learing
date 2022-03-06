package file_Write_Read_Append;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteProg {

	public static void main(String[] args) throws Exception {
		try
		{
			FileWriter  f=new FileWriter("C:/Users/pavit/Desktop/Simplilearn/FSD_Phase_1/employee1.txt");
			try
			 {
				f.write("Sumit is the employee of Mphasis limited..!!");
				
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
