import java.io.BufferedWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

//class Board{}
//class PBoard extends Board{}
//
//class ClassCast{
//	public static void main(String[] args) {
//		Board pdb1 = new PBoard();
//		PBoard pbd2 = (PBoard)pdb1;
//		
//		System.out.println("..intermediate location..");
//		Board ebd1 = new Board();
//		PBoard ebd2 = (PBoard)ebd1;
//	}
//}

public class J230629 {

	public static void main(String[] args) {
		
		
//		// Long 형으로 표현 가능한 값의 크기 출력
//		System.out.println("최대 정수"+Long.MAX_VALUE);
//		System.out.println("최소 정수"+Long.MIN_VALUE);
//		System.out.println();
//		
//		//매우 큰 수를 BigInteger 인스턴스로 표현
//		BigInteger big1 = new BigInteger("1000000000000000000000");
//		BigInteger big2 = new BigInteger("-999999999999999999999");
//		
//		//BigInteger 기반 덧셈 연산
//		BigInteger r1 = big1.add(big2);
//		System.out.println("덧셈결과"+r1);
//		
//		//BigInteger 기반 곱셈 연산
//		BigInteger r2 = big1.multiply(big2);
//		System.out.println("곱셈결과"+r2);
//		System.out.println();
		
		
//		Integer n1 = Integer.valueOf(5);
//		Integer n2 = Integer.valueOf("1024");
//		
//		System.out.println("큰수"+Integer.max(n1, n2));
//		System.out.println("작은수"+Integer.min(n1, n2));
//		System.out.println("합"+Integer.sum(n1, n2));
//		System.out.println();
//		
//		System.out.println("12의 2진 표현" + Integer.toBinaryString(12));
//		System.out.println("12의 8진 표현" + Integer.toOctalString(12));
//		System.out.println("12의 16진 표현"+ Integer.toHexString(12));
		
//		Integer num1 = Integer.valueOf(10);
//		Integer num1 = new Integer(10);
//		Integer iObj = 10;
//		iObj++;
//				
//		System.out.println(iObj);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(num1.intValue());
//		System.out.println(num1.doubleValue());
//		
//		Double num2 = new Double(3.14);
//		System.out.println(num2.intValue());
//		System.out.println(num2.doubleValue());
		
//		Scanner sc = null;
//		int answer = (int)(Math.random()*100+1);
//		int num=0;
//		int count = 1;
//		
//		while(true) {
//		System.out.println("1~100 사이에 숫자를 맞춰보세요 :");
//		try {
//			sc = new Scanner(System.in);
//			num = sc.nextInt();
//		} catch (Exception e) {
//			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
//			continue;
//		}
//		
//		
//		if(num > answer) {
//			System.out.println("down");
//		}
//		else if(num < answer) {
//			System.out.println("UP");
//		}
//		else if(num == answer) {
//			System.out.println("정답입니다." + count + "회만에 맞췄어요.");
//			break;
//		}
//		count++;
//		}
		

		
//        Path file = Paths.get("C:\\javastudy\\Simple.txt");
//        BufferedWriter writer = null;
//		
//		writer = Files.newBufferedWriter(file);
		
//		Scanner kb = new Scanner(System.in);
//		
//		try {
//			System.out.print("a/b...a?");
//			int n1 = kb.nextInt();
//			
//			System.out.print("a/b...b?");
//			int n2 = kb.nextInt();
//			
//			System.out.print(n1 / n2);	
//		} catch (ArithmeticException | InputMismatchException e) {
//			e.printStackTrace();
////		System.out.println(e.getMessage());	
//		}
//		System.out.println("good bye~~!");
	}

}
