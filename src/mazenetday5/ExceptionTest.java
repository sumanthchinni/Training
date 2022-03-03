package mazenetday5;







class Exception1 extends Exception {
	@Override
	public String getMessage() {
		return "ONE";
	}
}

class Exception2 extends Exception1 {
	@Override
	public String getMessage() {
		return "TWO";
	}
}


public class ExceptionTest {

	public static void main(String[] args) {
		try {
			throw new Exception1();
		} catch (Exception1 ex1) {
			System.out.println(ex1.getMessage());
		} catch (Exception2 ex2) {
			System.out.println(ex2.getMessage());
		}
	}
}



