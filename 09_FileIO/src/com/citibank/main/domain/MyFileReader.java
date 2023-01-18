package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {

	private char[] data;
	private int length;
	private File file;
	private Reader reader;
	private BufferedReader bufferedReader;

	public MyFileReader(File file, Reader reader) {
		super();

		this.file = file;
		this.reader = reader;
	}

	public MyFileReader(BufferedReader bufferedReader) {

		this.bufferedReader = bufferedReader;
//		System.out.println("buffered reader is initialized");
	}

	public String readFile() {
		try {
			length = (int) file.length();
			data = new char[length];
			reader.read(data);
			String dataFromFile = new String(data);
			return dataFromFile;
		} catch (IOException e) {

			System.out.println("Error while reading File!");
			return "EwrF";
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error while closing file!");
			}
		}
	}

	public String readFileLineByLine() {
		String dataFromFile = "";
		try {
//			System.out.println("in readLineByLine");
//			length = (int)file.length();
//			data = new char[length];
//			String dataFromFile = new String(data);
			String temp = bufferedReader.readLine();
			do {

				dataFromFile += temp + "\n";
				temp = bufferedReader.readLine();
//			System.out.println("in readLineByLine");
//			System.out.println(dataFromFile);
			} while (temp != null);
			return dataFromFile;
		} catch (IOException e) {

			System.out.println("Error while reading File!");
			return "EwrF";
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing file!");
			}
		}
	}

}
