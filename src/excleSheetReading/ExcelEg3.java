package excleSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelEg3 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException { 
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		 Sheet mySheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		int totalNumberOfRows = mySheet.getLastRowNum();//will give me total row count
		int rowCount = totalNumberOfRows;
		System.out.println("total no. of rows are "+ rowCount);
		
		short totalNoOfCells = mySheet.getRow(totalNumberOfRows).getLastCellNum();
		int cellCount = totalNoOfCells-1;
		System.out.println("total no. of cells are "+ cellCount);
		
		for(int i=0;i<=rowCount;i++)//outer for row
		{
			for(int j=0;j<=cellCount;j++)//inner for cell
			{
				// Cell cellValue = mySheet.getRow(i).getCell(j);
				  Cell CellValue = mySheet.getRow(i).getCell(j);
				 CellType dataType = CellValue.getCellType(); 
				if(dataType==CellType.STRING)
				{
					String value = CellValue.getStringCellValue();
					System.out.println(value+" ");
				}
				else if(dataType==CellType.NUMERIC)
				{
					double value = CellValue.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(dataType==CellType.BOOLEAN)
				{
					boolean value = CellValue.getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(dataType==CellType.BLANK)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
