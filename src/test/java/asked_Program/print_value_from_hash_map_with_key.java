package asked_Program;

import java.util.HashMap;
import java.util.Map;

public class print_value_from_hash_map_with_key {

	public static void main(String[] args) {

		
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("a", 91.12);
		hm.put("b", 92.22);
		hm.put("c", 95.55);
		hm.put("d", 96.66);
		
		for (Map.Entry<String, Double> entry : hm.entrySet()) {
			String key = entry.getKey();
			Double val = entry.getValue();
			
			if (hm.get(key)==95.55) {
				System.out.println(hm.get(key));
				System.out.println(key);
			}
			
			
			
			
		}
		
		
	}
}
