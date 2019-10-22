package com.file.reader;

import java.io.FileInputStream;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;



public class DOCX_Reader {
	   public static void main(String[] args) {
	      try {
	        FileInputStream fis = new FileInputStream("/home/spcv/Downloads/FILEREADER/completefile/read-test.docx");
		XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
		XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
		System.out.println(extractor.getText());
	      } catch(Exception ex) {
		ex.printStackTrace();
	      } 
	   }
	} 