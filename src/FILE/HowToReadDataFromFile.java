package FILE;

import java.io.File;
import java.util.Scanner;

public class HowToReadDataFromFile {

	public static void main(String[] args) {
		try {
			
		File f=new File("C:/Users/md954105/Documents/OPP/Person/student.txt");
		Scanner sc=new Scanner(f);
		
		while(sc.hasNext()) {
			String id=sc.next();
			String name=sc.next();
			System.out.println("ID: "+id +" Name: "+name);
			
		}
		sc.close();
		
		}catch(Exception e) {
			System.out.println(e);
		}//end trycatch block
		

	}//end main method

}//end class
