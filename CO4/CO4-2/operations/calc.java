package operations;
import calc.add;
import calc.sub;
import calc.multi;
import calc.division;
import java.util.*;
public class calc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
        add obj1 = new add();
        sub obj2 = new sub();
        multi obj3 = new multi();
        division obj4 = new division();
                System.out.println("Choose any    1)add   2)sub   3)multi  4)division: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj1.calculate();
                        break;
                    case 2:
                        obj2.calculate();
                        break;
                    case 3:
                        obj3.calculate();
                        break;
                    case 4:
                        obj4.calculate();
                    default:
                        break;

	}
		

	}

}
