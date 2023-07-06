
class BankAccount {
    int balance = 0;     // 예금 잔액
    
    BankAccount(){
    	System.out.println("생성자 시작");
    }
    
    BankAccount(int balance){  // 여러개 생성 가능
    	this.balance = balance;
    	System.out.println("생성자 시작2");
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
}
public class Bankk {

	public static void main(String[] args) {
		BankAccount ref = new BankAccount();
		BankAccount ref2 = new BankAccount(2000);
	}
}
				



//		String str1 = "Happy";
//		String str2 = "Birthday";
//		System.out.println(str1 + " " + str2);
//		
//		printString(str1);
//		printString(str2);

//String name = "홍길동"; // 참조형 + 주소값  
//        BankAccount ref1 = new BankAccount();
//        BankAccount ref2 = ref1;
//
//        ref1.deposit(3000);
//        ref2.deposit(2000);
//
//        ref1.withdraw(400);
//        ref2.withdraw(300);
//
//        ref1.checkMyBalance();
//        ref2.checkMyBalance();  
		

		// 1. null -> 참조형에만 넣을수 있음
		// 2. 아무것도 가리키지 않은 상태
		// 3. 활용 참조형에 null로 지정하게 되면 JVM으로 하여금 할당되었던 메모리를 회수 하라는 의미 (메모리 정리함)
//		BankAccount ref; // = null; 개발자에게 할당없다는 정보를 줌 // BankAccount ref = new BankAccount(); 과 같은 뜻
//		ref = new BankAccount();   // BankAccount ref = new BankAccount(); 과 같은 뜻
//		ref = null; // 
//		
//		ref.deposit(3000);
//		ref.withdraw(300);
//		check(ref);   // '참조 값' 의 전달
//	}
//	public static void check(BankAccount acc) {
//		acc.checkMyBalance();
//	}
//
//	}

