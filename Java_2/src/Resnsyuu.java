	class RunnableAccount implements Runnable{

	   Account2 acc = new Account2();
	   
	   @Override
	   public void run() {
	      
	      while(acc.balance > 0) {
	          // 100, 200, 300중의 한 값을 임으로 선택해서 출금(withdraw)
	    	  int money = (int) (Math.random() * 3 + 1) * 100;
	         acc.withdraw(money);
	         System.out.println("::balance:" + acc.balance);
	      }
	      
	   }
	   
	}
	
public class Resnsyuu {
	public static void main(String[] args)throws Exception{
		Runnable r = new RunnableAccount();
		
		Thread t1 = new Thread(r,"첫번째"); 
		t1.start();
	}
}