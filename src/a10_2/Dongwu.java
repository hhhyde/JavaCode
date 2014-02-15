package a10_2;

import java.io.File;
import java.io.FilenameFilter;

import javax.crypto.spec.IvParameterSpec;

public class Dongwu {
	public static void main(String[] args) {
		File filepath = new File("C://Users//ke//Desktop//冬吴相对论");
		File[] files = filepath.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.endsWith("mp3");
			}
		});
		String[] filenames = filepath.list(new FilenameFilter() {

			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.endsWith("mp3");
			}
		});
		for (int i = 0; i < filenames.length; i++) {
			if (filenames[i].indexOf("冬吴相对论") == 0) {
				filenames[i] = filenames[i].substring(5);
			}
			filenames[i] = filenames[i].replace('：', '《');
			if (filenames[i].indexOf("》") == -1) {
				filenames[i] = filenames[i].replaceAll("\\.", "》.");
			}
			System.out.println(filenames[i]);
		}
		System.out.println("------------------");
		System.out.println(files.length);
		System.out.println(filenames.length);
		for (int i = 0; i < files.length; i++) {
			files[i].renameTo(new File("C://Users//ke//Desktop//冬吴相对论//"+filenames[i]));
//			System.out.println("|||||||||||||||||||||||||");
//			System.out.println(files[i].toString());
//			System.out.println("C://Users//ke//Desktop//冬吴相对论//"+filenames[i]);
		}
	}
}
