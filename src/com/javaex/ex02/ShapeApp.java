package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		Shape s1 = new Shape("파랑", "파랑"); //Shape(2)
		System.out.println("================");
		
		
		Triangle t1 = new Triangle();//Shape(0) Triangle(0)
		System.out.println("================");
		
		
		Triangle t2 = new Triangle(3, 4);//Shape(2) Triangle(2)
		System.out.println("================");
		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);//Shape(2) Triangle(4)
		System.out.println("================");
		
	}

}

