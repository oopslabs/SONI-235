package exception;
import java.util.*;
public class exception {

	public static void main(String[] args) {
		String use="soni seb";
		String pass="July@2099";
		String u,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		u=sc.nextLine();
		System.out.println("enter the password:");
		p=sc.nextLine();
		try
		{
			if(u.equals(use)&&p.equals(pass))
			{
				System.out.println("Access granded");
				//System.exit(1);
			}
			else {
				throw  new userException("Invalid username or password");
			}
		}
		catch(userException e)
		{
			System.out.println(e.getMessage());
		}
	
		//package exception;
		
	}}
	 class userException extends Exception{

		public  userException(String s){
	        super(s);

		}

	}

