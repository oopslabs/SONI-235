package work1;
import java.util.*;

public class Process {
	class processor{
		int crores;
		String manufac;
		processor(int a,String b)
		{
			crores=a;
			manufac=b;
		}
		void getdata(){
			
			System .out.println("crores is:"+ crores);
			System .out.println("manufacturer is:"+ manufac);
			
		}
	}
	
	static class RAM{
		static String memory;
		static String manufac1;
		RAM(String GB,String JERI)
		{
			memory=GB;
			manufac1=JERI;
		}
		void getdata(){
			
			System .out.println("memory is:"+ memory);
			System .out.println("manufacturer is:"+ manufac1);
			
		}
		
	}

	public static void main(String[] args) {
		int cr;
		String m;
		String mem;
		String m1;
		int p;
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the cpu details");
		System.out.println("Enter the processor details:");
		System.out.println("enter the crores:");
		cr=in.nextInt();
		System.out.println("enter the manufacturer:");
		m=in.nextLine();
		System.out.println("Enter the RAM details");
		System.out.println("enter the memory:");
		mem=in.nextLine();
		System.out.println("enter the manufacturer1:");
		m1=in.nextLine();
		System.out.println("enter the price of CPU:");
		p=in.nextInt();
		Process  obj1=new Process ();
		Process .processor obj2=obj1.new processor(cr,m);
		Process .RAM obj3=new Process .RAM(mem,m1);
		System .out.println("processor details:");
		obj2.getdata();
		System .out.println("RAM details:");
		obj3.getdata();
		System.out.println("Price of the CPU1 "+p);		
		

	}

}
