package com.javaex.ex03;

public class Shape {
	
	//private --> protected 자식클래스에서 사용가능하게 변경
	protected String fillColor;
	protected String lineColor;
	
	//Shape(0)인 생성자 생성
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	
}

