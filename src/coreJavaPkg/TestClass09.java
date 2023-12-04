//Core Java program to check if the parenthesis "()" or "{}" or "[]" are balanced in an expression
//Ex. Input1 = "[{}]", Input2 = "{[}]"
//Ex. Output2 = "Balanced", Output2 = "Not balanced"

package coreJavaPkg;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class TestClass09 {
	
	public static void main(String[] args) {
		String[] inputExp = {"([{}])","()[[]]{}","{]}","([()]","[{)]"};
		List<Integer> output = new ArrayList<Integer>();		
		boolean balanceFlag = true;
		
		//Loop for every input expression in the inputExpr String array
		for(String input:inputExp) {
			
			//Instantiate a new stack
			Stack<Character> exprStack = new Stack<Character>();			
			
			//Loop through the input string character wise
			for(int i=0;i<input.length();i++) {
				
				Character ch = input.charAt(i);
				Character popCh;
				
				try {
					switch(ch){
						//Check if the character is an open parenthesis "(" or "{" or "["
						case '(':
						case '{':
						case '[':
							//Push it to the stack
							exprStack.push(ch);
							break;
							
						//Check if the character is a closing parenthesis ")" or "}" or "]"				
						case ')':
							//Pop the top element of the stack
							popCh = exprStack.pop();
							
							//AND check that the top stack element is the equivalent open parenthesis
							if(popCh == '(') { break; }
							
							//Else Not balanced flag set and exit the loop
							else { balanceFlag = false; break; }
							
						case '}':
							popCh = exprStack.pop();							
							if(popCh == '{') { break; }
							else { balanceFlag = false; break; }
							
						case ']':
							popCh = exprStack.pop();
							if(popCh == '[') { break; }
							else { balanceFlag = false; break; }								
					}
				}

				//If empty stack exception is caught during a pop operation, input is not balanced
				catch (EmptyStackException e) {
					balanceFlag = false; 
					break;
				}	
				
				//If the length of the input expression is reached and stack is not empty, input is not balanced
				if(i==input.length()-1 && !exprStack.isEmpty()) {
					balanceFlag = false;
				}				
			}
			
			//output = 1 means balanced, output = 0 means not balanced
			if(balanceFlag) output.add(1);
			else output.add(0);
			
			//Reset balanceFlag for the next input expression
			balanceFlag = true;
		}	
	
		//Print the outcome
		for(int i=0;i<inputExp.length;i++) {
			System.out.print("Input = '" + inputExp[i] + "' is "  );
			if(output.get(i) == 0) System.out.print("Not Balanced");
			if(output.get(i) == 1) System.out.print("Balanced");
			System.out.println();
		}
	}
}
