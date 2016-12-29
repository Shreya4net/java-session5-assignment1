package session5;

public abstract class Fig {
public abstract double area();
public abstract double perimeter();
}
public class Circle extends Fig{
	final double radius;
	final double pi=Math.PI;
	public Circle(){
		this(1);
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public double area(){
		return pi*Math.pow(radius, 2);
	}
	public double perimeter(){
		return 2*pi*radius;
		
	}
	}
public class Rectangle extends Fig{
	final double width,length;
	public Rectangle(){
		this(1,1);
	}
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double area(){
		return width*length;
	}
	public double perimeter(){
		return 2*(width+length);
	}
}
public class Triangle extends Fig{
	final double a,b,c;
	public Triangle(){
		this(1,1,1);
	}
	public Triangle(double a,double b,double c){
		this.a=a;
				this.b=b;
				this.c=c;
	}
	public double area(){
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double perimeter(){
		return a+b+c;
	}
}
public class Figure{
	public static void main(String[] args){
		double radius=5;
		Fig circle=new Circle(radius);
		System.out.println("Circle radius:"+radius+"\nResulting Area:"+circle.area()+"\nResulting Perimeter:"+circle.perimeter()+"\n");
	double width=5,length=7;
	Fig rectangle=new Rectangle(width,length);
	System.out.println("Rectangle width:"+width+"and length:"+length+"\nResulting Area:"+rectangle.area()+"\nResulting Perimeter:"+rectangle.perimeter()+"\n");
	double a=4,b=3,c=5;
	Fig triangle=new Triangle(a,b,c);
	
	System.out.println("Triangle side lengths:"+a+","+b+","+c+"\nResulting Area:"+triangle.area()+"\nResulting Perimeter:"+triangle.perimeter()+"\n");
	
			
}

}