package a8_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class WriteFileNameInTxt {
	public static void main(String[] args) {
		File sourceFile = new File("c:\\users\\ke\\desktop\\image\\goods");
		if (sourceFile.isDirectory())
			System.out.println("是一个目录");
		else
			return;
		String[] filenames = sourceFile.list();
		System.out.println(Arrays.toString(filenames));
		File newFile = new File("c:\\users\\ke\\desktop\\dir\\delete.txt");
		fileNameInTxt(newFile, filenames);

	}

	static void fileNameInTxt(File file, String[] write) {
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			for (String string : write) {
				byte[] bytes = (string+"\r\n").getBytes();
				raf.write(bytes);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
