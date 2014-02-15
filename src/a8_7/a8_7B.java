package a8_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class a8_7B {
	public void count(int n){
		Map<Integer, Integer> accountMap = new HashMap<Integer, Integer>();
		Random ran = new Random();
		for (int i = 0; i < n; i++) { 		// 0-9 放进长度为50的集合里看 找出某个重复几次的数
			int key = ran.nextInt(10); 		// 0-9
			//System.out.println(key);
			Integer value = accountMap.get(key);
			if (value == null) {
				value = 1;
			} else {
				value++;
			}
			accountMap.put(key, value);
		}
		System.out.println(accountMap);
//		for (int i = 0; i < 10; i++) {
//			if (accountMap.get(i) == null) {
//				continue;
//			}
//			if (accountMap.get(i) != 2) { 	// 找出重复几次的数
//				accountMap.remove(i);
//			}
//		}
//		System.out.println(accountMap);
		for (int key : accountMap.keySet()) {
			System.out.print(key);
			System.out.print("出现了");
			System.out.println(accountMap.get(key)+"次");
		}
	}
}
