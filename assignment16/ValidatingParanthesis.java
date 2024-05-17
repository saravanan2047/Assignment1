package assignment16;

import java.util.Scanner;
import java.util.Stack;

public class ValidatingParanthesis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input :");
		String input = scan.nextLine();
		if (isBalanced(input)) {
			System.out.println("The Given Input" + input + " is Balanced");
		} else {
			System.out.println("The Given Input" + input + " is not Balanced");
		}
		scan.close();
	}

	public static boolean isBalanced(String paranthesis) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < paranthesis.length(); i++) {
			if (paranthesis.charAt(i) == '(' || paranthesis.charAt(i) == '[' || paranthesis.charAt(i) == '{') {
				if (paranthesis.charAt(i) == '(') {
					stack.push(')');
				} else if (paranthesis.charAt(i) == '[') {
					stack.push(']');
				} else {
					stack.push('}');
				}
			} else if (paranthesis.charAt(i) == ')' || paranthesis.charAt(i) == ']' ||paranthesis.charAt(i) == '}') {
				if (!stack.isEmpty() && paranthesis.charAt(i) != stack.pop()) {
					return false;
				}
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
