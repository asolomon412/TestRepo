import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		// this is a single line comment

		/*
		 * This is an example of a block comment -- usually used for multiple lines
		 * 
		 * -- also useful for generating our own java documentation
		 */

		System.out.print("Hi! "); // anything coming after will print on the same line
		System.out.println("My name is Antonella"); // anything coming after will print on a new line
		System.out.print("Hi Again! ");

		// create a Scanner object to consume input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name: ");
		String fullName = scan.nextLine();
		System.out.println(fullName);

		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		System.out.println(age);

		// adding garbage line to clean out the scanner
		// you will need to do this when you are going from scanning a number to
		// a nextLine()
		scan.nextLine();

		System.out.println("Enter your address: ");
		String address = scan.nextLine();
		System.out.println(address);

		// two lines
		char a; // declaring a variable
		a = 'A'; // initializing a variable

		// one line declaring and initializing
		boolean test = true;

		// this is a constant, once created it can't be changed
		// because of the final keyword, usually a best practice to use all CAPS for the
		// naming
		// identifier
		final String COMPANYNAME = "Grand Circus";
		// COMPANYNAME = "Park"; -- this can't be done

		final int ROOM_NUMBER = 445;

		// primitive data types -- they are stored in the stack memory and have an
		// assigned value
		byte b = 127;
		short s = 128;
		int i = 128;
		int max = Integer.MAX_VALUE;
		System.out.println("Integer MAX =" + max);
		long l = 78798789789789789L; // L needs to be specified if the number assigned is smaller than the MAX.SIZE
										// of an int
		float f = (float) 67.8; // can use lowercase f or capital F as well
		double d = 67.8;
		char c = '@';
		boolean bool = false;
		
		int num = 0;
		System.out.println(num);
		
		//int remainder = 9 % 5;
		System.out.println(9 % 5);
		
		// pre-incrementing
		int num2 = 6;
		//++num2;
		System.out.println(++num2);
		
		// post-incrementing
		int num3 = 6;
		//num2++;
		System.out.println(num2++);
		
		
		// increment/decrement is the same as saying +1 (increment)  or -1 (decrement)
		int example = 3;
		//example--;
		//example = example - 1;
		example -= 1;
		System.out.println(example);
		
		int negativeNum = -56; // demonstrating that you can assign negative values in java 
		
		// implicit casting example 
		// when going from a less precise type to a more precise type java does it automatically
		int price = 3;
		double rightPrice = price;
		System.out.println(rightPrice);
		
		// explicit casting
		// when we go from a more precise data type to a less precise data type 
		// we have to let java know that we know what we're doing 
		double total = 99.78;
		int newTotal = (int)total; // truncating the decimal places
		System.out.println(newTotal); 
		
		
		
		scan.close();
		

	}
	
}
