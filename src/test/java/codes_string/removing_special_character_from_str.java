package codes_string;

public class removing_special_character_from_str{

	public static void main(String[] args) {

		String str = "This#string%contains^special*characters&.";
		
		String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(str1);

	}

}