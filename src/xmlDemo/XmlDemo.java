/*
 * 文 件 名:  XmlDemo.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  卢慧 55318
 * 修改时间:  2012-7-10
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package xmlDemo;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 姓名 工号
 * @version [版本号, 2012-7-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class XmlDemo
{
    public static void main(String[] args)
    {
        try
        {
            DocumentBuilder dbBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                Document document = dbBuilder.parse("F:/11.xml");
                Element root = document.getDocumentElement();
                new xmlDemo.XmlDemo().iterateNode(root);
                
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    private void iterateNode(Node currentNode)
    {
        if (currentNode.hasChildNodes())
        {
            for (int i = 0; i < currentNode.getChildNodes().getLength(); i++)
            {
                iterateNode(currentNode.getChildNodes().item(i));
            }
        }
        else
        {
            System.out.print(currentNode.getNodeValue());
        }
    }
}
