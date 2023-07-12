package edu.global.Dmain;

import java.util.List;

import edu.global.dao.Dao;
import edu.global.dto.Dto;

public class DMain {
	public static void main(String[] args) {
	Dao dao = new Dao();
	List<Dto> emps = dao.getEmps();
	
	for (Dto emp : emps) {
		System.out.println("사원번호 " + emp.getEmpno()+" ");
		System.out.println("사원이름 " + emp.getEname()+" ");
		System.out.println("입사일" + emp.getHiredate()+" ");
		System.out.println("업무" + emp.getJob()+" ");
		System.out.println("담당 매니저"+emp.getMgr()+" ");
		System.out.println("업무번호"+emp.getDeptno()+" ");
		System.out.println("봉급" + emp.getSal());
		System.out.println("보너스"+emp.getComm());
	}
	}
}