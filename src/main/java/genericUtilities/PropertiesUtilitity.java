package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//
///**
// * this method contains reusable method to perform actions on properties file
// */
public class PropertiesUtilitity {
	private Properties property;
		
		/**
		 * This method is used to initialize Properties file
		 * @param filePath
		 */
		public void propertiesInitialization(String filePath) {
			FileInputStream fis = null;
			try {
				 fis = new FileInputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			 property = new Properties();
			
			try {
				property.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/**
		 * This method returns the data from Properties file based on the key provided 
		 * @param key
		 * @return
		 */
		public String getDataFromProperties(String key) {
			return property.getProperty(key);
		}
		
		/**
		 * This method writes data to Properties file
		 * @param key
		 * @param value
		 * @param filePath
		 */
		public void writeToProperties(String key, String value, String filePath) {
			property.put(key, value);
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(filePath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				property.store(fos, "Updated Successfully");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


//	
//	
//	private Properties property;// we are not inherting any peoperties from this class to other class
//
//	public void propertiesFileintialization(String path) {
//		/**this method is used to int intalize properties file
//		 * - FileInputStream(path) it give throws and try-catch option but we are going
//		 * to try catch block bcz we can stop the java propagation by using try catch-if declared as throws expression then we have to mention in each and every clssses whicheverv we will use
//		 * block - property.load(fis);= we are using try ctach block
//		 * FileInputStream throws file not found exception
//		 * 
//		 * propertiesFileintialization-inorder to reduce the number of object in project we will use this method
//		 */
//		
//		FileInputStream fis = null;//fis was local variable in try block
//		try {
//			fis = new FileInputStream(path);// fis is only limitedto that partucular method
//		} catch (FileNotFoundException e1) {
//
//			e1.printStackTrace();
//		}
//		// change to add parameter & fis will show error
//		Properties property = new Properties();//
//		try {
//			property.load(fis);//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
///**
// * this method is used to fetch the data/read the data
// * @param key
// * @return
// */
//	public String getDataFromProperties(String key) {
//		 String data=property.getProperty(key);
//		return data;
//		
//	}
//
//	/**
//	 * this method is used to modify /write the data
//	 * 
//	 * @param key
//	 * @param value
//	 * @param path
//	 */
//
//	public void writeToPropertiesFile(String key, String value, String path) {
//
//		property.put(key, value);//to weite data into it
//		FileOutputStream fos = null;//to save the file 
//
//		try {
//			fos = new FileOutputStream(path);
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//		try {
//		property.store(fos,"Updated Successfully");
//
//	} catch (FileNotFoundException e) {
//		
//		e.printStackTrace();
//	}}
//
//}
