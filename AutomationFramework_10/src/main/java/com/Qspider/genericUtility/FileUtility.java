package com.Qspider.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author aman
 */
public class FileUtility {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commonData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	return prop.getProperty(key);
}
}
