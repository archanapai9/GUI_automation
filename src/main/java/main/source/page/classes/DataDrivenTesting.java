package main.source.page.classes;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.annotations.Test;

public class DataDrivenTesting {
  
  String[][] blogs = new String[5][2];
  @Test
  public String[][] readExcelFile() throws BiffException, IOException, RowsExceededException, WriteException {
	  
	  /*
	   * Read a xls sheet
	   */
	  Workbook book = Workbook.getWorkbook(new File("./src/test/BlogData.xls"));
	  Sheet sheet = book.getSheet("Blogs");
	  
	  /*
	  blogs[1][0] = sheet.getCell(0,1).getContents();
	  System.out.println("Blog title" + blogs[1][0].toString());
	  
	  blogs[1][1] = sheet.getCell(1,1).getContents();
	  System.out.println("Blog body" + blogs[1][1].toString());
	  */
	  
	  for (int row=0; row<=4; row++) {
		  
		  for(int col=0; col<=1; col++) {
			  
			  blogs[row][col] = sheet.getCell(col, row).getContents();
			  
		  }
	  }
	  
	  
	  
	  for (int row=0; row<=4; row++) {
			
		  System.out.println(blogs[row][0].toString() +":" +blogs[row][1].toString());
	  }
	 
	  book.close();
	  
	 return blogs;
	  
	  
	  /*
	   *  Write to excel sheet
	  WritableWorkbook newbook = Workbook.createWorkbook(new File("./src/test/NewExcel.xls"));
	  WritableSheet sheet = newbook.createSheet("Master", 0);
	  
	  Label l1 = new Label(0,0,"One");
	  
	  sheet.addCell(l1);
	  
	  newbook.write();
	  newbook.close();
	  */
	  
	  /*
	   * Modify excel sheet
	  
	  Workbook oldCopy = Workbook.getWorkbook(new File("./src/test/Sample_DD.xls"));
	  
	  WritableWorkbook newCopy = Workbook.createWorkbook(new File("./src/test/New_Sample_DD.xls"), oldCopy);
	  
	  WritableSheet sheet1 = newCopy.getSheet(0);
	  
	  Label l2 = new Label(2,2,"Friends");
	  
	  sheet1.addCell(l2);
	  
	  newCopy.write();
	  
	  oldCopy.close();
	  newCopy.close();
	  */
	  
  }
}
