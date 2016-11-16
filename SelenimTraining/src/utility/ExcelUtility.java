package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.tools.FileObject;

import org.apache.poi.hssf.usermodel.examples.NewLinesInCells;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static XSSFSheet ExcelWSheet ;
	public static XSSFWorkbook ExcelWorkbook ;
	public static XSSFCell Cell ;
	public static XSSFRow row ;
	
	public static void setExcelFile(String PATH_Testdata , String FILE_TESTDATA){
		try {
			FileInputStream excelSheet = new FileInputStream(PATH_Testdata);
			try {
				ExcelWorkbook = new XSSFWorkbook(excelSheet);
				ExcelWSheet = ExcelWorkbook.getSheet(FILE_TESTDATA);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getCellData (int RowNum , int ColNum){
		Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		String CellData = Cell.getStringCellValue();
		return CellData;
		
		
	}
	public static void setCellData(int RowNum , int ColNum , String Result) throws IOException {
		row = ExcelWSheet.getRow(RowNum);
		Cell = row.getCell(ColNum ,row.CREATE_NULL_AS_BLANK);
		if(Cell==null){
			Cell=row.createCell(ColNum);
			Cell.setCellValue(Result);
		}else {
			Cell.setCellValue(Result);
		}
		
		FileOutputStream fileOut = new FileOutputStream(Constants.PATH_Testdata);
	    try {
			ExcelWorkbook.write(fileOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    fileOut.close();
	    fileOut.flush();
	}
}
