package codes_Primno;

public class Find_prime_no_from_array {

	public static void main(String[] args) {

		int[] array = { 3, 4, 6, 7, 9 };

		for (int i = 0; i < array.length; i++) {

			boolean isPrime = true;

			for (int j = 2; j < array[i]; j++) {

				if (array[i] % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {

				System.out.println(array[i] + ":   are the prime numbers in the array ");
			}
		}

	}
}
