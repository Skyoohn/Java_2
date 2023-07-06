
//class AA{
//	public void aa() {
//		System.out.println("aa 함수 입니다.");
//	}
//	public void cc() {
//		System.out.println("cc 함수 입니다.");
//	}
//}
//
//class BB extends AA{
//	public void bb() {
//		System.out.println("bb 함수 입니다.");
//	}
//	public void cc() {
//		System.out.println("cc 함수 입니다.");
//	}
//}

//class Cake{
//	public void yummy() {
//		System.out.println("yummy cake");
//	}
//}
//class CheeseCake extends Cake{
//	public void yummy() {
//		System.out.println("yummy cheese cake");
//	}
//}

//class Robot{
//	public void work() {
//	}
//}
//
//class DanceRobot extends Robot{
//	public void work() {
//		System.out.println("춤추는 로봇입니다.");
//	}
//}
//
//class DrawRobot extends Robot{
//	public void work() {
//		System.out.println("그림을 그리는 로봇입니다.");
//	}
//}
//
//class WashRobot extends Robot{
//	public void work() {
//		System.out.println("세탁을 하는 로봇입니다.");
//	}
//}

//class Price{
//	private double price = 0;
//	Price(double price){
//		this.price=price;
//	}
//	public double getPrice() {
//		return price;
//	}
//}
//
//class Computer extends Price{
//
//	Computer(double price) {
//		super(price);
//	}
//	
//}
//
//class Speaker extends Price{
//
//	Speaker(double price) {
//		super(price);
//	}
//	
//}


//인터페이스 안에 올수 있는 것은 함수구현{}(X) -> 추상 메서드와 상수만 올 수 있다.
//인터페이스는 자손이 구현하라.
//인터페이스 안에 올수 있는 것은 함수구현(X) -> 추상메서드 와 상수만 올수 있음
//인터페이스 자손이 구현하라.

//인터페이스를 사용하는 이유 
//1.선배들이 사용 하기 때문에(표준 = 강제 = 규약 = 프린트 드라이버)
//2.다중 상속지원

//interface Printable {
//   abstract public void print(String doc); // 함수선언 = 함수정의 =  abstract = 추상메서드
//}
//
//interface Movable {
//   abstract public void move(); // 함수선언 = 함수정의 =  abstract = 추상메서드
//}
//
//class Printer implements Printable,Movable {
//
//   @Override
//   public void print(String doc) {
//      System.out.println(doc);      
//   }
//
//   @Override
//   public void move() {
//      System.out.println("움직입니다.");   
//      
//   }
//}


//
////마이크로소프트라는 회사가 인터페이스를 만듦(강제)
//interface Printable{
//	abstract public void print(String doc);
//}
////외워야 함
////삼성에서 만들어주는 클래스
//class SamSungPrinter implements Printable{
//	
//	@Override
//	public void print(String doc) {
//		System.out.println("From Samsung printer");
//		System.out.println(doc);
//	}
//}
//class LGPrinter implements Printable{
//	@Override
//	public void print(String doc) {
//		System.out.println("From LG printer");
//		System.out.println(doc);
//	}
//}


// 협업 = 외주
//interface Icalculator{
//	public int add(int num1,int num2);
//	public int sub(int num1,int num2);
//	public int mul(int num1,int num2);
//	public int div(int num1,int num2);
//}
//
//public class Calculator implements Icalculator {
//
//	  @Override
//	  public int add(int num1, int num2) {
//	    return num1 + num2;
//	  }
//
//	  @Override
//	  public int sub(int num1, int num2) {
//	    return num1 - num2;
//	  }
//
//	  @Override
//	  public int mul(int num1, int num2) {
//	    return num1 * num2;
//	  }
//
//	  @Override
//	  public int div(int num1, int num2) {
//		  
//		  if(num2 ==0)
//			  return 0;
//		  
//	    return num1 / num2;
//	  }
//
//	}

public class J230627 {
	
//	public static void checkPrice(Price price) {
//		System.out.println(price.getPrice());
//	}

	public static void main(String[] args) {
		
//		Calculator calculator = new Calculator();
//		System.out.println(calculator.add(3, 4)); // 3
		
		
//		String myDoc = "This is report about...";
//		
////		Printable print = new SamSungPrinter();
////		print.print(myDoc);
////		System.out.println();
//		
//		Printable print = new LGPrinter();
//		print.print(myDoc);
//		System.out.println();
		
		
//		SamSungPrinter samsung = new SamSungPrinter();
//		samsung.printSamSung("안녕하세요.");
//		
//		LGPrinter lg = new LGPrinter();
//		lg.printLG("안녕안하세요.");
		
//	      Printer printer = new Printer(); //인터페이스도 다형성이 적용됨 
//	      printer.move();
//	      printer.print("아아아");

	 
		
//		Computer computer = new Computer(100);
//		Speaker speaker = new Speaker(50);
//		
//		checkPrice(computer);
//		checkPrice(speaker);
		
//		DanceRobot draw = new DanceRobot();
//		draw.work(); // 다형성과 오버라이딩을 사용하지 않으면 이런식으로 전부 따로따로 해야함
		
//		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
//		
//		for(Robot robot : arrRobot) {
//			robot.work();
//		}
		
//		Cake c1 = new CheeseCake();
//		CheeseCake c2 = new CheeseCake();
//		
//		c1.yummy();
//		c2.yummy();
		
		
		
//		AA aa = new AA();
//		System.out.println(aa);
//		
//		BB bb = new BB();
//		System.out.println(bb);
//		bb.aa();
//		
//		AA aaa = new BB(); //에러없음
//		
//		aaa.aa();
//		aaa.bb(); //에러남
//		
//		BB bbb = new AA(); //에러발생
//		

	}

}
