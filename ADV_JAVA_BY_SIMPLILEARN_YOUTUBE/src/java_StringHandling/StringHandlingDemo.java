package java_StringHandling;

import java.util.Arrays;

public class StringHandlingDemo {

	public static void main(String[] args) {
		String str1 = "Raj is studying ";
		String str2 = "in home.";
		
		System.out.println(str1.length());
		
		String res = str1.concat(str2);
		System.out.println(res);
		
		String.format("The name of student is" + "%s, and the age is" + "variable is %d", "John", 21);
		
		System.out.println(str1.charAt(5));
		
		if(str1.equals(str2))
			System.out.println("Both Strings are equal.");
		else
			System.out.println("Both Strings are different.");
		
		System.out.println(str1.indexOf("y"));           //Checking index value of char y
		
		System.out.println(str1.replace("s", "r"));    // replacing character s with r 
		
		System.out.println(str1.isEmpty());   //Boolean value - false
		
		String[] arr = str1.split(" ");
		Arrays.asList(arr).forEach(s -> System.out.println(s));
		
		String newStr1 = str1.substring(0,5);
		System.out.println(newStr1);
		
	}

}
