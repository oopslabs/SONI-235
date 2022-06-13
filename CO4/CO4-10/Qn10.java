package Co1;
import java.util.ArrayList;
import java.util.Scanner;
public class Qn10 {

	public static void main(String[] args) {
		ArrayList<String> fruits=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("1:add\n2:remove\n3:display\n4:exit");
		do {
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1:System.out.println("enter the fruit name");
			       String f=sc.nextLine();
			       fruits.add(f);
			       break;
			case 2:System.out.println("enter the index to remove item");
			       int i=sc.nextInt();
			       sc.nextLine();
			       fruits.remove(i);
			       break;
			case 3:System.out.println("\nfruits:");
			       for(String i1:fruits)
			       {
			    	   System.out.println(i1);
			       }
			       break;
			}
		}while(ch!=4);

	}

}
