package java_NonBlockingIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExampleDemo {

	public static void main(String[] args) throws IOException {
		
		//Reading form a file
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\YogRaj\\eclipse-workspace1\\NioExample1.txt");
		FileChannel readChannel = fileInputStream.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate(1024);
		int result = readChannel.read(readBuffer);
		System.out.println("File read Successfully.." + result);
		
		//Writing to a file
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\YogRaj\\eclipse-workspace1\\NioExample2.txt");
		FileChannel writeChannel = fileOutputStream.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
		String msg = "This is a test String.";
		writeBuffer.put(msg.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.println("File Written Successfully..");
		
	}

}
