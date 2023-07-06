class Grade{
	int kor, eng, math;
	
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	double getAvg(){
		return (kor + eng + math) / 3.0;     // double 이라서 .0을 붙여야 함
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
		else if(avg >= 60) {
			ch = '양';
		}
		else {
        ch = '가';
		}
	      return ch;
	}
}



public class GradeClass {

	public static void main(String[] args) {
		
		Grade kim = new Grade();   // new 가 메모리로 올리라는 뜻
		
		kim.setGrade(90, 75, 60);
		
		System.out.println(kim.getAvg());
		System.out.println(kim.getGrade());
		
		Grade park = new Grade();
		
		park.setGrade(80, 50, 50);
		
		System.out.println(park.getAvg());
		System.out.println(park.getGrade());
		
		Grade choi = new Grade();
		
		choi.setGrade(100, 90, 100);
		
		System.out.println(choi.getAvg());
		System.out.println(choi.getGrade());
		

	}

}
