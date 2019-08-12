package assignment_2;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {
		Triangle t = new Triangle(4, 5, 6);
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(3, 5);
		
		t.findArea();
		t.findPerimeter();
		
		c.findArea();
		c.findPerimeter();
		
		r.findArea();
		r.findPerimeter();
		
	}
}
