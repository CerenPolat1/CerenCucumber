package renastech.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;


public class Excel_Utils {

    public void getCellData() throws IOException {

        //add excel into resources package, when you upload it, right click to the resources and open it
        //and choose copy pth referencere and the choose absolute path
        String filePath="C:\\Users\\ozgec\\IdeaProjects\\com.renastech.seleniumtestngtraining\\SeleniumCucumberTesting\\src\\test\\resources\\Excel(externalFile).xlsx";
        FileInputStream fileInputStream=new FileInputStream(filePath);
        //reach workbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        //next step is to reach out the sheet
        XSSFSheet sheet= workbook.getSheet("Sheet1");//you can put name or index number, now we reach 1st sheet
        //now we will reach row number
        int rows=sheet.getLastRowNum();
        int columns=sheet.getRow(0).getLastCellNum();
        //we have three type of cell we need to differentiate it : string, int, boolean, double
//        System.out.println("The row number:"+row.getCell(0));//Admin
//        System.out.println("The 2nd coloum"+row.getCell(1));//Mv@UE0@dR3f@


        //find row number
        for (int r=0; r<=rows; r++){
            XSSFRow row=sheet.getRow(r);//find column number
            for (int c=0; c<columns; c++){
                XSSFCell cell=row.getCell(c);
                //every cell is different :string, int, double, boolean
                switch (cell.getCellType()){
                    case STRING:
                        System.out.println(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println(cell.getBooleanCellValue());
                        break;
                }

            }

        }

    }
}