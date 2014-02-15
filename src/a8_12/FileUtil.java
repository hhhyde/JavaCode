package a8_12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public final class FileUtil {

	// 删除指定的文件
	public static boolean delete(String filepath) {
		File fp = null;
		try {
			if (filepath == null || filepath.trim().length() == 0) {
				return false;
			}

			fp = new File(filepath);
			if (!fp.exists()) {
				throw new IllegalArgumentException("源文件目录：'" + filepath
						+ "'不存在，请确认目录");
				// return false;
			}

			return fp.delete();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// 检查文件是否存在
	public static boolean checkFileExist(String filepath) {
		if (filepath == null || filepath.trim().length() == 0)
			return false;

		File fp = new File(filepath);
		if (!fp.exists())
			return false;
		if (!fp.isFile())
			return false;

		return true;
	}

	// 向文件写文本内容
	public static boolean writeLineFile(RandomAccessFile file, String lineTxt,
			boolean isRW) {
		boolean result = true;
		try {
			String str = lineTxt + "\r\n";
			byte[] strTxt = str.getBytes();
			if (isRW) {
				file.write(strTxt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 读文本文件内容,全部读取，放在数组里
	public static ArrayList<String> readTxtFile(String fileName)
			throws IOException, Exception {
		ArrayList<String> txtList = new ArrayList<String>();
		File file = new File(fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				txtList.add(tempString);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		return txtList;
	}

	// 写文件方法
	public static boolean writeTxtFile(String fileName,
			ArrayList<String> lineTxt) throws IOException, Exception {
		boolean result = true;
		// 检查文件是否存在
		result = FileUtil.checkFileExist(fileName);
		// 存在，先删除文件
		result = (result) ? FileUtil.delete(fileName) : true;
		// 打开文件
		if (result) {
			RandomAccessFile file = null;
			try {
				file = new RandomAccessFile(fileName, "rw");
				for (int i = 0; i < lineTxt.size(); i++) {
					// 写一行文件内容
					result = result
							&& FileUtil.writeLineFile(file, lineTxt.get(i)
									.toString(), true);
				}
			} catch (Exception e) {
			} finally {
				if (file != null)
					try {
						file.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
			}
		}
		return result;
	}
}
