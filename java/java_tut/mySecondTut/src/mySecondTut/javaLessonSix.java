package mySecondTut;
import java.util.*;
import java.io.*;
// exception and exception handling
/* common Exception
 * ArithmeticException
 * ClassNotFoundException
 * IllegalArgumentException
 * IndexOutOfBoundsExceptions
 * InputMismatchExceptions
 * IOException
 */
public class javaLessonSix {
	
	static Scanner userInput = new Scanner(System.in);
	
//	public static void main(String[] args) {
//		divideByZero(2);
//	}
//	
//	public static void divideByZero(int a) {
//		try {
//			System.out.println(a/0);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			
//			System.out.println(e.toString());
//			
//			e.printStackTrace(); // print the error that will occur on your screen
//		}
//	}
	
//	public static void main(String[] args) {
//		System.out.println("how old are you");
//		
//		int age = checkValidAge();
//		
//		
//	}
//	
//	public static int checkValidAge() {
//		try {
//			return userInput.nextInt(); 
//		} catch (InputMismatchException e) {
//			userInput.next(); // ignore the last input, this is for error
//			System.out.println("this is not a whole number");
//			return 0;
//			
//		}
//	}

	public static void main(String[] args) {
		try{
			getAFile("./somestuff.txt");
		} catch (IOException e){
			System.out.println("an IO exception have occured");
		} 
	}
	// question: why here only allows file not found exception here.
	public static void getAFile(String filename) throws IOException, FileNotFoundException{
//		try {
//		FileInputStream file = new FileInputStream(filename); // this is how you input a file
//		} catch(FileNotFoundException e) {
//			System.out.println(e.toString());
//			System.out.println("file not found");
//		} catch (IOException e) {
//			System.out.println("Unknown IO error");
//		} catch (Exception e) {
//			System.out.println(e.toString()); // less exact error
//		} /*catch( ClassNotFoundException | IOException e){
//		} */ finally {
//		}
//			// clean up duty. this will definely be called
		}
}
