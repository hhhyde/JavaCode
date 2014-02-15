package a8_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class writeTxtFile {


	public static void main(String[] args) {
		File file=new File("c:\\users\\ke\\desktop\\dir\\delete.txt");
		System.out.println("单个文件名:"+file.getName());
		String[] filename= file.list();
		System.out.println("文件名数组:"+Arrays.toString(filename));
		//System.out.println(file.delete());
		filename= file.list();
		System.out.println("文件名数组:"+Arrays.toString(filename));
		System.out.println("是否是一个标准文件:"+file.isFile());
		String write="yes";
		try {
			RandomAccessFile aa=new RandomAccessFile(file, "rw");
			writeLineFile(aa, write, true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
    // 向文件写文本内容
    public static boolean writeLineFile(RandomAccessFile file, String lineTxt, boolean isRW)
    {
        boolean result = true;
        try
        {
            String str = lineTxt + "\r\n";
            byte[] strTxt = str.getBytes();
            if (isRW)
            {
                file.write(strTxt);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}

