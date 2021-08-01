package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    /*
    in this method how to read from excel
     */

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";

        //to be able to read fron excel file, neet to load it inti FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell

        //1- create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //2- we need to get the specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");

        //3-Select row and cell
        //print out Steven's cell
        //index starts from 0
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

        //print out "Singer" from the sheet
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));
        
        //Return the count of used cells only
        //If there are cells not used, they will not be counted
        //it will not count empty rows or cells
        //starts counting from 1        
        int usedRows = sheet.getPhysicalNumberOfRows();
        
        
        //Return the number from the top cell to bottom cell
        //it does not care if there are empty cells or not
        //starts counting from 0
        int lastUsedRow = sheet.getLastRowNum();
        
        //TODO: 1- CREATE A LOGIC TO PRINT OUT NEENA'S NAME DYNAMICALLY
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {

            if(sheet.getRow(rowNum).getCell(0).toString().equals("Neena")) {
                System.out.println("Neena's name = " + sheet.getRow(rowNum).getCell(0));
            }
        }

        //TODO: 2- CREATE a LOGIC TO PRINT OUT STEVEN KING's JOB_ID
        //First check STEVEN name, if its Steven -> print out Job_ID

        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Steven")) {
                System.out.println("Steven's JOB_ID is = " + sheet.getRow(rowNum).getCell(2));
            }
        }
        
    }
}
