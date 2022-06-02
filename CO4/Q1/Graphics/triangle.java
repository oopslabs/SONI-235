package Graphics;

import java.util.Scanner;

public class triangle implements area {

	public static void main(String[] args) {
		
	}

	@Override
	public void area() {
		int b,h;
		double area;
		Scanner sc = new Scanner(System.in);
        System.out.println("Input base of triangle : ");
        b= sc.nextInt();
        System.out.println("Input height of triangle : ");
        h= sc.nextInt();
        area = .5*b*h;
        System.out.println("Area of the circle is : "+area);
		
	}

}
