package Co1;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Qn14 {

	public static void main(String[] args) {
		Deque<String> d=new LinkedList<>();
		d.add("one");
		d.add("two");
		d.addFirst("three");
		d.addLast("four");
		d.push("five");
		d.offer("six");
		d.offerFirst("seven");
		System.out.println("queue"+d+"");
		
		d.removeFirst();
		System.out.println("after first:"+d+"");
	d.removeLast();
	System.out.println("after Last:"+d+"");

	}

}
