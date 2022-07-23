package org.testing.utilities;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



public class LogsCapture
{
	public static void takeCapture(String classname,String logmessage) 
	{
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger Log=Logger.getLogger(classname);
		Log.info(logmessage);
	}

}
