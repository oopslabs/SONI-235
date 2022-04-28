import java.util.Scanner;

public class product {
	 int pcode;
 	 String pname;
     int price;
    
    public void input(){
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter your productcode:");
    	pcode=in.nextInt();
    	in.nextLine();
    	System.out.println("Enter your pname:");
    	pname=in.nextLine();
    	System.out.println("Enter your price:");
    	price=in.nextInt();
    }
    
    public void display(){
    	System.out.println(pcode);
    	System.out.println(pname);
    	System.out.println(price);
    }
    
	public static void main(String[] args) {
		product obj1=new product();
		obj1.input();
		
		product obj2=new product();
		obj2.input();

		product obj3=new product();
		obj3.input();
		
		System.out.println("obj1");
		obj1.display();
		System.out.println("obj2");
		obj2.display();
		System.out.println("obj3");
		obj3.display();
		
		if(obj1.price > obj2.price && obj1.price > obj3.price)
		{
			System.out.println("price of obj1 is greater");
		}
		else if( obj2.price > obj3.price)
		{
			System.out.println("price of obj2is greater");
		}
		else
		{
			System.out.println("price of obj3 is greater");
		}
	}

}
