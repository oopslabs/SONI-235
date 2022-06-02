package Graphics;

import java.util.Scanner;

public class square implements area{

	public static void main(String[] args) {
		
	}

	@Override
	public void area() {
		int a,area;
		Scanner sc = new Scanner(System.in);
        System.out.println("Input area of square : ");
        a= sc.nextInt();
        area = a*a;
        System.out.println("Area of the circle is : "+area);
        
		
	}

}
