package java_IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

	public static void main(String[] args) throws IOException {
		FileReader readerStream = null;
		FileWriter writerStream = null;
		
		try
		{
			readerStream = new FileReader("C:\\Users\\YogRaj\\eclipse-workspace1\\ChracterStream1.txt");
			writerStream = new FileWriter("C:\\Users\\YogRaj\\eclipse-workspace1\\ChracterStream2.txt");
			
			//Reading source file and writing content to the target file character by character.
			int content;
			while((content = readerStream.read()) !=-1)
			{
				writerStream.append((char) content);				
			}
		}
		finally {
			if(readerStream != null)
			{
				readerStream.close();
			}
			if(writerStream != null)
			{
				writerStream.close();
			}
		}

	}

}
