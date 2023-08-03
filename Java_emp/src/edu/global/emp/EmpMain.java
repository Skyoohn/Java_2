package edu.global.emp;

import java.util.List;

import edu.global.emp.dao.EmpDao;
import edu.global.emp.dto.EmpDto;

public class EmpMain {
		public static void main(String[] args) {
		      EmpDao dao = new EmpDao();
		      List<EmpDto> emps = dao.getEmps();
		      
		      for ( EmpDto emp : emps) {
		         System.out.print("사원번호: " + emp.getEmpno()+" ");
		         System.out.println("사원이름: " + emp.getEname());
		         System.out.println("입사일: " + emp.getHiredate());
		         System.out.print("업무: " + emp.getJob()+" ");
		         System.out.print("담당 매니저: " + emp.getMgr()+" ");
		         System.out.println("업무 번호: " + emp.getDeptno());
		         System.out.print("봉급: " + emp.getSal()+" ");
		         System.out.print("보너스: " + emp.getComm());
		      }
		}
}