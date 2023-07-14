import javax.swing.JOptionPane;

//class MyThread1 extends Thread{
//	@Override
//	public void run() {
//		System.out.println(getName());
//		for(int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//	}
//}

////똑같은 표현방법
//class MyThread1 implements Runnable{
//	@Override
//	public void run() {
//		for(int i = 0; i < 300; i++) {
//		System.out.println("-");		
//	}
//}
//}
//class MyThread2 extends Thread{
//	@Override
//	public void run() {
//		System.out.println(getName());
//		for(int i = 0; i<300; i++) {
//			System.out.println("|");
//		}
//	}
//}

//class MyThread1 extends Thread{
//	@Override
//	public void run() {
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은" + input + "입니다.");
//		}
//}
//class MyThread2 extends Thread{
//	@Override
//	public void run() {
//		for(int i = 10; i < 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//			}
//		}
//		}
//	}

//class CountDownThread extends Thread{
//
//	@Override
//	public void run() {
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000); // 1초씩 나옴
//			} catch (Exception e) {
//			}
//		}
//	}
//	
//}

//class Account2{
//	   int balance = 500;
//	   
//	   public synchronized void withdraw(int money) {
//	      
//	      if(balance >= money) {
//	         try {
//	            Thread.sleep(1000);
//	         } catch (Exception e) {
//	            
//	            e.printStackTrace();
//	         }
//	         balance = balance - money;
//	      }
//	   }
//	   
//	}
//
//	class RunnableAccount implements Runnable{
//
//	   Account2 acc = new Account2();
//	   
//	   @Override
//	   public void run() {
//	      
//	      while(acc.balance > 0) {
//	          // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
//	         int money = (int) (Math.random() * 3 + 1) * 100;
//	         acc.withdraw(money);
//	         System.out.println("::balance:" + acc.balance);
//	      }
//	      
//	   }
//	   
//	}


public class J230705 {

	public static void main(String[] args) throws Exception{
//		Runnable r = new RunnableAccount();
		
//		Thread t1 = new Thread(r,"첫번째"); 
////		Thread t2 = new Thread(r,"두번째");
//			
//		t1.start();
////		t2.start();
		
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
//		
//		MyThread1 th1 = new MyThread1();
//		MyThread2 th2 = new MyThread2();
//		th1.start();
//		th2.start();
		
//		CountDownThread cdt = new CountDownThread();
//		cdt.start();
//		
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
//		System.out.println("입력하신 값은" + input + "입니다.");
		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000); // 1초씩 나옴
//			} catch (Exception e) {
//			}
//		}
		
//		String name = Thread.currentThread().getName();
//		System.out.println(name);
//		
////		MyThread1 th1 = new MyThread1();
//		MyThread2 th2 = new MyThread2();
////		th1.start();
//		th2.start();
//		
//		//run 표시 방법
//		Runnable runnable = new MyThread1();
//		Thread th3 = new Thread(runnable);
//		th3.start();
		
//		for(int i = 0; i < 300; i++) {
//			System.out.println("-");
//		}
//		for(int i = 0; i<300; i++) {
//			System.out.println("|");
//		}
		
		
//		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))) {
//			String str;
//			while(true) {
//				str = br.readLine();
//				if(str == null)
//					break;
//				System.out.println(str);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
//		String es = "Life is long if you know how to use it.";
//		
//		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))) {
//			bw.write(ks, 0, ks.length());
//			bw.newLine();
//			bw.write(es, 0, es.length());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
