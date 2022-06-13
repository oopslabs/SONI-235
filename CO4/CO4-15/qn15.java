package Co1;
import java.util.*;
public class qn15 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hash=new LinkedHashSet<>();
		hash.add(10);
		hash.add(20);
		hash.add(30);
		hash.add(40);
		hash.add(50);
		for(Integer p:hash) {
		 System.out.println(p);
		}
		System.out.println("remove a number:"+hash.remove(20));
		System.out.println("contains a number 30 :"+hash.contains(30));
		System.out.println("size of the set:"+hash.size());
		System.out.println("contains a number 60:"+hash.contains(60));


	}

}
