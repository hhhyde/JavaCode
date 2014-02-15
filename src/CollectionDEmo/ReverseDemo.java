package CollectionDEmo;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {
	ArrayList<String> content = new ArrayList<String>();

	private void print(ArrayList<String> list) {
		StringBuilder sB = new StringBuilder();
		for (String string : list) {
			sB.append(string);
			sB.append(",");
		}
		String s = sB.toString();
		System.out.println(s.substring(0, s.length() - 1));
	}

	void add(String s) {
		content.add(s);
	}

	void printit() {
		print(content);
	}

	void printReverse() {
		ArrayList<String> cr = content;
		Collections.reverse(cr);
		print(cr);
	}

	public static void main(String[] args) {
		ReverseDemo rDemo=new ReverseDemo();
		rDemo.add("one");
		rDemo.add("two");
		rDemo.add("three");
		rDemo.printit();
		rDemo.printReverse();
	}
}
