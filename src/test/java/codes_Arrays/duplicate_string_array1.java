package codes_Arrays;

public class duplicate_string_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = { "noida", "delhi", "agra", "noida"};

		for (int i = 0; i < str.length; i++) {

			int count = 0;
			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {

					// System.out.println("duplicate :" + str[i]);

					count++;

				}

			}

			if (count > 1) {

				System.out.println("count  :" + count + " " + str[i]);
			}

		}

	}

}
