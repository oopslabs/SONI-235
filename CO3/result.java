package err;
import java.util.*;
class sport{
	  String stname;
	  String spname;
	  int rating;

	  public sport(String stname,String spname,int rating)
	  {
		  this.stname=stname;
	      this.spname=spname;
	      this.rating=rating;
	  }
}

class student extends sport
{
	int percentage;
	String grade;
		public student(String stname,String spname,int rating,int percentage,String grade)
		{
super(stname,spname,rating);
this.percentage=percentage;
this.grade=grade;
		}}

public class result extends student {
	public result(String stname,String spname,int rating,int percentage,String grade)
	{
		super(stname,spname,rating,percentage,grade);
	}
	
	void display()
	{
		System.out.println(".....student sports details.....");
		System.out.println("student name\t\tsport name\t\trating\n");        
	    System.out.println(stname+"\t\t\t"+spname+"\t\t\t"+ rating+"\n");       
	    System.out.println(".....student academic details.....");
	    System.out.println("percentage\t\tgrade\n");
	    System.out.println(percentage+"\t\t\t"+grade+"\n");             
	}
	public static void main(String[] args) {
		System.out.println("Enter the  number of students : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        result t[]=new result[n];
        int i;
        for(i=0;i<n;i++)
        	
        {
        	Scanner p=new Scanner(System.in);
        	System.out.println("Enter student  name:");
            String e=p.nextLine();
            System.out.println("Enter sport name:");
            String a=p.nextLine();
      
            System.out.println("Enter rating:");
            int b=p.nextInt();
            System.out.println("Enter percentage:");
            int c=p.nextInt();
            p.nextLine();
            System.out.println("Enter grade:");
            String d=p.nextLine();
            
           t[i]=new result(e,a,b,c,d);
          
        }
        
        for(i=0;i<n;i++)
        {
            t[i].display();
        } 
		

	}

}
