//Core Java program to return only unique values from a String
//Ex. Input = "Selenium Rahul Maven Rahul"
//Ex. Output = "Selenium Rahul Maven"

package CoreJavaPkg;

public class TestClass12 {

	public static void main(String[] args) {
		String input = "Rahul Selenium Rahul Caterpillar Test Selenium";		
		String[] ti = input.split(" ");		
		String output = "";
		boolean existsFlag = false;
		
		for(String si:ti) {
			
			String[] to = output.split(" ");
			
			for(String so:to) {				
				if(si.equalsIgnoreCase(so)) {
					existsFlag = true;
					break;
				}
			}			
			if(!existsFlag) {
				output = output.concat(si).concat(" ");
			}
			existsFlag = false;
		}
		System.out.println(output);
	}
}
