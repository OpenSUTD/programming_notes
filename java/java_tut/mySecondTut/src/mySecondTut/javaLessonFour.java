package mySecondTut;
import java.util.*;
public class javaLessonFour {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		// while loop
//		int i = 1;
//		while (i <= 20){
//			if (i == 3){
//				i += 2;
//				continue;
//				// continue means that it does not execute the next lines
//			}
//			
//			// break out of the loop
//			if (i > 10){
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		
//		String contYorN = "Y";
//		
//		int h = 1;
//		
//		while (contYorN.equalsIgnoreCase("y")) {
//			System.out.println(h);
//			System.out.print("Continue y or n");
//			contYorN = userInput.nextLine();
//			h++;
//		}
		
		// for (declare iterator; conditional statement; change iterator)
		for (int l= 10; l >= 1; l--) {
			System.out.println(l);
		}

		// or we can declare the variables outside the statement
		
		int m, n;
		for (m=1, n=2; m<=9; m+=2, n+=2) {
			System.out.println(m + "\n" + n);
		}
		
	}

}
