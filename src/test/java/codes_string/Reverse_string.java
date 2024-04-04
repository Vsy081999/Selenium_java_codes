package codes_string;

import java.util.Arrays;
import java.util.Iterator;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String str="vishwanath yadav";
		 * 
		 * int size = str.length();
		 * 
		 * for (int i = size-1; i>=0; i--) {
		 * 
		 * System.out.print(str.charAt(i));
		 * 
		 * }
		 */

		/*
		 * String str1="vishwanath yadav"; char[] s = str1.toCharArray();
		 * 
		 * 
		 * int size1= s.length;
		 * 
		 * for (int i = size1-1; i>=0; i--) {
		 * 
		 * System.out.print(s[i]);
		 * 
		 * 
		 * }
		 */

		String s = "this is you";
		
		String[] ori = s.split("");
		
		String[] rev = new String[ori.length];
		
		for (int i = 0; i < rev.length; i++) {
		
			for (int j = rev.length - 1; j >= 0; j--) {
			
				rev[j] = ori[i];

			}

		}

		System.out.println(Arrays.toString(rev));
		
	}

}
