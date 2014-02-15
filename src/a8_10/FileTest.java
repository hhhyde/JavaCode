package a8_10;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {
	public static void main(String[] args) {
		File file = new File(
				"F:\\study\\课程\\JSP\\shopping_12\\在线支付\\YeePay_HTMLcommon_V3.0\\易宝支付支付卡LOGO\\易宝支付银行卡LOGO");
		String[] strings = file.list(new FilenameFilter() {

			public boolean accept(File dir, String name) {
				if (name.endsWith(".gif")) {
					return true;
				}
				return false;
			}
		});
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
