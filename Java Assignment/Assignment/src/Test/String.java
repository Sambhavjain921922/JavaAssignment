package Test;

import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		java.lang.String sam = sc.nextLine();
		sam = sam.replaceAll("\\s","");
		System.out.println(sam);
		
	
	}

}
