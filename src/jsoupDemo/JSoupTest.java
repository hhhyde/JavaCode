package jsoupDemo;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class JSoupTest {
	public static void main(String[] args) {
		Document doc;
		try {
			StringBuffer sBuffe = new StringBuffer();
			sBuffe.append("232");
			doc = Jsoup.connect("http://club.jd.com/bbs/885047-1-1-4.html").get();
//			 Elements newsHeadlines = doc.select("#mp-itn b a");
			System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
