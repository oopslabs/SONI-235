package Co1;
import java.util.LinkedList;
import java.util.Scanner;
public class Qn11 {

	public static void main(String[] args) {
		LinkedList<String> link=new LinkedList<>();
		link.add("hii");
		link.add("all");
		link.add("what");
		link.add("is");
		link.add("your");
		link.add("name");
		for(String p:link)
			System.out.println(p+"");
		link.clear();
		System.out.println("Linkedlist:"+link);

	}

}
