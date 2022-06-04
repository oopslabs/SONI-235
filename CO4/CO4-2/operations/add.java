package operations;
import java.util.*;
public class add implements calculate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculate() {
		int r,s;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        r= sc.nextInt();
        System.out.println("enter the second number : ");
        s= sc.nextInt();
        int sum=r+s;
        System.out.println("sum of two numbers is : "+sum);
		
	}

}
