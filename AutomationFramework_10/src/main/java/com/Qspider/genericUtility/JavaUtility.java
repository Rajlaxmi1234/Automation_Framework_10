package com.Qspider.genericUtility;

import java.time.LocalDateTime;
/**
 * @author Amman
 */
public class JavaUtility {
	/**
	 * this method will capture system date  and time and return
	 * @return System date and  time
	 */
public String getSystemTime() {
	return LocalDateTime.now().toString().replace(":", "-");
}
}
