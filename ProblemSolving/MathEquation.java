package ProblemSolving;

import java.util.Scanner;

public class MathEquation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Equation : ");
		String equ = scan.nextLine();
		int sol = 0;
		if (!"+-*/".contains(equ.substring(0, 1)) && !"+-*/".contains(equ.substring(equ.length() - 1))) 
		{
			String[] res = equ.split("[+-/%*]");
			
			if(res.length>=2) 
			{
				int sum = Integer.parseInt(res[0]);
				int j = 1;
			for (int i = 0; i < equ.length(); i++) 
			{
				if (!Character.isDigit(equ.charAt(i)) && equ.charAt(i)!=' ') 
				{
//					if (!Character.isDigit(equ.charAt(i + 1))) 
//					{
						switch (equ.charAt(i)) 
						{
						case '+':
							sum += Integer.parseInt(res[j]);
							j ++;
							break;
						case '-':
							sum -= Integer.parseInt(res[j]);
							j ++;
							break;
						case '*':
							sum *= Integer.parseInt(res[j]);
							j ++;
							break;
						case '/':
							sum /= Integer.parseInt(res[j]);
							j ++;
							break;
						case '%':
							sum%=Integer.parseInt(res[j]);
							break;
						default : continue;
						}
//					} 
//					else {
//						System.out.println("Invalid-1 ");
////						break;
//					}
				}
			}
			System.out.println(sum);
		} 
		else 
		{
			System.out.println("Invalid-2 "+res.length);
			
		}
		
	}
		else System.out.println("Invalid");
	}
}
/*public class EvlExpression {
    public static void main(String[] args) {
        String val="41+4*2";
        boolean flag=false;
        String[] splValue=val.split("[%*+-/]");
        int first = 0,second=0;
        int index=0;
        if(splValue.length>=2){
            first=Integer.parseInt(splValue[0]);
            for(int i=1;i< splValue.length;i++){
                for(int j=index;j<val.length();j++){

                    if(!Character.isDigit(val.charAt(val.length()-1)) || (!Character.isDigit(val.charAt(j)) && !Character.isDigit(val.charAt(j+1)))){
                        System.out.println("Invalid");
                        return;
                    }
                    if(!Character.isDigit(val.charAt(j)) && Character.isDigit(val.charAt(j+1))){
                        second=Integer.parseInt(splValue[i]);
                        if(val.charAt(j)=='+'){
                            first=first+second;
                        }
                        else if(val.charAt(j)=='*'){
                            first=first*second;
                        }
                        else if(val.charAt(j)=='-'){
                            first=Math.abs(first-second);
                        }
                        else if(val.charAt(j)=='/'){
                            first=first/second;
                        }
                        index=j+1;
                        break;
                    }
                }
            }
        }
        else {

            System.out.println("Invalid");
            return;
        }
        System.out.println(first);

    }
}*/
