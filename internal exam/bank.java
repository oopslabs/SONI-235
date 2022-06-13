package exception;
import java.util.*;
class userException extends Exception

{

	userException(String mg)

	{

		super(mg);

	}

}
public class bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b;
		int c;
		int e;
		System.out.println("enter your bank balance");

		b=sc.nextInt();
		System.out.println("enter your money ");

		c=sc.nextInt();
		
		 try

		 {

			 if(b>c)

			 {
				 System.out.println("Successfully deposited "+c);
				 int d=b+c;
				 System.out.println("bank balance "+d);

				 

			 }

			 else
			 {
				 throw new userException("failed");

				 

			 }

			 

		 }catch(userException ex)

		 {

			 System.out.println(ex.getMessage());

		 }

	}

}
