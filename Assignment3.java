package coreJavaControlFlowStatements;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		testIf();
		testIfElse();
		testIfElseIf();
		testOutOfRange();
		printGrade();
		printGradeSwitch();
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
	private static void printGradeSwitch() {
		System.out.println("printGradeSwitch:");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 0 and 100: ");
		int input = sc.nextInt();
		switch(input) {
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: 
			case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: 
			case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: 
			case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: 
			case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: 
			case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: 
				System.out.println("F");
				break;
			case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
				System.out.println("D");
				break;
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
				System.out.println("C");
				break;
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				System.out.println("B");
				break;
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99:
			case 100:
				System.out.println("A");
				break;
			default:
				System.out.println("Score out of range.");	
		}
		sc.close();
	}
}
