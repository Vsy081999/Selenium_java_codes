package z_InterviewProgrames;

public class TC003_Palidrome_string {

	public static void main(String[] args) {

		String str = "madam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);

		}

		if (!str.equals(rev)) {

			System.out.println("not palidrome");
		} else {
			System.out.println("palidrome");
		}

	}
}
