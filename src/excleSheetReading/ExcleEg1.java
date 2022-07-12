package excleSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcleEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create excle sheet and pass the path along with name and extension in the file
		
		File myfile=new File("C:\\java selenium\\poi-bin-5.2.2-20220312\\26MarchB.xlsx");
		
		//using workBook factory class read excle sheet
		//how to read string value
		
		String stringName = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(stringName);
		
		//how to read numerical value
		double number = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(number);
		double numbers = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(2).getCell(3).getNumericCellValue();
		System.out.println(numbers);
		
		//how to read char value
		String myChar = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(myChar);
		
		//how to read boolean value
		 boolean myvalue = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(3).getCell(3).getBooleanCellValue();
		System.out.println(myvalue);
		
	}

}
