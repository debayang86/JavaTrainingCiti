package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {
	private String path = "c:/MyJavaTraining/test.txt";
	
	public void printFileMetadata() {
		
		System.out.println("");
		File file = new File(path);
		if (file.exists()) {
			
			System.out.println("File Name : " + file.getName());
			System.out.println("File Path : " + file.getAbsolutePath());
			System.out.println("File Size : " + file.length());
			System.out.println("Can Open : " + file.canExecute()) ;
			System.out.println("Can Write : " + file.canWrite());
			System.out.println("Can Read : " + file.canRead());
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modified : " + lastModifiedDate);
			
		}else {
			System.out.println("File Does Not Exist.");
			System.out.println("Enter valid Path");
		}
	}
	
}
