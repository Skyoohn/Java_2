import java.awt.Rectangle;
import java.util.Scanner;

//abstract class House{
//	
//	abstract public void build2();
//	
//	public void build() {
//		System.out.println("집을 짓습니다.");
//	}
//	
//}
//
//class House2 extends House{
//
//	@Override
//	public void build2() {
//		System.out.println("집을 짓습니다.2");
//		
//	}
//	
//	
//}

//abstract class Calc{
//	protected int a;
//	protected int b;
//    void setValue(int a, int b) {this.a = a; this.b = b;}
//    abstract int calculate();
//}
//
//class Add extends Calc{
//	@Override
//	int calculate() {
//		return a + b;
//	}
//}
//class Sub extends Calc{
//	@Override
//	int calculate() {
//		return a - b;
//	}
//}
//class Mul extends Calc{
//	@Override
//	int calculate() {
//		return a * b;
//	}
//}
//class Div extends Calc{
//	@Override
//	int calculate() {
//		return a / b;
//	}
//}

//class AAA{
//	@Override //오버라이딩은 자식꺼
//	public String toString() { // 컴파일러가 생성해준 눈에 보이지 않는 object를 오버라이드 한것
//		return "이것도 메롱이다.";
//	}
//}

//class Circle{
//private double radius; //변수선언 > 게터세터 넣기
//
//public Circle(double radius) {
//	   this.radius=radius;
//}
//
//public double getRadius() {
//   return radius;  //원의 넓이를 가져오는 함수
//}
//
//public void setRadius(double radius) { //외부값받아서 원의넓이를 변경하는 함수
//   this.radius = radius;
//}
//
//public double getArea() {
//   return radius*radius*Math.PI;  //원의 넓이 곱하는 함수만듦
//}
//
//	@Override
//	public String toString() {
//		return "원의 넓이는" + getArea()+"이고 반지름은"+radius+"인원";
//	}
//
//}

//class Rectangle {
//	   private int width;
//	   private int height;
//	   
//	   public int getWidth() {      
//	      return width;
//	   }
//	   public void setWidth(int width) {
//	      this.width = width;
//	   }
//	   public int getHeight() {
//	      return height;
//	   }
//	   public void setHeight(int height) {
//	      this.height = height;
//	   }
//	   
//	   @Override
//	   public String toString() {
//	      return "가로:" + width + "세로:" + height;
//	   }
//	   
//	   //int num = (int) 3.14
//	   @Override
//	   public boolean equals(Object obj){
//	      
//	      Rectangle rec = (Rectangle) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함
//	      
//	      if( (this.width == rec.width) && (this.height == rec.height))
//	         return true;
//	      
//	      return false;
//	   }
//
//	   
//	}

// 부모 소환
//class Member extends Object{
//
//	   private String color;
//	   
//	   public Member(String color) {
//	      this.color = color;
//	   }
//	   
//	   @Override
//	   public boolean equals(Object obj) {
//	      
//	      Member member = (Member) obj; // 자식 = 부모 되는 케이스트 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함
//
//	      if (color.equals(member.color))
//	         return true;
//
//	      return false;
//	      
//	   }
//	}

//자식 = 부모 되는 케이스 자식 = (자식)부모 시켜서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야함

//class Person1 {
//	   private String name;
//	   int age;
//	   
//	   public Person1(String name, int age) {
//	      this.name = name;
//	      this.age = age;
//	   }
//	   
//	   @Override
//	   public boolean equals(Object obj) {
//	      
//	      
//	      Person1 person = (Person1) obj;      
//	      
//	      if ((this.name == (person.name)) && (this.age == person.age))
//	         return true;
//	         
//	               return false;
//	   }
//	}

//에러처리 /예외처리
//1. try catch finally (c언어에선 지원X)
//2. throws
public class J230628 {

	public static void main(String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			int num = sc.nextInt();
//			System.out.println(num);
////			System.out.println(3/0);
//		} catch (Exception e) {
//			System.out.println("캐치 안입니다");
//			}
//		finally {
//			System.out.println("파이널리입니다.");
//		}
//		
//		System.out.println("프로그램 종료입니다.");
		
//	      Person1 kim = new Person1("홍길동",35);
//	      Person1 park = new Person1("홍길동",35);
//	      Person1 heo = new Person1("홍길동",34);
//	      
//	      if(kim.equals(park))
//	         System.out.println("같은 사람입니다.");
//	      else
//	         System.out.println("다른 사람입니다.");
//	      
//	      if(kim.equals(heo))
//	         System.out.println("같은 사람입니다.");
//	      else
//	         System.out.println("다른 사람입니다.");
		
//		Member obj1 = new Member("Black");
//		Member obj2 = new Member("Black");
//		Member obj3 = new Member("White");
//
//		//false가 뜨는 이유는 obj1과 obj2의 주소가 다르기 때문
//		System.out.println(obj1.equals(obj2)); // true가 출력
//		System.out.println(obj1.equals(obj3)); // false가 출력
		
		
//	      Rectangle rec = new Rectangle();
//	      Rectangle rec2 = new Rectangle();
//	      
//	      boolean b = rec.equals(rec2);
		
		
//		Circle circle = new Circle(10);
//		
//		System.out.println(circle); // 원의 넓이는 314.1592 이고 반지름은 10인 원
		
		
//		AAA aaa = new AAA();
//		System.out.println(aaa);
//		
//		AAA bbb = new AAA();
//		boolean b = aaa.equals(bbb);
//		System.out.println(b);
		
//		String str = new String("메롱");
//		System.out.println(str);
//		
//		AAA aaa = new AAA(); //null이 아니면 부모(object)에 있는 toString 호출
//		System.out.println(aaa);

		
		
		
//        Scanner sc = new Scanner(System.in);
//        System.out.print("두 정수와 연산자를 입력하시오>> ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char c = sc.next().charAt(0); // 11 12 +
//
//        if(c == '+'){
//            Add add = new Add();
//            add.setValue(a, b);
//            System.out.println(add.calculate());
//        }
//        else if(c == '-'){
//            Sub sub = new Sub();
//            sub.setValue(a, b);
//            System.out.println(sub.calculate());
//        }
//        else if(c == '*'){
//            Mul mul = new Mul();
//            mul.setValue(a, b);
//            System.out.println(mul.calculate());
//        }
//        else if(c == '/'){
//            Div div = new Div();
//            div.setValue(a, b);
//            System.out.println(div.calculate());
//        }
		// 추상클래스
		
		
//		House house = new House2();
//		house.build2();
		
//		House2 house = new House2(); 똑같음
	}

}
