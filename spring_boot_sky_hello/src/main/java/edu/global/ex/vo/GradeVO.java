package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GradeVO {
   
   private int kor;
   private int eng;
   private int math;
   
   public double getTotal() {
      return (kor + eng + math) ;
   }
   
   public double getAvg() {
      return (kor + eng + math) / 3.0;
   }
   
   public char getGrade() {
      char ch = '가';
      double avg = getAvg();

      if (avg >= 90) {
         ch = '수';
      } else if (avg >= 80) {
         ch = '우';
      } else if (avg >= 70) {
         ch = '미';
      } else if (avg >= 60) {
         ch = '양';
      }else {
         ch ='가';
      }

      return ch;
   }
   
}