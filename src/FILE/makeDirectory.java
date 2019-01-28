package FILE;
import java.io.File;

public class makeDirectory {

	public static void main(String[] args) {
		//Import JAVA FILE Class and provide Folder location
		
File d=new File("C:/Users/md954105/Documents/OPP/Person");

//Use (.mkdir() method for create folder
d.mkdir();

//Print Location where folder was created
String L=d.getAbsolutePath();
System.out.println("Your Folder is under this location: " + L);

//Print name of the Folder you just created
String N= d.getName();
System.out.println("Your Created Folder Name is : " +N);

//Delete folder by using (.delete()) method and send message to console 
if (d.delete()){
	System.out.println(N + " Folder has been deleted");
}


	}//end method

}//end class
