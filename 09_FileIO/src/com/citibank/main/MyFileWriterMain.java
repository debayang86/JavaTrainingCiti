package com.citibank.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {
		String fileDetails, outMessage;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter File Details : ");
		fileDetails = scanner.next();
		System.out.println("Enter Message to Write in File : ");
		outMessage = scanner.next();
		outMessage ="\n" + outMessage ;
		
		File file = new File(fileDetails);
		
		try {
			
			Writer writer= new FileWriter(file, true);
			MyFileWriter myFileWriter = new MyFileWriter(writer, outMessage);
			if (myFileWriter.writeFile());
				System.out.println("File Writtern Successfully");
			
		} catch (IOException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}
		

	}

}
