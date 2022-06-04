package operations;
import java.util.*;
public class multi implements calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculate() {
		int c,d;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        c= sc.nextInt();
        System.out.println("enter the second number : ");
        d= sc.nextInt();
        int multi=c*d;
        System.out.println("product of two numbers is : "+multi);
		
	}

}
