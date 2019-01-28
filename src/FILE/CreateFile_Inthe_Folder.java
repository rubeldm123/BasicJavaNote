package FILE;

import java.io.File;
import java.io.IOException;

public class CreateFile_Inthe_Folder {

	public static void main(String[] args) {
		
		/*1.Create Folder/Director
		2.create file under Folder
		3.*/
		/////////////////1.Create Folder/Director	
		File d=new File("C:/Users/md954105/Documents/OPP/Person");

		//Use (.mkdir() method for create folder
		d.mkdir();
		
		String p=d.getAbsolutePath();
		
		///////////////	2.create file under Folder
		//File f1=new File("C:/Users/md954105/Documents/OPP/Person/student.txt");
		File f1=new File(p+"/student.txt");
		try {
			f1.createNewFile();
			System.out.println("File is created");
		} catch (Exception e) {
	System.out.println(e);
		}
		
	/////To See File Exist 
		
		if(f1.exists()) {
			System.out.println("File Exist");
		}
		
		
		

	}//end main method 

}//end class
