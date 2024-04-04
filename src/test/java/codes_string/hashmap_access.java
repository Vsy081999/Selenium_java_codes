package codes_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap_access {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("1", "one");
		hm.put("2", "two");
		hm.put("3", "three");
		hm.put("4", "four");
		hm.put("5", "five");

		for (Map.Entry<String, String> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}

}
