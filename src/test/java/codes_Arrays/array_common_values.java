package codes_Arrays;

public class array_common_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = { 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr1.length; j++) {

				if (arr[i] == arr1[j]) {

					System.out.println(arr[i]);

				}

			}

		}

	}

}
