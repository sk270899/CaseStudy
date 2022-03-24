package com.covid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CovidFile {
	  public static final String delimiter = ",";
	  public static void read(String csvFile) {
	    try {
	      File file = new File(csvFile);
	      FileReader fileReader = new FileReader(file);
	      BufferedReader bufferReader = new BufferedReader(fileReader);
	      String line = " ";
	      String[] Arr;
	      while ((line = bufferReader.readLine()) != null) {
	        Arr = line.split(delimiter);
	        for (String Str: Arr) {
	          System.out.print(Str + " ");
	        }
	        System.out.println();
	      }
	      bufferReader.close();
	    }
	    catch(IOException ioe) {
	      ioe.printStackTrace();
	    }
	  }
	  public static void main(String[] args) {
	    //csv file to read
	    String csvFile = "D:\\owid-covid-latest.csv";
	    CovidFile.read(csvFile);
	  }
	
}

