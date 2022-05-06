package err;

import java.util.Scanner;

class p2{
  String name;
  String gender;
  String address;
  int age;

  public p2(String name,String gender,String address,int age)
  {
      this.name=name;
      this.gender=gender;
      this.address=address;
      this.age=age;
  }
}
class e2 extends p2
{
	int empid;
	String company_name;
	String qualification;
	int salary;
		public e2(String name,String gender,String address,int age,int empid,String company_name,String qualification,int salary)
		{
  super(name,gender,address,age);
  this.empid=empid;
  this.company_name=company_name;
  this.qualification=qualification;
  this.salary=salary;
		}}
public class teacher2 extends e2{
	int teacherid;
	String subject;
	String department;
	
public teacher2(String name,String gender,
		String address,int age,
		int empid,String company_name,
		String qualification,
		int salary,int teacherid,
		String subject,
		String department)
{
    super(name,gender,address,age,empid,company_name,qualification,salary);
    this.teacherid=teacherid;
    this.subject=subject;
    this.department=department;
}
void display()
{
    System.out.println("name:         "+name+"\n");
    System.out.println("gender:        "+gender+"\n");
    System.out.println("address:       "+address+"\n");
    System.out.println("age:             "+age+"\n");
    System.out.println("empid:           "+empid+"\n");
    System.out.println("company_name:     "+company_name+"\n");
    System.out.println("qualification:    "+qualification+"\n");
    System.out.println("salary:             "+salary+"\n");
    System.out.println("teacherid:          "+teacherid+"\n");
    System.out.println("subject:          "+subject+"\n");
    System.out.println("department:          "+department+"\n");
    
}


	public static void main(String[] args) {
		System.out.println("Enter the  number of teachers : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        teacher2 t[]=new teacher2 [n];
        int i;
        for(i=0;i<n;i++)
        	
        {
        	Scanner p=new Scanner(System.in);
            System.out.println("Enter name:");
            String a=p.nextLine();
            p.nextLine();
            System.out.println("Enter gender:");
            String b=p.nextLine();
            p.nextLine();
            System.out.println("Enter address:");
            String c=p.nextLine();
            p.nextLine();
            System.out.println("Enter age:");
            int d=p.nextInt();
            p.nextLine();
            System.out.println("Enter empid:");
            int e=p.nextInt();
            p.nextLine();
            System.out.println("Enter company_name:");
            String f=p.nextLine();
            p.nextLine();
            System.out.println("Enter qualification:");
            String g=p.nextLine();
            p.nextLine();
            System.out.println("Enter salary:");
            int h=p.nextInt();
            p.nextLine();
            System.out.println("Enter teacherid:");
            int j=p.nextInt();
            p.nextLine();
            System.out.println("Enter subject:");
            String k=p.nextLine();
            p.nextLine();
            System.out.println("Enter department:");
            String l=p.nextLine();
            p.nextLine();
            
            t[i]=new teacher2(a,b,c,d,e,f,g,h,j,k,l);
          
        }
        for(i=0;i<n;i++)
        {
            t[i].display();
        } 
	}

}
