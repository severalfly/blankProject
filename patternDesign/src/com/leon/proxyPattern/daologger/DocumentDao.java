package com.leon.proxyPattern.daologger;

public class DocumentDao implements AbstractDecumentDao
{

	@Override
	public boolean deleteDocumentById(String documentId)
	{
		if (documentId.equalsIgnoreCase("d001"))
		{
			System.out.println("delete id: " + documentId + " success");
			return true;
		}
		else
		{
			System.out.println("delete id: " + documentId + " fail");
			return false;
		}
	}

}
