package test;

import java.util.Scanner;

public class emp1 {
	int eno,salary;
	String ename;
	emp1(int n,int s,String na)
	{
		eno=n;
		ename=na;
		salary=s;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n, s,no,flag=0;
		String na;
		System.out.println("enter the number of employees:");
		no=in.nextInt();
		emp1 obj[]=new emp1[10];
		for(int i = 0;i <=no;i++){
			System.out.print("Enter the employee id : ");
			n= in.nextInt();
			in.nextLine();
			System.out.print("Enter the employee name : ");
			na = in.nextLine();
			System.out.print("Enter the employee salary : ");
			s = in.nextInt();
			obj[i] = new emp1(n,s,na);
		}
		System.out.print("Enter the employee id : ");
		n = in.nextInt();
		for(int i=0;i<no;i++){
			if(obj[i].eno == n){
				System.out.println("Employee id : "+ obj[i].eno);
				System.out.println("Employee name : "+ obj[i].ename);
				System.out.println("Employee salary : "+ obj[i].salary);
				flag=1;
			}
		}
		if(flag == 0){
			System.out.println("Employee not available");
		}
		
		

	}

}
