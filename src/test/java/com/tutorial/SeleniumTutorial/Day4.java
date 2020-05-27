package com.tutorial.SeleniumTutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Day4 {
	public static void main (String[] args) throws Throwable{
		
	
	File f= new File("E:\\Maveric Sessioc\\Selenium\\Book1.xlsx");
    
    FileInputStream fis= new FileInputStream(f);
   
    Workbook wb= new XSSFWorkbook(fis);
   
    Sheet sheetName = wb.getSheet("Sheet1");
   
    Row firstRow = sheetName.getRow(0);
   
    Cell firstCell= firstRow.getCell(1);
   
   //String toPrint= firstCell.getStringCellValue();	
    CellType cellType = firstCell.getCellType();
    switch (CellType)
    
   
    fis.close();
    System.out.println(firstCell);
   
    FileOutputStream fos= new FileOutputStream(f);
   
    wb.write(fos);
   
    fos.close();
}
}
