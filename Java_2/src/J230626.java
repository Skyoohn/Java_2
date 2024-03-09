//import java.util.Scanner;
//
////TV를 상속받은 ColorTV 클래스를 작성
//class TV2 {
// private int size;
//
// public TV2(int size) {
//    this.size = size;
// }
//
// public int getSize() {
//    return size;
// }
//}
//
//class ColorTV extends TV2 {
// private int color;
//
// public ColorTV(int size, int color) {
//    super(size);
//    this.color = color;
// }
//
// public void printProperty() {
//    System.out.println(super.getSize() + "인치 " + this.color + "컬러");
// }
//}
//
//class IPTV extends ColorTV {
//
// private String ip;
//
// public IPTV(String ip, int size, int color) {
//    super(size, color);
//    this.ip = ip;
// }
// 
// public void printProperty() {
//    System.out.print("나의 IPTV는" + this.ip + " 주소에 ");
//    super.printProperty();
// }
//}
//
//
//
//////상속
//////기존에 있던것 = 선배가 만든것 = 건들면 안된다 = 건들수도 없는것
////class A{
////	private int a = 10;
////	public void aa() {
////		System.out.println(a);
////	}
////		   public A() {
////			      
////		   }
////		   
////		   public A(int a) {
////		      this.a = a;
////		   }
////
////}
////
//////reuse 재사용 하기 위해 상속이 나왔음
////class B extends A{
////	private int b = 20;
////	//기본적으로 부모의 함수및 변수의 접근 방법은 super=부모
////	public B(int a,int b) {
////		//this.a = a; // 부모쪽이 private가 아니면 다른 클래스에서 가능
//////		super.a = a; // 부모에 접근하는걸 super로 표기하는게 좋은 표현
////		super(a); // 부모 멤버변수 접근방법 = spuer 생성자를 통해 기본적으로 접근한다. <생성자로 접근 (public A(int a)>
////		this.b = b;
//////		super(a); 항상 부모는 무조건 자기꺼 위에 가야 한다 (메모리 올릴때 생각)
////	}
////	
////	public void bb() {
////		
//////		aa(); // 다 같은
//////		this.aa(); // 방
//////		super.aa(); // 법
////		System.out.println(b);
////	}
////}
//
//
////	
////	   public static int getArr() {
////	      Scanner sc = null;
////	      int num =0;
////	      
////	      while(true) {
////	         sc = new Scanner(System.in);
////	         num = sc.nextInt();
////	         
////	         if(num < 1 || num >10 ) {
////	            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
////	            continue;
////	         }else {
////	            
////	            break;
////	         }         
////	      }
////	      return num;
////	   
////	   }
//
////class MobilePhone{
////	protected String number;
////	
////	public MobilePhone(String num) {
////		number = num;
////	}
////	public void answer() {
////		System.out.println("hi~from"+number);
////	}
////}
////
////class SmartPhone extends MobilePhone{
////	private String androidVer;
////	
////	public SmartPhone(String num,String ver) {
////		super(num);
////		androidVer = ver;
////	}
////	public void playApp() {
////		System.out.println("App is running in "+androidVer);
////	}
////}
//	
public class J230626 {
	
	public static void main(String[] args) {
////		SmartPhone ph1 =
////				new SmartPhone("010-555-777","Nougat");
////		MobilePhone ph2 =
////				new SmartPhone("010-999-333", "Nougat");
////		ph1.answer();
////		ph1.playApp();
////		System.out.println();
////		
////		ph2.answer();
//		
//		
//	      ColorTV myTV = new ColorTV(32, 1024);
//	      myTV.printProperty(); // 32인치 1024컬러
//
//	      IPTV iptv = new IPTV("192.1.1.2", 32, 2048); // "192.1.1.2" 주소에 32인치, 2048컬러
//	      iptv.printProperty();
//
//		
////		A a = new A();
////		System.out.println(a.a);
////		
////		A b = new B();
////		b.aa();
//		
////	      //변수 선언
////	      int row,col;
////	      int[][] arr;
////	      
////	      System.out.print("행크기:");
////	      row = getArr();
////	      
////	      System.out.print("열크기:");
////	      col = getArr();
////	      
////	      arr = new int[row][col];
////	      
////	      //알파벳 입력및 출력
////	      for (int i = 0; i < arr.length; i++) {
////	         for (int j = 0; j < arr[i].length; j++) {
////	            arr[i][j] = (int)(Math.random() * 26 + 65);
////	            
////	            System.out.print((char)arr[i][j] + " ");
////	         }
////	         System.out.println();
////	      }
//	            
//	   
//		
////		int[][] arr = {
////				{11},
////				{22,33},
////				{44,55,66}
////			
////		};
////		
////		for(int i =0; i < arr.length;i++) {
////			for(int j = 0; j < arr[i].length;j++) {  // arr[i]가 나오는 원리는 arr의 행이 3개니까
////				System.out.print(arr[i][j]+"\t");    // 각 번지 찾아가서 1개, 2개, 3개
////			}
////			System.out.println();
////		}
//		
////		int[][] arr = new int[3][4];
////		int num = 1;
////		
////		for(int i = 0; i < 3; i++) {
////			for(int j = 0; j < 4 ; j++) {
////				arr[i][j] = num;
////				num++;
////			}
////		}
////		
////		for(int i = 0; i < 3; i++) {
////			for(int j = 0; j < 4; j++) {
////				System.out.print(arr[i][j]+"\t");
////			}
////			System.out.println();
////		}
//		
//		
////		int[] ar = {1,2,3,4,5};
////		
////		for (int e : ar) {
////			System.out.print(e+" ");
////		}
////		System.out.println();
////		
////		int sum = 0;
////		
////		for(int e: ar) {
////			sum += e;
////		}
////		System.out.println("sum : "+sum);
//		
////		System.out.println(args[0]);
////		System.out.println(args[1]);
////		
////		for(int i = 0; i < args.length; i++) {
////			System.out.println(args[i]);
////		}
////		
//		
////		int[] ar = {1, 2, 3, 4, 5, 6, 7};
////		int sum = sumOfAry(ar);
////		System.out.println("sumOfAry(): " + sumOfAry(ar));
////		System.out.println("main(): " + sum);
////		}
////
////	static int sumOfAry(int[] ar) {
////		int sum = 0;
////		for(int i = 0; i <ar.length; i++)
////			sum += ar[i];
////		return sum;
////		
////	}
////	static int[] makeNewIntAry(int len) {
////		int[] ar = new int[len];
////		return ar;
//
	}
	
}
