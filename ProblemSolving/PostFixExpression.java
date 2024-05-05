package ProblemSolving;

import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Expression :" );
		String s=scan.next();
		Stack<Integer> stack= new Stack<Integer>();
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
				{
					stack.push(s.charAt(i)-48);
				}
			else
			{
				switch(s.charAt(i))
				{
				case '+': 	int num1=stack.pop();
							int num2=stack.pop();
							res=num1+num2;
							stack.push(res);
							break;
				case '-':   int num3=stack.pop();
							int num4=stack.pop(); 
							res=num4-num3;
							stack.push(res);
							break;
				case '*' : int num5=stack.pop();
						   int num6=stack.pop();
							res=num5*num6;
							stack.push(res);
							break;
				case '/' :  int num7=stack.pop();
							int num8=stack.pop();
				            res=num8/num7;
				            stack.push(res);
				            break;
				}
			}
		}
		System.out.println(stack.pop());

	}

}
