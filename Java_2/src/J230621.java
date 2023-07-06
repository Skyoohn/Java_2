class Grade{
	int kor, eng, math;
	
	void setGrade(int kor,int eng,int math){
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	double getAvg() {
		return(kor+eng+math)/3.0;
	}
	char getGrade() {
		
		char ch = '가';
		double avg = getAvg();
		
		if(avg >= 90) {
			ch = '수';
		}
		else if(avg >= 80) {
			ch = '우';
		}
		else if(avg >= 70) {
			ch = '미';
		}
		else {
			ch = '가';
		}
		return ch;
	}
	
}

//class Rectange4{
//	private int width, height;
//	
//	private int getArea() {
//		return width * height;
//	}
//	
//	int getArea2() {
//		getArea();
//		return width * height;
//	}
//}

public class J230621 {

	public static void main(String[] args) {
		
		

//		Rectange4 rec = new Rectange4();
//		
//		rec.width = -5;
//		rec.getArea2();
//		rec.getArea();
//	}
//		
//	}
		Grade grade = new Grade();
		
		grade.setGrade(90, 75, 60);
		
		System.out.println(grade.getAvg());
		System.out.println(grade.getGrade());
		
		
	}

}


//- 클래스 Grade
//- 데이타멤버 : 국어, 영어,수학,총점,평균
//- 함수 : 생성자//국어영어수학 초기화
//- getAvg() // 평균
//- getGrade() //평균에 따른 수우미양가