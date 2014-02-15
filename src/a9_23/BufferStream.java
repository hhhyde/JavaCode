package a9_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferStream {
	public static void main(String[] args) {
		try {
			BufferedReader reader=new BufferedReader(new FileReader("C:/Users/ke/Desktop/test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
