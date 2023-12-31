package codes_string;

import java.util.HashMap;

public class Occrance_of_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "This this is is done by Saket Saket";
		String str= st.toLowerCase();
		String[] str1 = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String s : str1) {

			if (hm.containsKey(s)) {

				hm.put(s, hm.get(s) + 1);

			}else {
				
				hm.put(s,1);
			}

			
		}
		
		System.out.println(hm);

	}

}
