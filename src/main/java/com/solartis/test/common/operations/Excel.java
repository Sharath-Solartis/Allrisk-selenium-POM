package com.solartis.test.common.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.solartis.test.pom.common.PomEventsMethodDefinition;

public class Excel extends PomEventsMethodDefinition
{
	
	//public static String main(String[] args) throws IOException
	@SuppressWarnings("resource")
	public String ExcelRead(int RowNO, int colno) throws IOException

	 {
		
		
		        File src=new File("D:/Madhu_Downloads/ExcelRead.xls");
			    FileInputStream fis=new FileInputStream(src);
			    HSSFWorkbook srcBook= new HSSFWorkbook(fis);
			    HSSFSheet sourceSheet = srcBook.getSheetAt(0);
			    HSSFRow sourceRow = sourceSheet.getRow(RowNO);
			    HSSFCell username = sourceRow.getCell(colno);
			    String Excelvalue = username.getStringCellValue();
			    System.out.println("The username in Excel class is  " + Excelvalue);
			    return Excelvalue;
		
		
		
		
		
		
		
		    /*//int row = 5;
		    File src=new File("D:/Madhu_Downloads/ExcelRead.xls");
		    FileInputStream fis=new FileInputStream(src);
		    HSSFWorkbook srcBook= new HSSFWorkbook(fis);
		    HSSFSheet sourceSheet = srcBook.getSheetAt(0);
		    HSSFRow sourceRow = sourceSheet.getRow(RowNO);
		    HSSFCell username = sourceRow.getCell(colno);
		    //HSSFCell password=sourceRow.getCell(2);
		    String Excelvalue = username.getStringCellValue();
		    //String pwExcel = password.getStringCellValue();
		    //System.out.println("The username is" +Excelvalue);
		    //System.out.println("The password is" +pwExcel);
		    driver.findElement(txtbox_username).sendKeys(userExcel);
		    driver.findElement(txtbox_password).sendKeys(pwExcel);
		    driver.findElement(btn_logon).click();
			return Excelvalue;*/

		}
}
