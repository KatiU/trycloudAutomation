package com.TryCloud.tests;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {


        String path="Credentials.xlsx";

        File file=new File(path);
        //to read from excel we need to load it to FileInput Stream


        FileInputStream fileInputStream = new FileInputStream(file);

        //workbook>sheet>row>cell

        //<1> Create a workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);


        //<2>  We need to get specific sheet from currently opened workbook
        public XSSFSheet sheet =workbook.getSheet("Credentials");


        //Return the count of used cells only
        //Starts counting from 1
        int usedRows=sheet.getPhysicalNumberOfRows();


        //Returns the number from top cell to bottom cell
        //It does not care if the cell is empty or not
        //Starts counting from 0

        int lastUsedRow=sheet.getLastRowNum();

    public ExcelRead() throws IOException {
    }




}
