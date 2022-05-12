package mca235;
import java.util.*;
interface ar{
	void area();
	void perimeter();
	double pi=3.14;
	
}
class aa implements ar{
	Scanner in =new Scanner(System.in);
	double a;
	int r;
	double p;
	@Override
	public void area() {
		
		
		System.out.println("enter the radius of circle:");
		r=in.nextInt();
		a=2*pi*r*r;
		System.out.println("the area of circle:");
		System.out.println(a);
		
	}

	@Override
	public void perimeter() {
		
		System.out.println("enter the radius of circle:");
		r=in.nextInt();
		System.out.println("the perimeter of circle:");
		p=2*pi*r;
		System.out.println(p);
		
	}

	
	}
	

class rec implements ar{
	Scanner in=new Scanner(System.in);
	int a,l,b,p;

	@Override
	public void area() {
		
		System.out.println("enter the length of rectangle:");
		l=in.nextInt();
		System.out.println("enter the breadth of rectangle:");
		b=in.nextInt();
		a=l*b;
		System.out.println("area of rectangle:");
		System.out.println(a);
		
		
	}

	@Override
	public void perimeter() {
		p=2*l+2*b;
		System.out.println("perimeter of rectangle:");
		System.out.println(p);
		
		
	}
	
	
}
public class circ {

	public static void main(String[] args) {
		aa obj=new aa();
		obj.area();
		obj.perimeter();
		rec obj1=new rec();
		obj1.area();
		obj1.perimeter();
		

	}

}
