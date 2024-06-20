package codes_string;

public class removing_special_character_from_str{

	public static void main(String[] args) {

		String str = "This#%^*.stringcontains^specialcharacters";
		
//		String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		String str1 = str.replaceAll("\\W", "");// for removing special character
		
		System.out.println(str1);
		
		
		

	}

}