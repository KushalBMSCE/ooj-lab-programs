import java.util.Scanner;
abstract class Shape
{
	Scanner s=new Scanner(System.in);
	double dim1;
	double dim2;
	abstract void printArea();
}
class Rectangle extends Shape
{
	Rectangle(){
	System.out.println("Enter the dimensions of rectangle (length, breadth) :");
	dim1=s.nextDouble();
	dim2=s.nextDouble();
	}
	void printArea()
	{
		System.out.println("Area of Rectangle : "+ dim1*dim2);
	}
}
class Triangle extends Shape
{
	Triangle(){
	System.out.println("Enter the dimensions of Triangle (base, height) :");
	dim1=s.nextDouble();
	dim2=s.nextDouble();
	}
	void printArea()
	{
		System.out.println("Area of Triangle : "+(dim1*dim2)/2 );
	}
}
class Circle extends Shape
{
	Circle(){
	System.out.println("Enter the dimensions of Circle (radius) :");
	dim1=s.nextDouble();
	}
	void printArea()
	{
		System.out.println("Area of Circle : "+ 3.14*dim1*dim1);
	}
}
class Main{
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		r.printArea();
		t.printArea();
		c.printArea();
		System.out.println("Kushal Naidu N \n 24BECS408"); 
}
}