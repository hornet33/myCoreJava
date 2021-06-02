//Core Java program to check if a number is a palindrome or not
//Ex. Input1 = 121, Input2 = 123
//Ex. Output2 = "Palindrome", Output2 = "Not a palindrome"

package CoreJavaPkg;

public class TestClass11 {

	public static void main(String[] args) {
		int[] n = {123456,112211,121,1,34234};
		int index = 0;
		
		for(int i:n) {
			int revInt = 0;	
			int rem;
			while(i>0) {
				rem = i%10;
				revInt = revInt*10 + rem;
				i = i/10;				
			}
			System.out.print(n[index] + " - " + revInt + ": ");
			if(n[index++] == revInt) { System.out.println("Palindrome"); }
			else { System.out.println("Not Palindrome"); }
		}		
	}	
}