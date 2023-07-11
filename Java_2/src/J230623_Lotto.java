import java.awt.Rectangle;

import java.util.Scanner;

import com.sun.jdi.Value;

//class Circle2{
//	   private double radius; //변수선언 > 게터세터 넣기
//	   
//	   public Circle2() {}
//	   
//	   public Circle2(double radius) {
//		   this.radius=radius;
//	   }
//	   
//	   public double getRadius() {
//	      return radius;  //원의 넓이를 가져오는 함수
//	   }
//
//	   public void setRadius(double radius) { //외부값받아서 원의넓이를 변경하는 함수
//	      this.radius = radius;
//	   }
//	   
//	   public double getArea() {
//	      return radius*radius*Math.PI;  //원의 넓이 곱하는 함수만듦
//	   }
//	   
//	}

//class Rectangle{
//	private double width,height;
//
//	
//	public Rectangle() {}
//	
//	public Rectangle(double width,double height) {
//		this.width=width;
//		this.height=height;
//	}
//	public double getArea() {
//		return width*height;
//	}
//
//}

//class Grade{
//	private int kor, eng, math;
//	private String name;
//	
//	Grade(String name, int kor, int eng, int math) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		this.name = name;
//	}
//	
//	public double getAvg(){
//		return (kor + eng + math) / 3.0;     // double 이라서 .0을 붙여야 함
//	}
//	
//	public void showInfo() {
//		System.out.println(name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.");
//	}
//	public char getGrade() {
//		
//		char ch = '가';
//		double avg = getAvg();
//		
//		if(avg >= 90) {
//			ch = '수';
//		}
//		else if(avg >= 80) {
//			ch = '우';
//		}
//		else if(avg >= 70) {
//			ch = '미';
//		}
//		else if(avg >= 60) {
//			ch = '양';
//		}
//		else {
//        ch = '가';
//		}
//	      return ch;
//	}
//}

//class Rectangle3 {
//
//	   private double width, height; // 변수선언 > 게터세터 넣기
//
//	   public Rectangle3() {
//	   }
//
//	   public Rectangle3(double width, double height) {
//	      this.width = width;
//	      this.height = height;
//	   }
//
//	   public double getArea() {
//	      return width * height;
//	   }
//
//	}

public class J230623_Lotto {

