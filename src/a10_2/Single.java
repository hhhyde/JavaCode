package a10_2;

import java.io.File;

public class Single {
	Single(){
		System.out.println("Single来了");
	}
	final static int staticFinal=47;
	public void show() {
		File filepath=new File("C://Users//ke//Desktop//第197期《扫除的力量》.mp3");
		System.out.println(filepath.toString());
		filepath.renameTo(new File("C://Users//ke//Desktop//冬吴相对论//第197期.mp3"));
	}
}
