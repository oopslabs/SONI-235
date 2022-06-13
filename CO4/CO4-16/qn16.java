package Co1;
import java.util.*;
public class qn16 {

	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println("hash set 1:"+h1+"");
		HashSet<Integer> h2=new HashSet<>();
		h2.add(20);
		h2.add(10);
		h2.add(30);
		System.out.println("hash set 1:"+h1+"");
		System.out.println("are they equal:"+h1.equals(h2));

	}

}
