package training;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datasheet {
	@SuppressWarnings("resource")
	public static Object[][] datasheet() throws IOException {
		XSSFWorkbook wbook;
		Object[][] data= null;		
		//String excelfilename = null;
		wbook = new XSSFWorkbook("./datasheet/tc001.xlsx");
	    XSSFSheet sheet = wbook.getSheetAt(0);
	    int rownum = sheet.getLastRowNum();
	    short colnum = sheet.getRow(0).getLastCellNum();
	    data= new Object[rownum][colnum];
	    for(int i=0;i<rownum;i++) {
	    	for(int j=0;j<colnum;j++) {
	    		data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
	    	}
	    	return data;
	    }
		return data;
		
		
	}

}
