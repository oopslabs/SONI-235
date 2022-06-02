package Graphics;
import java.util.*;
public class rectangle implements area {

	public static void main(String[] args) {
		

	}

	@Override
	public void area() {
		int l,b,area;
		Scanner sc = new Scanner(System.in);
        System.out.println("Input length of rectangle : ");
        l= sc.nextInt();
        System.out.println("Input breadth of rectangle : ");
        b= sc.nextInt();
        area = l*b;
        System.out.println("Area of the circle is : "+area);
       
	}

}
