package mazenetday9;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program7 {
	public static void main(String[] args) {
	
		String path = "E:\\resume.docx";
		
		try {
			checkFile(path);
			System.out.println("found");
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static void checkFile(String path) throws FileNotFoundException{
		
		FileReader f = new FileReader(path);
	}
}