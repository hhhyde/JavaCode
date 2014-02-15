package a8_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsNotaNumber {

//	public static void main(String[] args) {
//		String aa = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forest...with ...a herring!";
//		String bb="ja       !v a.g    !g                      j";
//		String cc="a3b111cc24";
//		String dd="ds.gif ?ojo.gif";
//		System.out.println(Arrays.toString(aa.split(" ")));
//		//System.exit(0);
//		System.out.println(Arrays.toString(bb.split("\\s")));//空白符
//		System.out.println(Arrays.toString(cc.split("\\d")));//数字
//		System.out.println(Arrays.toString(cc.split("\\D+")));//数字
//		System.out.println(Arrays.toString(cc.split("[^b]3b")));
//		System.out.println(Arrays.toString(aa.split("\\bu")));
//		Pattern pn=Pattern.compile("\\d+");
//		Matcher matcher=pn.matcher("dwadwada");
//		matcher.replaceAll("dwda");
//	}
	public static void main(String[] args) {
		String aa="Java now has regular expression ";
		System.out.println(Arrays.toString(aa.split("^java")));
		System.out.println(Arrays.toString(aa.split("^Breg.*")));
		System.out.println(Arrays.toString(aa.split("n.w\\s+h(a|i)s")));
	}
}
