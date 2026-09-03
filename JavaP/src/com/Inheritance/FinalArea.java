package com.Inheritance;


class Shape {
	double area() {
		return 0;
	}
	public double area(int radius) {
		double area=Math.PI*radius*radius;
		return area;
	}
	public double area(int length,int breadth) {
		double area=length*breadth;
		return area;
}
}
class Circle extends Shape{
	
	public double area(int radius) {
		double area=Math.PI*radius*radius;
		return area;
}
}
class Rectangle extends Shape{
	public double area(int length,int breadth) {
		double area=length *breadth;
		return area;
}
}
public class FinalArea {
	public static void main(String[] args) {
		Circle c= new Circle();
		System.out.println("Area of Circle :"+c.area(3));
		Rectangle r = new Rectangle();
		System.out.println("Area of Reactangle :" +r.area(9,10));
	}

}
