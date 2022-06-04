package operations;

import java.util.Scanner;

public class division implements calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculate() {
		int e,f;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        e= sc.nextInt();
        System.out.println("enter the second number : ");
        f= sc.nextInt();
        int division=e/f;
        System.out.println("sum of two numbers is : "+division);
		
	}

}
