package codes_string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Occurance_of_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		String str = "aabbbccccccdddd";

		char[] s = str.toCharArray();

		for (char c : s) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			} else {

				hm.put(c, 1);

			}

		}

		for (Map.Entry Entry : hm.entrySet()) {

			System.out.println(Entry.getKey() + " " + Entry.getValue());

		}

	}

}
