package hashmapNhashtable;

import java.util.HashMap;

import java.util.Hashtable;

public class HashmapNhashtable {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put(null, null);
		hMap.put("22", null);
		System.out.println(hMap);
		Hashtable<String, String> ht=new Hashtable<String, String>();
		//HashTable 不能装入null，无论是key还是value
//		ht.put(null, null);
//		ht.put("22", null);
		System.out.println(ht);
	}
}
