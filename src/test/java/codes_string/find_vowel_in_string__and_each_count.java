package codes_string;

public class find_vowel_in_string__and_each_count {

	public static void main(String[] args) {

		String str = "encyclopeda";

		char[] str1 = str.toCharArray();

		int count  = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;

		for (int i = 0; i < str1.length; i++) {

			if (str1[i] == 'a') {

				count++;
				System.out.println(str1[i] + " " + count);
			}
			if (str1[i] == 'e') {

				count1++;
				System.out.println(str1[i] + " " + count1);

			}
			if (str1[i] == 'i') {

				count2++;
				System.out.println(str1[i] + " " + count2);

			}

			if (str1[i] == 'o') {
				count3++;
				System.out.println(str1[i] + " " + count3);

			}
			if (str1[i] == 'u') {
				count4++;
				System.out.println(str1[i] + " " + count4);

			}

		}

	}

}
