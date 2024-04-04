package z_InterviewProgrames;

public class Test {

	public static void main(String[] args) {

		String str1 = "my name is vishwa";
		String[] str = str1.split(" ");
		String output = " ";
		for (String words : str) {
			String rev = " ";

			for (int i = words.length() - 1; i >= 0; i--) {
				rev = rev + words.charAt(i);
			}
			output = output + rev + " ";
		}
		System.out.println(output);
	}
}
