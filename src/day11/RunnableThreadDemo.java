package day11;
class RThread implements Runnable{
	@Override
	public void run() {
		System.out.println("In run method = "+Thread.currentThread().getName());
	}
}

public class RunnableThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new RThread());
		t1.start();
		
		Thread t2=new Thread(new RThread(), "Thread");
		t2.start();
		
		Thread t3=new Thread(new RThread(),"New Thread");
		t3.start();
	}

}
