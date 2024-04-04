package codes_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		int num = 153;
		System.out.println(Isamstrong(num));
	}

	public static boolean Isamstrong(int num) {
		int digit = countdigit(num);
		int n = num;
		int ans = 0;

		while (n != 0) {

			int rem = n % 10;

			ans += (int) Math.pow(rem, digit);

			n /= 10;

		}
		if (ans == n) {
			return true;
		}
		return false;
	}

	public static int countdigit(int num) {
		int count = 0;
		while (num != 0) {
			int rem = num % 10;

			count++;

			num /=10;

		}

		return count;

	}

}
