//Core Java program to check if a number is a palindrome or not
//Ex. Input1 = 121, Input2 = 123
//Ex. Output2 = "Palindrome", Output2 = "Not a palindrome"

package coreJavaPkg;

public class TestClass11 {

	public static void main(String[] args) {
		int[] n = {123456,112211,121,1,34234};
		int index = 0;
		
		for(int i:n) {
			//Variable to store the reversed number
			int revInt = 0;	
			
			//Variable to store the remainder after a division
			int rem;
			
			//Loop while number > 0
			while(i>0) {
				
				//Modulus of 10
				rem = i%10;
				
				//Add it to the reverse number variable by multiplying with 10
				revInt = revInt*10 + rem;
				
				//Divide the number by 10
				i = i/10;				
			}
			
			//n[index] is the original number, revInt is the reversed number
			System.out.print(n[index] + " - " + revInt + ": ");
			if(n[index++] == revInt) { System.out.println("Palindrome"); }
			else { System.out.println("Not Palindrome"); }
		}		
	}	
}