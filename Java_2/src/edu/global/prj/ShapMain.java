package edu.global.prj;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Rectangle;
import edu.global.prj.shape.Shape;

public class ShapMain {

	public static void main(String[] args) {
		Shape[] shape = {new Circle(10),new Rectangle(10,20)};

		
		double area = 0;
		
		for(Shape s : shape) {
			area = area + s.getArea();
		}
		System.out.println(area);
		
		//폴리몰피즘과 오버라이딩을 적용안하면 이걸 다 써야한다
//		Circle c1 = new Circle(10);
//		Rectangle rec1 = new Rectangle(10);
//		area = c1.getArea() + rec1.getArea();

	}

}
