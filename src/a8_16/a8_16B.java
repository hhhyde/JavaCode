package a8_16;

import java.util.Arrays;

public class a8_16B {
	public static void main(String[] args) {
		char c = 'o';
		String ss = "old";
		char[] chars = { 'a', 'b', 'c' };
		change(c, ss, chars);
		System.out.println(c);
		System.out.println(ss);
		System.out.println(Arrays.toString(chars));
	}
	public static void change(char c, String ss, char[] chars) {
		c = 'n';
		ss = "newstring";
		chars[0] = 'd';
	}
}

//class KKj {
//	char c = 'o';
//	String ss = "old";
//	char[] chars = { 'a', 'b', 'c' };
//
//	public static void change(char c, String ss, char[] chars) {
//		c = 'n';
//		ss = "newstring";
//		chars[0] = 'd';
//	}

