//구구단과 switch
public class ifelse {

	public static void main(String[] args) {

//			int month = 2;
//			
//			switch(month) {
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				System.out.println(month+"월은 "+"31일 입니다.");
//				break;
//			case 2: 
//				System.out.println(month+"월은 "+"28일 입니다.");
//				break;
//			case 4: case 6: case 9: case 11:
//				System.out.println(month+"월은 "+"30일 입니다.");
//				break;
//			
//			}
//		
//	}
//	}
//		for(int i =1; i <11; i++) {
//			
//			System.out.println(i);
//		for(int j = 1; j < 10; j++)
////			결과 홀수값만 출력
//			if((i*j) % 2 ==1)
//				
////				int result = i * j;
////		        if(result % 2 == 1) 더 좋은 방법
//			System.out.println(i + " X " + j + " = " + (i * j));
//	}
//}		
//}		
		
//		for(int i =1; i <10; i++) {
//			for(int j = 1; j < 10; j++)
//				if(i % 2 == 0) //시간 손해라서 윗칸에 넣는게 나음
////				if(i%2 == 1) 더 좋은 방법
////					continue;
//				System.out.println(i + " X " + j + " = " + (i * j));
//			
//		}

		
//		for(int i = 2; i <10; i++) { // 2단부터 9단까지 진행 위한 바깥쪽 for문
//			for(int j = 1; j < 10; j++) { // 1부터 9까지의 곱을 위한 안쪽 for문
//				System.out.println(i + " X " + j + " = " + (i * j));
//				//j가 10이 되는 순간 메모리에서 사라진다
//				//나와서 i로 가서 1개 올리고 다시 j로 간다(3단)
//			}
//			System.out.println();
//			//아무것도 안넣으면 개행
//		}

//		int num = 1;
//		boolean search = false;
//		
//		// 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
//		
//	while(num < 100) {
//		if(((num % 5) == 0) && ((num % 7) == 0)) {
//			search = true;
//			break; //while문을 탈출
//		}
//		num++;
//		
//		}
//	if(search)
//		System.out.println("찾는 정수 : " + num);
//	else
//		System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
//	}
//}
//		
//		
//		for (int i = 1; i <= 100; i++) {
//			
//			if(((i % 7 == 0) && (i % 11 == 0))
//			System.out.println(i);
//			break;
//		}
		//1부터 100까지의 수 중에 11의 배수이자 7의 배수인 첫번째 숫자
//		
//	}
//}
//		
//		int dan = 7;
//		for (int i = 1; i <= 9; i++) {
//		System.out.println(dan + "*" + i + "=" + (dan * i));
//		///구구단 7단
//		}
//	}
//	}
//		
//		for(int i=0; i < 5; i++) {
//			System.out.println("무한루프");
//		}
		
///5회 반복///
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
		///1부터 100까지의 합//
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0)
//			sum = sum + i;
//		}
//		System.out.println(sum);
		///짝수의 합 구하기///
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 1)
////		    if(i % 2 != 0) 다른 방법
//			sum = sum + i;
//		}
//		System.out.println(sum);
		///홀수의 합 구하기///


//		int num = 1;
//		int sum = 0;
//		
//		do {
//			sum = sum + num;
//			num++;
//		}while(num <= 10);
//		
//		System.out.println(sum);
//	}
//		int num = 1;
//		int sum = 0;
//		
//	    while(num <= 10){
//	   sum = num+sum;
//	   System.out.println(sum);
//	    	
//	   num++;
//	
//
//	    }
//		   System.out.println("합"+sum);   
//	}
//		int month = 8;
//				
//		switch(month){
//		case 12: 
//		case 1:
//		case 2:
//		case 3:
//		System.out.println("겨울입니다");
//		break;
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
//			System.out.println("그렇습니다.");
//		
//	}
//		int num1 = -6;
//		int num2 = 10;
//		int num3 = 1;
//		
//		int max = num1;
//		
//		if(num1<num2) {
//			max = num2;
//		}
//		
//		if(num2<num3) {
//			max = num3;
//		}
//		System.out.println(max);
//		
//	}
//}
		
		//삼항연산자 최대값
		
