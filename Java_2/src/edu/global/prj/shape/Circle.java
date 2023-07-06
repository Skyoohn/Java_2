package edu.global.prj.shape;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double rad){
		radius = rad;
	}
	@Override //오버라이딩을 알림
	public double getArea() {
		return radius * radius *Math.PI;
	}
	
	}