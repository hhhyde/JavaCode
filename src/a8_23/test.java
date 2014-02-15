package a8_23;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;
import java.util.TreeSet;

import a10_16.a10_16;

import static java.lang.Math.*;

public class test {
	enum Gender {
		Male, Female,
	}

	String aa = "aaa";
	ArrayList<String> al = new ArrayList<String>();

	public void plus(String s) {
		s += "s";
	}

	public void plus(ArrayList<String> l) {
		l.add("xxx");
	}

	public static void main(String[] args) {
		String s1 = "我";
		System.out.println(s1);
		byte[] bytes = s1.getBytes();
		System.out.println(bytes.length);
		test t1 = new test();
		t1.aa = "aa";
		t1.plus(t1.aa);
		System.out.println(t1.aa);
		t1.al = new ArrayList<String>();
		t1.al.add("t1t1");
		t1.plus(t1.al);
		System.out.println(t1.al);
	}
}
