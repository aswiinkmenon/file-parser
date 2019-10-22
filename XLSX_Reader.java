package com.file.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XLSX_Reader {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("/home/spcv/Downloads/FILEREADER/new/file_example_XLSX_10.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook (fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> ite = sheet.rowIterator();
		while(ite.hasNext()){
			Row row = ite.next();
			Iterator<Cell> cite = row.cellIterator();
			while(cite.hasNext()){
				Cell c = cite.next();
				System.out.print(c.toString() +"  ");
			}
			System.out.println();
		}
		fis.close();
	}
} 
