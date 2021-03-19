package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadNotepad {
	
	public void readNotepadData() throws IOException {
		File file = new File("Files\\Data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}
	
	public void readNotepadChar() throws IOException {
		FileReader fr = new FileReader("Files\\Data.txt");

		int n;
		while((n=fr.read())!=-1) {
			System.out.println((char)n);
		}
	}
	
	public void readEntireFile() throws IOException {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get("Files\\Data.txt")));
		System.out.println(data);
	}

	public static void main(String[] args) throws IOException {
		
		ReadNotepad rn = new ReadNotepad();
		//rn.readNotepadData();
		//rn.readNotepadChar();
		rn.readEntireFile();

	}

}
