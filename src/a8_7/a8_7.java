package a8_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class a8_7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add('a');
		list.add(22);
		list.add("aa");
		list.add('a');
		Iterator iterator = list.iterator();
		HashSet hSet = new HashSet(list);
		Iterator hsit = hSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");
		for (Object object : hSet) {
			System.out.println(object);
		}
		System.out.println("------------------");
		while (hsit.hasNext()) {
			System.out.println(hsit.next());

		}
	}
}
