package com.file.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TXT_Reader 
{ 
  public static void main(String[] args) 
                        throws FileNotFoundException 
  { 
    File file = new File("/home/spcv/Downloads/FILEREADER/test_text_file"); 
    Scanner sc = new Scanner(file); 
  
    // we just need to use \\Z as delimiter 
    sc.useDelimiter("\\Z"); 
  
    System.out.println(sc.next()); 
  } 
}