package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class TestCases {

@Test(dataProvider="dk1")
public void testcase(String s1,String s2)
{
	System.out.println(s1);
	System.out.println(s2);
}
@DataProvider
public Object[][] dk1() throws Exception, IOException
{
	
	File f = new File("../YTFramework/data.xls");
	Workbook wb=Workbook.getWorkbook(f);
	Sheet ws=wb.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
	Object data[][]=new Object[r][c];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			Cell c1=ws.getCell(j,i);
			data[i][j]=c1.getContents();
		}
	}
	return data;
	
}
}
