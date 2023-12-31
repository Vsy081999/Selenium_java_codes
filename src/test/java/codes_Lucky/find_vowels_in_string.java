package codes_Lucky;

public class find_vowels_in_string {

	public static void main(String[] args) {

		
		
	String	str="vishwanath";
	
	   char[] string = str.toCharArray();
	//	char[] string = { 'a', 'b', 'c', 'd', 'e', 'd', 'd', 'e' };

		int count = 0;
		for (int i = 0; i < string.length; i++) {

			if (string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u') {

				System.out.println("vowels  :" + string[i]);
				count++;

			}

		}

		System.out.println("count   :"+count);
		
	}

}
