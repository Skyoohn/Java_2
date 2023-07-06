
public class A230618 {

	public static void main(String[] args) {
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				if(i*j % 2 ==1)
//					System.out.println(i + " X " + j + " = " + (i * j));;
//			}
//		}
//	
//	}
//}
//		int n1 = 5;
//		int n2 = 5;
//		
//		if(n1 < n2) {
//			System.out.println("n1 > n2 is true");
//		}
//		if(n1 == n2) {
//			System.out.println("n1 == n2 is true");
//		}
//		else {
//			System.out.println("n1 == n2 is false");
//		} // else는 if가 거짓일때 실행되기 때문
		
//		int n = 3;
//		
//		switch(n) {
//		case 1:
//			System.out.println("sim");
//			break;
//		case 2:
//			System.out.println("fun");
//			break;
//		case 3:
//			System.out.println("fan");
//			break;
//		default:
//				System.out.println("best");
//		}	
//			System.out.println("like");
		
		
//		int num = 1;
//		int sum = 0;
//		
//		while(num <= 10) {
//			sum = sum+num;
//			System.out.println(sum);
//			num++;
//		}
//		System.out.println("합" + sum);
		
//		double 국어 = 90;
//		double 영어 = 70;
//		double 수학 = 45;
//		
//		double sum = 국어 + 영어 + 수학;
//		System.out.println(("총점 : " + sum));
//		
//		double average = (double)(국어 + 영어 + 수학) / 3;
//		System.out.println(("평균 :") + average);
//		
//		if(90 <= average) {
//			System.out.println("성적 : 수");
//		}
//		else if(80 <= average) {
//			System.out.println("성적 : 우");
//		}
//		else if(80 <= average) {
//			System.out.println("성적 : 미");
//		}
//		else if(80 <= average) {
//			System.out.println("성적 : 양");
//		}
//		else {
//			System.out.println("성적 : 가");
//		}
		
//		int num1 = -6;
//		int num2 = 10;
//		int num3 = 1;
//		
//		int max = num1;
//		
//		if(num1<num2) {
//			max = num2;
//		}
//		if(num2<num3) {
//			max = num3;
//		}
//		System.out.println(max);
		
		
//		int month = 9;
//		
//		switch(month) {
//		case 12:
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("겨울입니다");
//			break;
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("봄입니다");
//			break;
//		case 7:
//		case 8:
//			System.out.println("여름입니다");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을입니다");
//		}
//		System.out.println("그렇습니다.");
		
		
//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum = sum + num;
//			num++;
//		}while(num <= 10);
//		
//		System.out.println(sum);
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 ==1)
//				
//				sum = sum + 1;
//		}
//		System.out.println(sum);
		
		
//		int sum = 0;
//		for(int i =1; i <= 100; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
//		for(;;) {
//			System.out.println("무한루프");
//		}
		
//		int dan = 7;
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(dan + "*" + i + "=" + (dan * i));
//		}
		
		
//		int count = 0;
//		for(int i = 1; i <= 10000; i++) {
//			if((i % 7 == 0) && (i % 11 ==0)) {
//				
//				System.out.println(i);
//				count++;
//				if(count == 20) {
//				break;
//				
//				// 20개까지만 찾기
//				}
//			}
//			
//		}
//		int num = 1;
//		boolean search = false;
//		
//		while(num < 100) {
//			if(((num % 5) == 0) && ((num % 7) ==0)) {
//				search = true;
//				break; //이게 없으면 안멈춤
//			}
//			num++;
//		}
//		if(search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("못찾음");
//		
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j <10; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}
		
//		for(int i = 1; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//				if(i % 2 == 0)
//					continue; // 가 붙으면 짝수와 만나 탈출하여 홀수만 나옴
//					
//					System.out.println(i + " x " + j + " = " + (i * j));
//			}
//		}
		
		
//		for(int i = 1; i < 10; i++) {
////			System.out.println(i);
//			for(int j = 1; j < 10; j++) {
//				
//			int result = i * j;
//			if(result % 2 == 0)
//				System.out.println(i + "X" + j + " = " + (i * j));
//			
//			}
//		}
		
//		int month = 11;
//		
//		switch(month) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			System.out.println(month + "월은 " + "31일 입니다.");
//			break;
//		case 2:
//			System.out.println(month + "월은 " + "28일 입니다.");
//			break;
//		case 4: case 6: case 9: case 11:
//			System.out.println(month + "월은 " + "30일 입니다.");
//			
//			
//		}
//		System.out.println();
//		System.out.println("끗");
