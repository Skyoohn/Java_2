package edu.global.ex.shape;

import java.io.IOException;

public class Grade {
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