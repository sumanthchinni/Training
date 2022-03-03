package day8;

public class GenericMethod {

	public static void main(String[] args) {
		GenericMethod gm=new GenericMethod();
		Integer[] intArray= {1,2,8,7,9};
		double[] doubleArray= {2.0,3.5,4.6,7.5};
		Character[] characterArray= {'c','s','s'};
		gm.printElements(intArray);
		gm.printElements(doubleArray);
		gm.printElements(characterArray);
	}
	private void printElements(double[] doubleArray) {
		// TODO Auto-generated method stub
		
	}
	public <T> void printElements(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	private void printElements(Integer[] intArray) {
		// TODO Auto-generated method stub
		
	}

}
