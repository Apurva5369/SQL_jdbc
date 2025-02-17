package task8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingFile {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\data\\myfile.xlsx");
        
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("datasheet");
		
		XSSFRow row1=sheet.createRow(0);
		  row1.createCell(0).setCellValue("Guvi");
		  row1.createCell(1).setCellValue("Batch1");
		  row1.createCell(2).setCellValue("Testing");
		  
		  XSSFRow row2=sheet.createRow(1);
		  row2.createCell(0).setCellValue("Guvi");
		  row2.createCell(1).setCellValue("Batch2");
		  row2.createCell(2).setCellValue("Development");
		  
		  XSSFRow row3=sheet.createRow(2);
		  row3.createCell(0).setCellValue("Guvi");
		  row3.createCell(1).setCellValue("Batch3");
		  row3.createCell(2).setCellValue("Artificial Intelligence");
	
		  workbook.write(file);
		  workbook.close();
		  file.close();
		  System.out.println("File is created");
	
	
	
	}

}
