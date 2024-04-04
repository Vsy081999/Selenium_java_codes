package codes_string;

public class reverseEachWord {

	public static void main(String[] args) {

		String str = "this is java code";
		String output = " ";
		String words[] = str.split(" ");

		for (String string : words) {
			String revword = " ";
			for (int i = str.length() - 1; i >= 0; i--) {
				revword = revword + str.charAt(i);
			}

			output = output + revword + " ";
		}

		System.out.println("output   :" + output);

	}
}
