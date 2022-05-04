package err;

import java.util.*;

public class sss {
	int empId;
    String name;
    int salary;
    String address;
    public sss(int empId,String name,int salary,String address)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}
 class Teacher extends sss
    {
    String department,subject;
    public Teacher(int empId,String name,int salary,String address,String department,String subject)
    {
        super(empId,name,salary,address);
        this.department=department;
        this.subject=subject;
    }
    void display()
    {
        System.out.println("EMPID\t\tNAME\t\tSALARY\t\tADDRESS\t\tDEPARTMENT\t\tSUBJECT\n");
        System.out.println(empId+"\t\t"+name+"\t\t"+salary+"\t\t"+address+"\t\t"+department+"\t\t"+subject+"\n");
    }

	public static void main(String[] args) {
		
        System.out.println("Enter the  number of teachers : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Teacher t[]=new Teacher[n];
        int i;
        for(i=0;i<n;i++)
        	
        {
        	Scanner p=new Scanner(System.in);
            System.out.println("Enter empid:");
            int a=p.nextInt();
            p.nextLine();
            System.out.println("Enter name:");
            String c=p.nextLine();
            p.nextLine();
            System.out.println("Enter salary:");
            int b=p.nextInt();
            p.nextLine();
            System.out.println("Enter address:");
            String d=p.nextLine();
            p.nextLine();
            System.out.println("Enter department:");
            String e=p.nextLine();
            p.nextLine();
            System.out.println("Enter subject:");
            String f=p.nextLine();
            p.nextLine();
            t[i]=new Teacher(a,c,b,d,e,f);
          
        }
        for(i=0;i<n;i++)
        {
            t[i].display();
        } 

	}

}
