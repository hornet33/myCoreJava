//Core Java program to find the min num of reversals needed to make an expression balanced which has only "{" and "}" brackets
//Ex. Input1 = "}{", Input2 = "{{}{"
//Ex. Output2 = 2, Output2 = 1

package coreJavaPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TestClass10 {

	public static int getMinStepsForReversal(String input) {
		
		//Use the stack data structure to maintain the logic
		Stack<Character> expStack = new Stack<Character>();
		
		//Where m = total open braces and n = total close braces
		//toalBrackets = m + n
		int totalBrackets = 0;
		int n = 0;
		
		//First check: Input should be of an even count
		if(input.length()%2 != 0) {
			return(-1);
		}
		
		//Next, loop through the input string and remove the already balanced parts
		for(int i=0; i<input.length(); i++) {
			Character ch = input.charAt(i);
			
			switch(ch) {
			//If it is an open bracket, always push to the stack
			case '{':
				expStack.push(ch);
				break;
			
			//If it is a closing bracket
			case '}':
				
				//And if the stack is not empty and there is an open bracket at the top of the stack 
				if(!expStack.isEmpty() && expStack.peek() == '{') {
					//Remove the balanced portion from consideration as it will not need any reversals
					expStack.pop();
					break;
				}
				//Otherwise push the closing bracket to the stack
				else { 
					expStack.push(ch); 
					break; 
				}
			}
		}
		
		//After the loop, the stack has only the unbalanced brackets (m+n)
		totalBrackets = expStack.size();
		
		//Count the total number of open braces and store in 'n'
		while(!expStack.isEmpty() && expStack.peek() == '{') {
			expStack.pop();
			n++;
		}
		
		//Return the minimum number of reversals = m/2 + n/2 = (m+n)/2 + n%2
		//Either as shown below (m+n)/2 + n%2
		//return( (totalBrackets/2) + (n%2) );

		//OR as shown below Ceiling(m/2) + Ceiling(n/2)
		//Since the variables are stored as int, casting to double for calculation
		//Finally casting back to int since return type is int
		return (int) Math.ceil((double)(totalBrackets-n)/2) + (int) Math.ceil((double)n/2);
	}

	public static void main(String[] args) {
		String[] inputExp = {"}","{","{{}{","}}{{","{{}","{}","}{"};
		List<Integer> output = new ArrayList<Integer>();
		
		//For each input expression, call the method and add the return value to the output List
		for(String s: inputExp) {
			output.add(getMinStepsForReversal(s));
		}
		
		//Print the outcome
		for(int i=0;i<inputExp.length;i++) {
			System.out.print("Input = '" + inputExp[i] + "': ");
			if(output.get(i) == -1) System.out.print("Cannot be converted to a balanced expression");
			else System.out.print("Minimum reversals to a balanced expression = " + output.get(i));
			System.out.println();
		}
	}
}
