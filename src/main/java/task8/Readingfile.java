package task8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingfile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\91907\\eclipse-workspace\\JavaTrainingGuvi\\data\\exsheet.xlsx");
        
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		
		int cols=sheet.getRow(1).getLastCellNum();
		
		System.out.println("No of rows are:-"+rows);
		
		System.out.println("No of columns are:-"+cols);
		
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}

}
