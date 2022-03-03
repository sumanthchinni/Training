package day11;

class TThread extends Thread{
	@Override
	public void run() {
		System.out.println("by thread = "+Thread.currentThread().getName());
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main method by thread = "+Thread.currentThread().getName());
		Thread t1=new TThread();
		t1.start();
		new TThread().start();
		new TThread().start();
		new TThread().start();
	}
	}


