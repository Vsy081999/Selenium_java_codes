package codes_Lucky;

public class string_palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";

		int size = str.length();
		
		String rev="";

		for (int i = size - 1; i >= 0; i--) {

		     rev=rev+str.charAt(i);

		}

		if(str.equals(rev)) {
			
			System.out.println("string is plaidrome");
			
			
		}else {
			
			System.out.println("string is not plaidrome");
		}
		
		
	}

}
