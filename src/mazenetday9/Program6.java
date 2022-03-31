package mazenetday9;

class ExceptionA extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	ExceptionA(){
		super();
	}
	
	ExceptionA (String e){
		super(e);
	}

	public String toString() {
		return super.getMessage();
	}
	
	
	@Override
	public String getMessage() {
		return "A";
	}
}

class ExceptionB extends ExceptionA {
	
	private static final long serialVersionUID = 1L;

	
	ExceptionB(){
		super();
	}
	
	ExceptionB (String e){
		super(e);
	}

	public String toString() {
		return super.getMessage();
	}
	
	
	@Override
	public String getMessage() {
		return "B";
	}
}

class ExceptionC extends ExceptionB {
	
	private static final long serialVersionUID = 1L;

	
	ExceptionC(){
		super();
	}
	
	ExceptionC (String e){
		super(e);
	}

	public String toString() {
		return super.getMessage();
	}
	
	
	@Override
	public String getMessage() {
		return "C";
	}
}


class  Program6{

	public static void main(String[] args) throws Exception  {
		try {
			throw new ExceptionA();
		} catch (ExceptionA a) {
			System.out.println(a.getMessage());
		} 
		
		try {
			throw new ExceptionC();
		}catch (ExceptionB b) {
			System.out.println(b.getMessage());
		}
	}
}