package arraypractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Login {
	public static void generateTopic(String userLogin) {
		String[] userNames = {"Tanner", "Mr. Biggs", "Xavier", "Kaleb", "James", "Brady"};
		for (int i = 0; i < userNames.length; i++) {
//			System.out.println("Please enter your username.");
			if (userNames[i].equals(userLogin)) {
				System.out.println("You are logged in.");
				break;
			} 
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		generateTopic("Tanner");
		System.out.println("Please enter your username.");
		String userLogin = br.readLine();
		String[] userNames = {"Tanner", "Mr. Biggs", "Xavier", "Kaleb", "James", "Brady"};
		for (int i = 0; i < userNames.length; i++) {
			if (userNames[i].equals(userLogin)) {
				System.out.println("You are logged in.");
				break;
			} 
		}
		
	}
}
