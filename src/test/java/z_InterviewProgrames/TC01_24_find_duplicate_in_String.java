package z_InterviewProgrames;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_24_find_duplicate_in_String {

	public static void main(String[] args) {

		String str = "thiss";
		System.out.println(duplicate_string(str));

	}

	public static boolean duplicate_string(String s) {

		for (int i = 0; i < s.length(); i++) {

			for (int j = i+1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					return true;
					
					//t==h

				}

			}

		}
		return false;

	}
}

