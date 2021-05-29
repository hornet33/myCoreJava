package CoreJavaPkg;

import java.util.List;
import java.util.ArrayList;

public class TempChecks {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof String);
		System.out.println(list.get(1) instanceof Integer);
	}
}