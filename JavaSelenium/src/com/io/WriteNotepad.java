package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNotepad {
	
	public void writeNotepadExample() throws IOException {
		try {
			FileWriter fw = new FileWriter("Files\\Output.txt");
			fw.write("Hello world");
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		
		WriteNotepad wn = new WriteNotepad();
		wn.writeNotepadExample();
	}

}
