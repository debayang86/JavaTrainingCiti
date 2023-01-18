package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {

	public static void main(String[] args) {
		String fileDetails, fileLine;

		Scanner scanner = new Scanner(System.in);
		StringBuffer stringBuffer = new StringBuffer();

		System.out.println("Enter the file details : ");
		fileDetails = scanner.next();

		File file = new File(fileDetails);

//		FileReader fileReader = null;
//		BufferedReader bufferedReader = null;
//		try {
//			fileReader = new FileReader(file);
//		} catch (FileNotFoundException e1) {
//			System.out.println("File Not Found");
//			e1.printStackTrace();
//		}
//		
//		try {
//			
//			Reader reader  = new FileReader(fileDetails);
//			MyFileReader myFileReader = new MyFileReader(file, reader);
//			System.out.println("Data in File is : ");
//			System.out.println(myFileReader.readFile());
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found!");
//		}

		try {

			BufferedReader bufferedReader = null;
			// Reader reader = new FileReader(fileDetails);
			bufferedReader = new BufferedReader(new FileReader(file));
			MyFileReader myFileReader = new MyFileReader(bufferedReader);

			System.out.println("Data in File Line is : ");
			System.out.println(myFileReader.readFileLineByLine());
				
			} catch (IOException e) {
				System.out.println("");
				e.printStackTrace();
			}

		}
}

