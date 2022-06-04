package operations;

import java.util.Scanner;

public class sub implements calculate {

	public static void main(String[] args) {

	}

	@Override
	public void calculate() {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		a= sc.nextInt();
        System.out.println("enter the second number : ");
        b= sc.nextInt();
        int sub=a-b;
        System.out.println("difference of two numbers is : "+sub);
		
		
	}

}
