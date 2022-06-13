package Co1;
import java.util.Scanner;
import java.util.Stack;
public class Qn12 {

	public static void main(String[] args) {
		Stack<Integer> ms=new Stack<>();
		ms.add(10);
		ms.add(20);
		ms.add(25);
		ms.add(30);
		System.out.println("elements in stack:"+ms);
		ms.remove(2);
		System.out.println("new stack:"+ms);
	}

}
