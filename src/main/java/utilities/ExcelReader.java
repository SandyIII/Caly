package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static XSSFSheet GetExcelSheet(String fileName, String sheetName) {
		try {
			String projectPath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/resources/"+fileName);			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			//XSSFSheet sheet = workbook.getSheetAt(0);
			workbook.close();
			return sheet;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			return null;
		}
	}

	public static void  ReturnRecordFromExcel(XSSFSheet sheet) 
	{
		for(Row row :sheet) 
		{
			for(Cell cell:row) 
			{
				switch(cell.getCellType())
				{
				case STRING:
					cell.getStringCellValue();
					break;
				case NUMERIC:
					cell.getNumericCellValue();
					break;
				case BLANK:
					cell.getNumericCellValue();
					break;
				default:
					System.out.println("[%d,%d]");
					break;
				}
			}
		}
	}

	public static String  GetValue(XSSFSheet sheet, int row, int cell ) 
	{
		switch(sheet.getRow(row).getCell(cell).getCellType())
		{
		case STRING:
			return sheet.getRow(row).getCell(cell).getStringCellValue();
		case NUMERIC:
			return String.valueOf( (int)(sheet.getRow(row).getCell(cell).getNumericCellValue()));
		case BLANK:
			return "";
		default:
			return "";
		}

	}
}