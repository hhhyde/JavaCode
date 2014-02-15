package a8_16;

import java.util.Arrays;

public class a8_16 {

	public static void main(String[] args) {
		char ss = 'o';
		String[] cs = { "a", "b", "c" };
		a8_16 gExpression = new a8_16();
		gExpression.test(ss, cs);
		System.out.println(ss);
		System.out.println(Arrays.toString(cs));
	}

	public void test(char ss, String[] cs) {
		ss = 'n';
		cs[0] = "d";
	}

}
//方法中引用到数组是  把该数组放到里面来 进行的  其他的不是