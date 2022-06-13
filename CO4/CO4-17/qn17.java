package Co1;
import java.util.*;
public class qn17 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("mango",10);
		map.put("orange",15);
		map.put("apple",5);
		map.put("banana",2);
		System.out.println(map);
		
		
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+"  :  "+e.getValue());
		}
		
	}

}
