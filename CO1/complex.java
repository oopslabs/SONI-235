import java.util.Scanner;
public class complex {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=in.nextInt();
		System.out.println("enter the second number:");
		b=in.nextInt();
		System.out.println(a + "+" + b + "i");
		System.out.println("enter the first number:");
		c=in.nextInt();
		System.out.println("enter the second number:");
		d=in.nextInt();
		System.out.println(c + "+" + d + "i");
		System.out.println("sum is");
		e=a+c;
		System.out.println(e);
		f=b+d;
		System.out.println(f);
		System.out.println("sum of complex numbers is:");
		System.out.println(e + "+" + f + "i");
		
		
		
		
		

	}

}
