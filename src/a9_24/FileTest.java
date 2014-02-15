package a9_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class FileTest {
	static String file="C:/Users/ke/Desktop/temp.txt";
	static void display() throws IOException{
		RandomAccessFile raf=new RandomAccessFile("C:/Users/ke/Desktop/test.txt", "r");
		for (int i = 0; i < 7; i++) 
			System.out.println("value"+i+":"+raf.readDouble());
		System.out.println(raf.readUTF());
		raf.close();
	}
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile(file, "rw");
		for (int i = 0; i < 7; i++) 
			raf.writeDouble(i*1.414);
		raf.writeUTF("it's end");
		raf.close();
		display();
		raf=new RandomAccessFile(file, "rw");
		raf.seek(5*8);
		raf.writeDouble(88.08);
		display();
		raf.close();
	}
}
