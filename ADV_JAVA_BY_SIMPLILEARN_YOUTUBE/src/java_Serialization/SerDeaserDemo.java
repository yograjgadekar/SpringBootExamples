package java_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeaserDemo {

	public static void main(String[] args) throws Exception {
		
		Student stud = new Student("John", 25, "12 East,Canada");
		stud.setX(10);
		
		
		String filename = "C:\\Users\\YogRaj\\eclipse-workspace1\\Text_Serde.txt";
		FileOutputStream  fileOut = null;
		ObjectOutputStream objOut = null;
		
		//Serialization
		
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(stud);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("Object has been Serialized: \n" + stud);
			
		}
		catch(Exception IO )
		{
			System.out.println("IOException is Caught");
		}
		
		//Deserialization
		
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		try 
		{
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student obj = (Student) objIn.readObject();
			
			System.out.println("Object has been Deserialized: \n" + obj);
			System.out.println("Deserialize value of X is:" +obj.getX());
			
			objIn.close();
			fileIn.close();
			
		}
		catch (Exception IO )
		{
			System.out.println("IOException is Caught");
		}

	}

}
