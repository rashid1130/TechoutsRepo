package com.nit.test;
import java.util.Scanner;


public class PalindromeSmallBig {


	public static boolean check(String word) 
	{ 

		int n = word.length(); 


		word = word.toLowerCase(); 


		for (int i = 0; i < n; i++, n--) 
		{ 
			if (word.charAt(i) != word.charAt(n - 1)) 
				return false; 
		} 

		return true; 
	} // close of check()

	public static void lengthPal(int temp, String words[]) 
	{ 

		int count = 0; 
		String smallest = "", longest = ""; 

		for (int i = 0; i < temp; i++) { 

			if (check(words[i])) { 
				count++; 


				if (count == 1) 
					smallest = longest = words[i]; 


				else { 

					if (smallest.length() > words[i].length()) 
						smallest = words[i]; 

					if (longest.length() < words[i].length()) 
						longest = words[i]; 
				} 
			} 
		} 

		if (count == 0) 

			System.out.println("No palindrome found"); 

		else { 

			System.out.println("Smallest palindrome: " + smallest); 
			System.out.println("Biggest palindrome: " + longest); 
		} 
	} // close of lengthPal()

	public static void main(String[] args) 
	{ 

		String string = "wow madam is driving racecar"; 
		String word = ""; 

		String[] words = new String[100]; 
		int temp = 0; 


		string = string + " "; 

		for (int i = 0; i < string.length(); i++) { 

			if (string.charAt(i) != ' ') { 
				word = word + string.charAt(i); 
			} 



			else { 

				words[temp] = word; 
				temp++; 
				word = ""; 
			} 
		} 

		System.out.println("Input String : " + string); 
		lengthPal(temp, words); 
	} 
}




