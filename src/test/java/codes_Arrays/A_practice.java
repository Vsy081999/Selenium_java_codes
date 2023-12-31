package codes_Arrays;

public class A_practice {

	public static void main(String[] args) {

		/*
		 * int arr[] = { 1, 2, 3, 4, 5, 6 }; int arr1[] = { 5, 6, 7, 8, 9, 10 }; for
		 * (int i = 0; i < arr1.length; i++) { for (int j = 0; j < arr1.length; j++) {
		 * if (arr[i] == arr1[j]) { System.out.println("common number  :" + arr[i]);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */

		int arr[] = { 1, 2, 3, 4, 5, 6, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					//System.out.println("duplicate :" + arr[i]);
					count++;
				}

			}

			if (count > 1) {

				System.out.println("count   :" + count+" "+ arr[i]);

			}

		}

	}

}
