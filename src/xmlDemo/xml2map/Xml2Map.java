package xmlDemo.xml2map;

import java.io.IOException;
import java.io.StringReader;
import java.util.Map;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Xml2Map {
	public static void main(String[] args) throws IOException, SAXException {
		String xml = "<recipe><recipename>Ice Cream Sundae</recipename><preptime>5 minutes</preptime></recipe>";
		StringReader sr=new StringReader(xml);
		Map map = sg.xml.util.Xml2Map.xmlToMap(new InputSource(sr));
		System.out.println(map);
	}
}
