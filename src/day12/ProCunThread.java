package day12;

import java.util.LinkedList;

class Producer implements Runnable{
	
	LinkedList<Integer> l1;
	Producer(LinkedList<Integer> l1){
		this.l1=l1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			synchronized(l1){
				while(l1.size()>=1) {
					try {
						l1.wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Adding to q "+Thread.currentThread().getName()+" "+i);
				l1.add(i);
				l1.notify();
			}
		}
		
	}
	
}

class Consumer implements Runnable{
	
	LinkedList<Integer> l1;
	Consumer(LinkedList<Integer> l1){
		this.l1=l1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			synchronized(l1){
				while(l1.size()<1) {
					try {
						l1.wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming from q "+Thread.currentThread().getName()+" "+l1.remove(0));
				l1.notify();
			}
		}
		
	}
	
}
public class ProCunThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();
		Thread t1=new Thread(new Producer(l),"pro");
		Thread t2=new Thread(new Consumer(l),"con");
		t1.start();
		t2.start();

	}

}
