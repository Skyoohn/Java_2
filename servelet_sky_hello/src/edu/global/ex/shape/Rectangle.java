package edu.global.ex.shape;

import java.io.IOException;

public class Rectangle {
	private double width,height;
	
	public Rectangle(double width,double height){
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width * height;
	}
	
}