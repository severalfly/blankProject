package com.leon.utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils
{
	public static Object getBean(int cnt)
	{
		try
		{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("config.xml"));

			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(cnt).getFirstChild();
			String cName = classNode.getNodeValue();
			
			Class clazz = Class.forName(cName);
			Object obj = clazz.newInstance();
			return obj;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
