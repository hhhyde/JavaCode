package interview;

import java.util.ArrayList;

public class ComparableDemo implements Comparable<ComparableDemo> {

	String name;

	@Override
	public int compareTo(ComparableDemo c1) {
		if (this.name.length() > c1.name.length()) {
			return 1;
		} else if (this.name.length() == c1.name.length()) {
			return 0;
		} else {
			return -1;
		}
	}

	public String toString() {
		return this.name;
	}

	public static void main(String[] args) {
		ComparableDemo cd1 = new ComparableDemo();
		cd1.name = "1234";
		ComparableDemo cd2 = new ComparableDemo();
		cd2.name = "12345";
		ComparableDemo cd3 = new ComparableDemo();
		cd3.name = "123";
		ComparableDemo cd4 = new ComparableDemo();
		cd4.name = "12";
		ComparableDemo cd5 = new ComparableDemo();
		cd5.name = "123456";
		ComparableDemo cd6 = new ComparableDemo();
		cd6.name = "123456";
		ArrayList<ComparableDemo> cds = new ArrayList<ComparableDemo>();
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		cds.add(cd5);
		System.out.println(cds);
		java.util.Collections.sort(cds);
		System.out.println(cds);
		System.out.println(cd5.equals(cd6));
	}
}
