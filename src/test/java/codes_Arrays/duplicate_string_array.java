package codes_Arrays;

public class duplicate_string_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'f' };

		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					//System.out.println(arr[i]);

					count++;

				}

			}
				if (count>1 ) {
					System.out.println("count  :"+count+" "+arr[i]);
				}
			}

			  
			

		}

	}
