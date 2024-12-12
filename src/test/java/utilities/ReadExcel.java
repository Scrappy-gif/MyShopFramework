package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	public static FileInputStream inputStream;
	public static XSSFWorkbook workBook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	

	public static Object[][] getExcelData(String filePath, String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(new String("E:\\Prachi\\Excel.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet3");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][colCount]; // minus 1 to skip header row

		for (int i = 1; i < rowCount; i++) { // Start from row 1 to skip header
			for (int j = 0; j < colCount; j++) {
				cell = sheet.getRow(i).getCell(j);
				switch (cell.getCellType()) {
				case STRING:
					data[i - 1][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i - 1][j] = cell.getNumericCellValue();
					break;
				case BOOLEAN:
					data[i - 1][j] = cell.getBooleanCellValue();
					break;
				}
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
}

