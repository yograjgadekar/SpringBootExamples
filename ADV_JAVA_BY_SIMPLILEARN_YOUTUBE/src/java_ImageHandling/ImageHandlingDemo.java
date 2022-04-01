package java_ImageHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageHandlingDemo {

	public static void main(String[] args) throws IOException {
		int width = 963;
		int height = 640;
		
		BufferedImage image = null;
		
		image = readFromFile(width, height, image);
		
		writeToFile(image);

	}

	private static BufferedImage readFromFile(int width, int height, BufferedImage image) {
		
		try {
			File sampleFile = new File("C:\\Users\\YogRaj\\Downloads\\download.png");
			
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			//Reading Input File
			image = ImageIO.read(sampleFile);
			System.out.println("Reading Complete.\n" + image);
			
		}catch(IOException e) {
			System.out.println("Error while Reading Image.\n" + e);
		}
		
		return image;
	}
	
	private static void writeToFile(BufferedImage image) {
		
		try {
			File output = new File("C:\\Users\\YogRaj\\Downloads\\download1Java.png");
			
			ImageIO.write(image, "png", output);
			
			System.out.println("Writing Image Successfully.\n");
		}catch(IOException e) {
			System.out.println("Error while Writing Image.\n" + e);
		}	
	}
}
