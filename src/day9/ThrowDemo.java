package day9;

public class ThrowDemo {

	public static void main(String[] args) {
		
		ThrowDemo throwdemo=new ThrowDemo();
		try {
			String s=null;
			throwdemo.display(s);
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
		public void display(String s) {
			if (s==null) {
				throw new NullPointerException("String is Null");
				
			}
		}

	}


