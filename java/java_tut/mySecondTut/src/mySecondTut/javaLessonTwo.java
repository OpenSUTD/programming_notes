package mySecondTut;

import java.util.Scanner;
import java.util.*;

public class javaLessonTwo {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("your number");
		
		if (userInput.hasNextInt()){
			
			int number = userInput.nextInt();
			
			System.out.println("you entered:" + number);
		} else {
			System.out.println("enter a int next time");
			
			int numCeiling = (int) Math.ceil(5.23);
			// round up the number
			System.out.println(numCeiling);
			
			System.out.println(Math.random());
			// random gives a random num 0~1
		}
	}
	
}
