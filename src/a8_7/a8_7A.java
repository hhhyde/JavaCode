package a8_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class a8_7A {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> all = new ArrayList<Integer>();
		ArrayList<Integer> remove = new ArrayList<Integer>();
		"dwada dwa dwa dwa".split(" ");
		remove.add(1);
		remove.add(2);
		for (int i = 0; i < 5; i++) {
			all.add(random.nextInt(4));
		}
		System.out.println(remove);
		System.out.println(all);
		all.remove(remove);
		System.out.println(all);
		Iterator<Integer> allit = all.iterator();
		while (allit.hasNext()) {
			System.out.println(allit.next());
		}
	}
}
