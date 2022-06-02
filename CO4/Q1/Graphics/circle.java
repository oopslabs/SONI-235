package Graphics;
import java.util.*;
public class circle implements area {

	public static void main(String[] args) {

	}
	@Override
	public void area() {
		int r;
		double area;
		Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of circle : ");
        r= sc.nextInt();
        area = 3.14*r*r;
        System.out.println("Area of the circle is : "+area);
        
	}

}
