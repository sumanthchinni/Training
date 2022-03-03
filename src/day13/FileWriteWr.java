package day13;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWr {

	public static void main(String[] args) {
		writeFileContent("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\t1.txt");
		writeFileChar("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\t2.txt");
		
	}

	private static void writeFileContent(String fname) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(fname))){
			bw.write("First line");
			bw.newLine();
			bw.write("Second line");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void writeFileChar(String fname) {
		BufferedOutputStream b=null;
		try {
			b=new BufferedOutputStream(new FileOutputStream(fname));
			b.write("First line".getBytes());
			b.write("\r\n".getBytes());
			b.write("Second line".getBytes());
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(b!=null) {
				try {
					b.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
