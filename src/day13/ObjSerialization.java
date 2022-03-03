package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjSerialization {

	public static void main(String[] args) {
		ObjSerialization o1=new ObjSerialization();
		o1.writeData();
		o1.readData();

	}
	private void writeData()  {
		Employee db[]= {
				new Employee("Chinni",21,25000.00),
				new Employee("Shanmukha",40,60000.00),
				new Employee("Sumanth",25,30000.00)
		};
		try(FileOutputStream fout=new FileOutputStream("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\obj.ser");
				ObjectOutputStream sout=new ObjectOutputStream(fout);){
			for(int i=0;i<db.length;i++) {
				sout.writeObject(db[i]);
			}
			}catch(IOException e) {
				e.printStackTrace();
		}
		
	}

	private void readData() {
		try(FileInputStream fin=new FileInputStream("C:\\Users\\suman\\eclipse1\\Project1\\bin\\day13\\obj.ser");
				ObjectInputStream sin=new ObjectInputStream(fin);){
			Employee e=(Employee)sin.readObject();
			e.displayDetails();
			e=(Employee)sin.readObject();
			e.displayDetails();
			e=(Employee)sin.readObject();
			e.displayDetails();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}


}
