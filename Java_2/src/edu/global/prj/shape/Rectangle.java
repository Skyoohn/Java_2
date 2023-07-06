package edu.global.prj.shape;

public class Rectangle extends Shape {
	private double width,height;
	
	public Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	@Override //오버라이딩을 알림
	public double getArea() {
		return width * height;
	}
	
	}