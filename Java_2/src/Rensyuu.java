class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for(int i = 0; i< 300; i++) {
			System.out.print("-");
		}
	}
	
}
class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for (int i = 0; i < 300; i++) {
			System.out.print(("|"));
		}
	}
	
}

public class Rensyuu {
	public static void main(String[] args) {
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		
		m1.start();
		m2.start();
	}
	}