	public static void main(String[] args) {
		
		
	
		
//		// 사각형 면적 구하기
//		
//	      Rectangle3[] arrRec = new Rectangle3[2];
//	      
//	      System.out.println("가로, 세로 크기를 입력하세요.");
//	      
//	      for(int i=0; i < arrRec.length;i++) {
//	         int width, height;
//	         Scanner sc = new Scanner(System.in);
//	         width = sc.nextInt();
//	         height = sc.nextInt();         
//	      
//	         arrRec[i] = new Rectangle3(width,height);
//	      }
//	      
//
//	      
//	      double areaRec =0;
//	      for(int i=0; i < arrRec.length;i++) {
//	         areaRec = areaRec + arrRec[i].getArea();         
//	      }
//	      System.out.println(areaRec);
		
		
//		Rectangle[] arrRec = new Rectangle[2];
//		
//		arrRec[0] = new Rectangle(40,50);
//		arrRec[1] = new Rectangle(20,50);
//		
//		double areaRec=0;
//	      for(int i=0; i < arrRec.length;i++) {
//	          int width, height;
//	          Scanner sc = new Scanner(System.in);
//	          width = sc.nextInt();
//	          height = sc.nextInt();         
//	       
//	          arrRec[i] = new Rectangle(width,height);
//	       }
		
		
		
//		Rectangle[] arrRec = new Rectangle[2];
//		
//		arrRec[0] = new Rectangle(40,50);
//		arrRec[1] = new Rectangle(20,50);
//		
//		double areaRec=0;
//		for(int i =0; i < arrRec.length;i++) {
//			arrRec = arrRec + arrRec[i].getArea();
//		}
//		System.out.println(arrRec);
		
		
		
		
//		Circle2[] arrCircle = new Circle2[5];
//		
//		arrCircle[0] = new Circle2(10.0);
//		arrCircle[1] = new Circle2(5);
//		
//		double area=0;
//		for(int i =0; i < arrCircle.length;i++) {
//			area = area + arrCircle[i].getArea();
//		}
//		System.out.println(area);
		
		
//		
//		String[] arrStr = new String[2];
//		
//		arrStr[0] = "String 1";
//		arrStr[1] = "String 2";
//		
//		System.out.println(arrStr[0].length());
//		System.out.println(arrStr[1].length());
//		
//		int sum=0;
//		for(int i =0; i < arrStr.length;i++) {
//			sum = sum + arrStr[i].length();
////			System.out.println(arrStr[i]);
//		}
//		System.out.println(sum);
		
//	      //변수선언
//	      int[] arrLotto = new int[6];
//	      
//	      //입력
//	      for(int i=0; i < arrLotto.length;i++) {
//	         arrLotto[i] = (int)(Math.random() * 45 + 1);
//	         
//	         for(int j=0;j<i;j++) {
//	            if(arrLotto[i] == arrLotto[j]) {
//	               i--;
//	               break;
//	            }
//	         }
//	      }
//	      //System.out.println();
//	      //출력
//	      for(int i=0; i < arrLotto.length;i++) {
//	         System.out.print(arrLotto[i] + "    ");
//	      }
		
		
//		int[] arrNum = new int[6];
//		
//		for(int i=0; i < arrNum.length;i++) {
//			for(int j=0; j < arrNum.length;j++) {
//			}
//			arrNum[i] = (int)(Math.random()*45)+1;
//			System.out.println(arrNum[i]);
//
//                }
            
		
		
		
		
//		int num = 5;
//		
//		//선언 방법 = 메모리 할당
//		int[] arrNum = new int[5];
//		double[] arrDou = new double[5];
//		long[] arrLong = new long[7];
//		
//		System.out.println(arrNum.length);
//		System.out.println(arrDou.length);
//		System.out.println(arrLong.length);
//		
//		arrNum[0] = 1;
//		arrNum[1] = 2;
//		arrNum[2] = 3;
//		arrNum[3] = 4;
//		arrNum[4] = 5;
//	//	arrNum[5] = 5; 넣으면 오류
//		
//		System.out.println(arrNum[2]);
//		
//		for(int i=0; i < arrNum.length;i++) { // 가장 기본적인 문법
//			System.out.println(arrNum[i]);
//		}
//		
//		// 
//		System.out.println((int)(Math.random()*10+1)); //1부터 10까지
//		System.out.println((int)(Math.random()*45+1));
//		
//		String[] arrString = new String[5];
//		Circle[] arrCiecle = new Circle[5];
		
		
//		   Scanner sc = null;
//		      Grade grade = null;
//		      int kor, eng, math;
//		      String name;
//		      ///////////////////////////////////비지니스 로직
//		            
//		      while (true) {
//		         sc = new Scanner(System.in);         
//
//		         System.out.print("이름:");
//		         name = sc.next();
//		         
//		         System.out.print("국어:");
//		         kor = sc.nextInt();
//
//		         System.out.print("영어:");
//		         eng = sc.nextInt();
//		         
//		         System.out.print("수학:");
//		         math = sc.nextInt();
//		         
//		         grade = new Grade(name, kor, eng, math);
//
//		         grade.showInfo();
//		         
//
//		         System.out.print("계속?");
//		         String choice = sc.next();
//
//		         if (choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
//		            continue;
//		         else
//		            break;
//		      }
//
//		      System.out.println("종료되었습니다.");
		
		
		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			Rectangle rectangle;
//			
//			System.out.print("가로:");
//			double width = sc.nextDouble();
//			
//			System.out.print("세로:");
//			double height = sc.nextDouble();
//			
//			rectangle = new Rectangle(width,height);
//			System.out.println("넓이는" + rectangle.getArea());
//
//			System.out.println("계속 하시겠습니까? yes or no");
//			String choice = sc.next();
//			
//			if(choice.compareToIgnoreCase("yes") == 0 || choice.compareToIgnoreCase("y") == 0)
//				continue;
//			else
//				break;
//			
//		}
//        System.out.println("종료되었습니다.");
        

//		Scanner sc = new Scanner(System.in);
//		Circle2 circle;
//		
//		System.out.print("반지름:");
//		double radius = sc.nextDouble();
//		
//		circle = new Circle2(radius);
//		System.out.println("넓이는:" + circle.getArea());
		
		
//		int num1 = sc.nextInt();
//		
//		int sum = (int) (num1 * num1 * Math.PI);
//		
//		System.out.println(sum);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//				System.out.print("국어:");
//				int num1 = sc.nextInt();
//				System.out.print("영어:");
//				int num2 = sc.nextInt();
//				System.out.print("수학:");
//				int num3 = sc.nextInt();
//				
//				int sum = num1 + num2 + num3;
//				System.out.println(sum);
		
		
//		StringBuilder stbuf = new StringBuilder("123");
//		
//		stbuf.append(45678); //문자열 덧붙이기
//		System.out.println(stbuf.toString());
//		
//		stbuf.delete(0,2); //문자열 일부 삭제
//		System.out.println(stbuf.toString());
//		
//		stbuf.replace(0, 3, "AB"); //문자열 일부 교체
//		System.out.println(stbuf.toString());
//		
//		stbuf.reverse(); // 문자열 내용 뒤집기
//		System.out.println(stbuf.toString());
//		
//		String sub = stbuf.substring(2, 4); // 일부만 문자열로 반환
//		System.out.println(sub);
		
		
//		double e = 3.141517;
//		String se = String.valueOf(e);
//		
		
//		String st1 = "Coffe";
//		String st2 = "Bread";
//		
//		String st3 = st1.concat(st2);
//		System.out.println(st3);
//		
//		String st4 = "Fresh".concat(st3);
//		System.out.println(st4);
	}

}
