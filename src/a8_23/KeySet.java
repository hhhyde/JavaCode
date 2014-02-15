package a8_23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeySet {
	public static void main(String[] args) {

		Map myMap = new HashMap();
		myMap.put("1", "hjkhjk");
		myMap.put("2", "dacz");
		myMap.put("3", "gqa");
		myMap.put("2", "weqwea");
		myMap.put("5", "hhut");
		Iterator it = myMap.keySet().iterator();
		for (Iterator iterator = myMap.keySet().iterator(); iterator.hasNext();) {
			Object key = (Object) iterator.next();
			System.out.println(key);
		}
	}
}
