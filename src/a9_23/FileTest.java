package a9_23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream(new File(
					"C:/Users/ke/Desktop/test.txt"));
			FileOutputStream out=new FileOutputStream(new File("C:/Users/ke/Desktop/temp.txt"));
			int count = in.available();
			byte[] bytes = new byte[count];
			System.out.println(count);
			for (int i = 0; i < bytes.length; i++) {
				bytes[i]=(byte)in.read();
			}
			System.out.println(Arrays.toString(bytes));
			out.write(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
