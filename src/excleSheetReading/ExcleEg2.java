package excleSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("sheet1");
		Row myRow = mysheet.getRow(0);
		Cell myCell = myRow.getCell(0);
		System.out.println(myCell.getCellType());
		
		System.out.println("===========================");
		
		//code for reading whole data from excle sheet
		Sheet mySheet2 = book.getSheet("sheet2");
		for(int i=0;i<=1;i++)//outer for loop----->row
		{
			for(int j=0;j<=2;j++)//inner for loop--->cell
			{
				String value = mySheet2.getRow(i).getCell(j).getStringCellValue(); 
				System.out.print(value+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++");
	}

}
