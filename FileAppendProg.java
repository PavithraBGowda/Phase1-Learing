package file_Write_Read_Append;

import java.io.FileWriter;
import java.io.IOException;


public class FileAppendProg {

	public static void main(String[] args) {
		String path ="C:/Users/pavit/Desktop/Simplilearn/FSD_Phase_1/employee1.txt";
		String text = " taking training from simplelearn ";
		try
		{
			FileWriter f = new FileWriter(path,true);
			f.write(text);
			f.close();
			System.out.println("Append operation on file was done Successfully..");
		}
		catch(IOException e)
		{
			 System.out.println(e);
			 
		} 
		


	}

}
