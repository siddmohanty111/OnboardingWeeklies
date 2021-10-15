package po_10152021due;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Problem1 {

	public static Map<String, Integer> people_to_age = new HashMap<>();
	
	public static void main(String[] args) {
		
		people_to_age.put("Sidd", 22);
		people_to_age.put("Mike", 14);
		people_to_age.put("Donald", 73);
		people_to_age.put("Joe", 39);
		
		mapIterateWhile();
	}

	public static void mapIterateWhile() {
		Iterator<Map.Entry<String, Integer>> itr = people_to_age.entrySet().iterator(); 
		
		while (itr.hasNext()) {
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	public static void mapIterateAdvanceFor() {
		
		for (Entry<String, Integer> entry : people_to_age.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
