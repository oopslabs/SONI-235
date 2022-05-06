package err;

import java.util.Scanner;

class publisher{
	  String pname;

	  public publisher(String pname)
	  {
	      this.pname=pname;
	  }
}

class book2 extends publisher
{
	String book;
		public book2(String pname,String book)
		{
super(pname);
this.book=book;
		}}

class literature extends book2
	{
		public literature(String pname,String book)
		{
			super(pname,book);
		}
		void display()
		{
		    System.out.println("publisher:         "+pname+"\n");
		    System.out.println("book:              "+book+"\n");
		}}
class fiction extends book2
{
	public fiction(String pname,String book)
	{
		super(pname,book);
	}
	void display()
	{
	    System.out.println("publisher:         "+pname+"\n");
	    System.out.println("book:               "+book+"\n");
	}
	
}
public class jjjj {

	public static void main(String[] args) {
		System.out.println("Enter the  number of literature books : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        fiction t[]=new fiction[n];
        System.out.println("Enter the literature book details : ");
        int i;
        for(i=0;i<n;i++)
        	
        {
        	Scanner p=new Scanner(System.in);
            System.out.println("Enter publisher:");
            String a=p.nextLine();
      
            System.out.println("Enter book:");
            String b=p.nextLine();
           
            
           t[i]=new fiction(a,b);
          
        }
        System.out.println(".....literature books details...");
        for(i=0;i<n;i++)
        {
            t[i].display();
        } 

        System.out.println("Enter the  number of fiction books : ");
        Scanner s1=new Scanner(System.in);
        int n1=s1.nextInt();
        fiction t1[]=new fiction[n1];
        System.out.println("Enter the fiction book details : ");
        
        for(int j=0;j<n1;j++)
        	
        {
        	Scanner q=new Scanner(System.in);
            System.out.println("Enter publisher:");
            String c=q.nextLine();
            q.nextLine();
            System.out.println("Enter book:");
            String d=q.nextLine();
            q.nextLine();
            
            t1[j]=new fiction(c,d);
          
        }
        System.out.println(".....fiction books details...");
        for(int j=0;j<n1;j++)
        {
            t1[j].display();
        } 
	}

}
