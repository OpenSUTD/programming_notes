package mySecondTut;
import java.util.Scanner;

public class javaLessonFive {
//	// static for you to access through different classes
//	static double myPI = 3.14159; // class variable
//	
//	public static void main (String[] args) {
//		// define a function
//		
//		addThem(1,2);
//		
//		System.out.println(addThem(1,2));
//	}
//	public static int addThem(int a, int b) {
//		double smallPI = 3.140; //local Variable
//		
//		System.out.println("Global " + myPI);
//		
//		return 1;
//	}
	
	static int randomNumber;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.println(getRandomNumber());
		
		int randomGuess = 0; // this is different from python that this is not dynamic programming
		int guessResult = 1;
		
		while(guessResult != -1) {
			System.out.println("guess a number between 0 and 50:");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
			
		}
		System.out.println("Yes the random number is" + randomGuess);
	}
		
	public static int getRandomNumber() {
		randomNumber =  (int) (Math.random() * 51);
		return randomNumber; // these randomNubmer is now a public variable
	}
	
	public static int checkGuess(int x) {
		if (x == randomNumber) {
			return -1;
		} else {
			return x;
		}
	}


}
