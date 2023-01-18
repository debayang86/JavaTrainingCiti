package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyFile;
import com.citibank.main.domain.WriteMyFile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
		
//		MyFileMetadata myFilemetadata = new MyFileMetadata();
//		myFilemetadata.printFileMetadata();
		
//		ReadMyFile readMyFile = new ReadMyFile();
//		readMyFile.readFile();
		
		String fileDetails, outMessage;
		boolean isAppend;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Path and Name of the File : " );
		fileDetails = scanner.next();
		
		System.out.println("Enter Message to Write in File : ");
		System.out.println();
		outMessage = scanner.nextLine();
		System.out.println("Do You Want To Append ? ");
		isAppend = scanner.nextBoolean();
		
		File file = new File(fileDetails);
		
		OutputStream outputStream;
		outputStream = null;
		try {
			outputStream = new FileOutputStream(fileDetails, isAppend);
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found!");
		}
		
		WriteMyFile writeMyFile = new WriteMyFile(file, outputStream, outMessage, isAppend);
		
		if (writeMyFile.writeFile()) {
			System.out.println("Data Written in File Successfully!");
			
		}

	}
}
