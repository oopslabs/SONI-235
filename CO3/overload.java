package co3;

public class overload {
	void area(float x)
	{
		System.out.println("area of square:"+Math.pow(x, 2)+"sq units");
	}
	void area(float x,float y)
	{
		System.out.println("area of rectangle:"+x*y+"sq units");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println("area of square:"+z+"sq units");
	}

	public static void main(String[] args) {
		overload obj=new overload();
		obj.area(5);
		obj.area(5,6);
		obj.area(2.5);

	}

}
