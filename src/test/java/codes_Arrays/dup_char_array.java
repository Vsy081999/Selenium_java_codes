package codes_Arrays;

public class dup_char_array {

	public static void main(String[] args) {

		char[] string = { 'a', 'b', 'c', 'd', 'e', 'd', 'd', 'e' };

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			int count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;

				}
			}

			if (count > 1 && string[i] != '0')
				System.out.println(string[i] + " " + count);

		}
	}
}
