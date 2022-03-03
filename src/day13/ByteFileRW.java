package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileRW {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
		
			fis= new FileInputStream("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\Photo_CHIINI SHANUMUKHA SUMANTH.jpeg");
			fos= new FileOutputStream("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\Photo_CHIINI SUMANTH.jpeg");
			int b;
			while((b=fis.read())!=-1) {
				fos.write(b);
			}
			System.out.println("Copied Successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				fis.close();
			}
			if(fos!=null) {
				fos.close();
			}
			
		}
	}
}
