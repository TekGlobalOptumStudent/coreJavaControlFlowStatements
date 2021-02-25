package coreJavaControlFlowStatements;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		testIf();
		testIfElse();
		testIfElseIf();
		testOutOfRange();
		printGrade();
		printWeekdaySwitch();
	}

	/**
	 * Write a program that declares 1 integer variable x, and then 
	 * assigns 7 to it. Write an if statement to print out “Less 
	 * than 10” if x is less than 10. Change x to equal 15 and 
	 * notice the result (console should not display anything).
	 */
	private static void testIf() {
		System.out.println("printIfLessThan10: ");
		int x = 7;
		if(x < 10) {
			System.out.println("Less than 10");
		}
		
		x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		}
	}
	
	/**
	 * Write a program that declares 1 integer variable x, and then 
	 * assigns 7 to it. Write an if-else statement that prints out 
	 * “Less than 10” if x is less than 10 and “Greater than 10” if 
	 * x is greater than 10. Change x to 15 and notice the result.
	 */
	private static void testIfElse() {
		System.out.println("testIfElse: ");
		int x = 7;
		if(x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		
		x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
	}
	
	/**
	 * Write a program that declares 1 integer variable x, and then 
	 * assigns 15 to it. Write an “if-else-if” statement that prints 
	 * out “Less than 10” if x is less than 10, “Between 10 and 20” 
	 * if x is greater than 10 but less than 20, and “Greater than 
	 * or equal to 20” if x is greater than or equal to 20. Change x 
	 * to 50 and notice the result.
	 */
	private static void testIfElseIf() {
		System.out.println("testIfElseIf: ");
		int x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		} else if(x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than 20");
		}
		
		x = 50;
		if(x < 10) {
			System.out.println("Less than 10");
		} else if(x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else {
			System.out.println("Greater than 20");
		}
	}
	
	/**
	 * Write a program that declares 1 integer variable x, and then 
	 * assigns 15 to it. Write an if-else statement that prints “Out 
	 * of range” if the number is less than 10 or greater than 20 
	 * and prints “In range” if between 10 and 20 (including equal to 
	 * 10 or 20). Change x to 5 and notice the result.
	 */
	private static void testOutOfRange() {
		System.out.println("testOutOfRange: ");
		int x = 15;
		if(x < 10 || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}
		
		x = 5;
		if(x < 10 || x > 20) {
			System.out.println("Out of range");
		} else {
			System.out.println("In range");
		}
	}
	
	
	/**
	 * Write a program that uses if-else-if statements to print out 
	 * grades A, B, C, D, F according to the following criteria:
	 *	A: 90-100
	 *	B: 80-89
	 *	C: 70-79
	 *	D: 60-69
	 *	F: <60
	 *	Use the Scanner class to accept a number score from the user 
	 *	to determine the letter grade. Print out “Score out of range.” 
	 *	if the score is less than 0 or greater than 100.
	 */
	private static void printGrade() {
		System.out.println("printGrade:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 0 and 100: ");
		int input = sc.nextInt();
		if(input >= 90 && input <= 100) {
			System.out.println("A");
		} else if(input >= 80 && input < 90) {
			System.out.println("B");
		} else if(input >= 70 && input < 80) {
			System.out.println("C");
		} else if(input >= 60 && input < 70) {
			System.out.println("D");
		} else if(input >= 0 && input < 60) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range.");
		}
		//sc.close();
		//if you close scanner early, you lose System.in input stream for subsequent scanner calls
	}
	
	/**
	 * Write a program that accepts an integer between 1 and 7 from 
	 * the user. Use a switch statement to print out the corresponding 
	 * weekday. Print “Out of range” if the number is less than 1 or 
	 * greater than 7. Don’t forget to include “break” statements in 
	 * each of your cases.
	 */
	private static void printWeekdaySwitch() {
		System.out.println("printWeekdaySwitch:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 7: ");
		int input = sc.nextInt();
		switch(input) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Out of range");
		}
		sc.close();
	}
}