//		double 국어 = 90;
//		double 영어 = 70;
//		double 수학 = 45;
//		
//		double sum = 국어 + 영어 + 수학;
//		System.out.println(("총점 :") + sum);
//		
//		double average = (double)(국어 + 영어 + 수학) / 3;
//		System.out.println(("평균 :") + average);
//		
//		if(90 <= average) {
//		System.out.println("성적 : 수");
//		}
//		else if(80 <= average) {
//		System.out.println("성적 : 우");
//		}
//		else if(70 <= average) {
//		System.out.println("성적 : 미");
//		}
//		else if(60 <= average) {
//		System.out.println("성적 : 양");
//		}
//		else {
//		System.out.println("성적 : 가");
//		}
//	}
//		int num = 1;
//		int sum = 0;
//		
//		while(num <= 10) {
//			sum = sum+num;
//			System.out.println(sum);
//			num++;
//		}
//		System.out.println("합" + sum);
//	}
//}
		//1부터 10까지의 합
		
		
//		int num = 1;
//		
//		while(num <= 100) {
//			System.out.println("hello world!" + num);
//			num++;
//		}
//		System.out.println(num);
//		
//		
//	}
//}
		//헬로월드 100번
//        int month = 4;
//        
//        switch(month) {
//        case 12:
//        case 1:
//        case 2:
//        case 3:
//            System.out.println("겨율 입니다.");
//            break;
//        case 4:case 5:case 6:           
//            System.out.println("봄 입니다.");
//            break;
//        case 7:
//        case 8:               
//            System.out.println("여름입니다.");
//            break;
//        case 9:
//        case 10:
//        case 11:
//            System.out.println("가을 입니다.");
//            break;
//            
//        default:
//            System.out.println("잘못된 입력입니다.");
//        }
//        
//        System.out.println("프로그램 종료");
//	}
//		int n = 4;
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
//			System.out.println("best");
//			
//		System.out.println("like");
//		}
//		
//	}
//		int result = (5 < 4) ? 50 : 40;
//		System.out.println(result);
//	}
//		int num1 = 600;
//		int num2 = 10;
//		int num3 = 600;
//		
//		int max = num1;
//		
//		if(max <= num2) {
//			max = num2;
//		}
//		if(max <= num3) {
//			max = num3;
//		}
//		System.out.println(max);
//		
//		
//	}
//		int kor, eng, math;
//		int total;
//		double avg;
//		char grade = '가';
//		
//		kor = 90;
//		eng = 70;
//		math = 45;
//		
//		total = kor + eng + math;
//		avg = total / 3.0;
//		
//		if(avg >= 90) {
//			grade = '수';
//		}
//		else if(avg >= 80) {
//			grade = '우';
//		}
//		else if(avg >= 70) {
//			grade = '미';
//		}
//		else if(avg >= 60) {
//			grade = '양';
//		}
//		else {
//			grade = '가';
//		}
//		System.out.println("총점:" + total);
//		System.out.println("평균:" + avg);
//		System.out.println("성적:" + grade);
//	}
//		double 국어 = 90;
//		double 영어 = 70;
//		double 수학 = 45;
//		
//		double sum = 국어 + 수학 + 영어;
//		System.out.println("총점 : " + sum);
//		
//		double average = (double)(국어 + 영어 + 수학) / 3;
//		System.out.println("평균 : " + average);
//		
//	    if(90<=average & average<=100){
//		System.out.println("성적 : 수");
//				  }
//	    else if(80<=average & average<90){
//		System.out.println("성적 : 우");
//				  }
//   	    else if(70<=average & average<80){
//		System.out.println("성적 : 미");
//				  }
//	    else if(60<=average & average<70){
//		System.out.println("성적 : 양");
//				  }
//	    else{
//		System.out.println("성적 : 가");
//				  }
//		
//	}
//		int n1 = 5;
//		int n2 = 7;
//		
//		if(n1 < n2) {
//			System.out.println("n1 > n2 is true");
//		}
//		
//		if(n1 == n2) {
//			System.out.println("n1 == n2 is true");
//		}
//		else {
//			System.out.println("n1 == n2 is false");
//		}
//
//	}

