package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void excel_writing_test() throws IOException {
        String path = "SampleData.xlsx";

        //to be able to read from excel file, need to load it inti FileInputStream
        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook > sheet > row > cell
        workbook = new XSSFWorkbook(fileInputStream);

        //get the sheet
        sheet = workbook.getSheet("Employees");

        //king's row
        row = sheet.getRow(1);

        //king's cell
        cell = row.getCell(1);

        //create and store AdamsCell
        XSSFCell adamsCell = sheet.getRow(2).getCell(0);

        System.out.println("Before:" + adamsCell);

        //this method will override existing value
        adamsCell.setCellValue("Madam");
        System.out.println("After : " + adamsCell);

        //TODO: CHANGE STEVEN'S NAME TO TOM
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {

            if(sheet.getRow(1).getCell(0).toString().equals("Steven")) {
                sheet.getRow(1).getCell(0).setCellValue("Tom");
            }

        }



        //========================================
        //use fileOutputStream to push changes
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //Write
        workbook.write(fileOutputStream);

        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();
    }
}
