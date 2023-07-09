class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for(int i = 0; i < 300; i++) {
			System.out.print("_");
		}
	}
	}
class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
	}
	
}
public class Rensyuu {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		MyThread1 m1 = new MyThread1();
		m1.start();
		MyThread2 m2 = new MyThread2();
		m2.start();
		
				}
		}