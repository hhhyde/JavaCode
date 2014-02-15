package a8_21;

import java.util.*;

class StringAddress {
	private String s;

	public StringAddress(String s) {
		this.s = s;
	}

	public String toString() {
		return super.toString() + " " + s;
	}

}

public class a8_21 {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(Collections
				.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("world"));
		System.out.println(list);
	}
}
