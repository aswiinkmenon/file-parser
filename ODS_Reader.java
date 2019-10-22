package com.file.reader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.jopendocument.dom.spreadsheet.MutableCell;
import org.jopendocument.dom.spreadsheet.SpreadSheet;
import org.jopendocument.dom.spreadsheet.Table;

public class ODS_Reader {
    public void readODS(File file)
    {
      Object sheet;
      try {
           //Getting the 0th sheet for manipulation| pass sheet name as string
           sheet = SpreadSheet.createFromFile(file).getSheet(0);
            
           //Get row count and column count
           int nColCount = ((Table<SpreadSheet>) sheet).getColumnCount();
           int nRowCount = ((Table<SpreadSheet>) sheet).getRowCount();

           System.out.println("Rows :"+nRowCount);
           System.out.println("Cols :"+nColCount);
           //Iterating through each row of the selected sheet
           MutableCell cell = null;
           for(int nRowIndex = 0; nRowIndex < nRowCount; nRowIndex++)
           {
             //Iterating through each column
             
             for(int nColIndex = 0 ;nColIndex < nColCount-1048576; nColIndex++)
             {
               cell = ((Table<SpreadSheet>) sheet).getCellAt(nColIndex, nRowIndex);
               System.out.print(cell.getValue()+ " ");
              }
              System.out.println();
            }

          } catch (IOException e) {
            e.printStackTrace();
          }
    }
    public static void main(String[] args) {
          //Creating File object of .ods file
          File file = new File("/home/spcv/Downloads/FILEREADER/new/file_example_ODS_10.ods");
          ODS_Reader objODSReader = new ODS_Reader();
          objODSReader.readODS(file);
    }
}
