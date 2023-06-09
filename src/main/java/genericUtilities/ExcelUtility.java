package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// 
//
public class ExcelUtility {
	 
		private Workbook wb;
		
		public void excelInitialization(String excelPath) {
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(excelPath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				wb = WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException | IOException e) {
				e.printStackTrace();
			}
		}
		public String readDataFromExcel(String sheetName, int rowNum, int cellNum) {
			String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();		
			return data;
		}
		
		public Map<String, String> readDataFromExcel(String sheetName, String expectedTestName) {
			Map<String,String> map = new HashMap<>();
			Sheet sheet = wb.getSheet(sheetName);
			for(int i=0; i<= sheet.getLastRowNum(); i++) {
				String actualTestName = sheet.getRow(i).getCell(1).getStringCellValue();
				if(actualTestName.equalsIgnoreCase(expectedTestName)) {
					for(int j = i; j <= sheet.getLastRowNum(); j++) {
						String key = sheet.getRow(j).getCell(2).getStringCellValue();
						String value = sheet.getRow(j).getCell(3).getStringCellValue();
						map.put(key, value);
						
						if(key.equals("####"))
							break;
					}
					break;
				}
			}
			return map;
		}
		
		public void closeWorkbook() {
			try {
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void writeToExcel(String sheetName, int rowNum, int cellNum, String data, String excelPath) {
			Cell cell = wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum);
			cell.setCellValue(data);
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(excelPath);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			try {
				wb.write(fos);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void writeToExcel(String sheetName, String status, String expectedTestName, String excelPath) {
			Sheet sheet = wb.getSheet(sheetName);
			
			for(int i = 0; i<= sheet.getLastRowNum(); i++) {
				String actualTestName = sheet.getRow(i).getCell(1).getStringCellValue();
				if(actualTestName.equalsIgnoreCase(expectedTestName)) {
					Cell cell = sheet.getRow(i).createCell(4);
					cell.setCellValue(status);
					FileOutputStream fos = null;
					try {
						fos = new FileOutputStream(excelPath);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					try {
						wb.write(fos);
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	private Workbook wb;
//
//	public void excelInitialization(String Path) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream(Path);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			wb = WorkbookFactory.create(fis);
//		} catch (EncryptedDocumentException | IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	public String readDataFromExcel(String sheetname, int rowNum, int CelNum) {
//
//		String data = wb.getSheet(sheetname).getRow(rowNum).getCell(CelNum).getStringCellValue();
//		return data;
//	}
//
//	public void writeToExcel(int cellNum, int rowNum, String SheetName, String data, String path) {
//		Cell cell = ((Row) wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum)).createCell(cellNum);
//		cell.setCellValue(data);
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream(path);
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//
//		try {
//			wb.write(fos);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		}
//		public void writeToExcel(String sheetName, String data,String ExpectedTestName, String status) {
//			Sheet sheet= wb.getSheet(sheetName);
//			for(int i=0;i<sheet.getLastRowNum();i++)
//			{String  actualTestname=sheet.getRow(i).getCell(1).getStringCellValue();
//			if(actualTestname.equalsIgnoreCase(ExpectedTestName))
//			{ 
//				Cell cell=sheet.getRow(i).createCell(4);
//			cell.setCellValue(status);
//			FileInputStream fis = null;
//			try {
//				fis = new FileInputStream(Path);
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//
//			try {
//				wb = WorkbookFactory.create(fis);
//			} catch (EncryptedDocumentException | IOException e) {
//				e.printStackTrace();
//			}
//break;
//
//			}
//				
//			}
//			
//		}
//
//	}/**
//		 * this metod is used to read
//		 * 
//		 * @param sheetName
//		 * @param ExpectedTestName
//		 */
//	public<String String> readDataFromExcel(String sheetName, String ExpectedTestName)
//	{//map is works on key and value pair 
//		Map<String String> map= new HashMap<>();
//		Sheet sheet = wb.getSheet(sheetName);
//		
//		for(int i=0;i<sheet.getLastRowNum();i++)
//		{ String  actualTestname=sheet.getRow(i).getCell(1).getStringCellValue();
//			if(actualTestname.equalsIgnoreCase(ExpectedTestName))
//			{
//				for(int j=0;j<sheet.getLastRowNum();j++)
//				{
//					String key=sheet.getRow(j).getCell(2).getStringCellValue();
//					String value=sheet.getRow(j).getCell(3).getStringCellValue();
//					map.put(key,value);
//					if(key.equals("####"))
//						break;
//					
//				}
//				break;
//				
//			}
//		}
//		return map;
//		
//	}
//
//	public void closeWorkbook(){
//		try {
//			wb.close();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//
//		}
//	
//
////	public void writeToExcel(int cellNum, int rowNum, String SheetName, String data, String path) {
////		Cell cell = ((Row) wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum)).createCell(cellNum);
////		cell.setCellValue(data);
////		FileOutputStream fos = null;
////		try {
////			fos = new FileOutputStream(path);
////		} catch (FileNotFoundException e) {
////			 
////			e.printStackTrace();
////		}
////
////		try {
////			wb.write(fos);
////
////		} catch (IOException e) {
////			e.printStackTrace();
////
////		}
//
//}}
