
import java.util.*;
interface prod{
void calculate();
}

class product implements prod{
	int pid;
	  String pname;
	  int pquantity;
	  int unitprice;
	  int total;

	  public product(int pid,String pname,int pquantity,int unitprice,int total)
	  {
		  this.pid=pid;
	      this.pname=pname;
	      this.pquantity=pquantity;
	      this.unitprice=unitprice;
	      this.total=total;
	      
	  }



	
	void display()
	{
		System.out.println(".....product details.....");
		System.out.println("product id\t\tproduct name\t\tproduct quantity\t\tproduct unitprice\t\tproduct total\n");        
	    System.out.println(pid+"\t\t\t"+pname+"\t\t\t"+ pquantity+"\t\t\t"+ unitprice+"\t\t\t"+ total+"\n");       
	                
	}




	@Override
	public void calculate() {
			  System.out.println(sum);
		  }
		
	}

  class Last {
	public static void main(String[] args) {
		System.out.println("Enter the  number of products : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        product t[]=new product[n];
        
        int i;
        for(i=0;i<n;i++)
        	
        {
        	Scanner p=new Scanner(System.in);
        	System.out.println("Enter product id:");
            int e=p.nextInt();
            System.out.println("Enter product name:");
            String a=p.next();
            
            System.out.println("Enter product quantity:");
             int b=p.nextInt();
           
            System.out.println("Enter product unitprice:");
            int c=p.nextInt();
            p.nextLine();
            System.out.println("Enter product total:");
            int d=p.nextInt();
            
           t[i]=new product(e,a,b,c,d);
          
        }
        
        for(i=0;i<n;i++)
        {
            t[i].display();
        }
        
	}
	}


