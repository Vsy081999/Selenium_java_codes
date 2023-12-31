package codes_Primno;

public class Find_prime_no {

	public static void main(String[] args) {

		int num = 9;
		
		boolean isprime = true;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				isprime = false;

				break;

			}

		}

		
		if (isprime) {
			System.out.println("no is prime");
			
		} else {

			System.out.println("no is not prime");
		}
		
	}

}
