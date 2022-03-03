package day13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFileRW {

	public static void main(String[] args) throws Exception {
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\suman.txt");
			fw=new FileWriter("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\CHIINI SUMANTH.txt");
			int c;
			while((c=fr.read())!=-1){
				fw.write(c);
			}
			System.out.println("Copied");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!=null) {
				fr.close();
			}
			if(fw!=null) {
				fw.close();
			}
		}

	}

}
