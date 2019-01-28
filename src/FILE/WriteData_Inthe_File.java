package FILE;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteData_Inthe_File {

	public static void main(String[] args) {
		
		//
		String id,name;
		try {
			//Use Formater to write data inside the file 
			Formatter f=new Formatter("C:/Users/md954105/Documents/OPP/Person/student.txt");
			
			
			Scanner input=new Scanner(System.in); //Use Scanner class for get input from user
			System.out.println("Hoe many Students : ");
			
			int num=input.nextInt();
			for (int i=1; i<=num;i++) {
				
				System.out.println("Enter Studen id and name : ");
				id=input.next();
				name=input.next();
			
				f.format("%s %s \r\n", id,name);//%S=String, \r=return, \n=new line
				
				
				
			}//end for loop
			
				
			f.close();//close formatter class
			
			
		}catch(IOException e) {
			System.out.println("FIle Not found" +e);
		}//end tryCatch block
	

	}//end main method

}//end class
