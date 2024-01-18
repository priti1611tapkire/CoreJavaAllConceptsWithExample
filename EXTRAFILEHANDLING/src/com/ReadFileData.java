package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileData {

	public static void main(String[] args) throws IOException {
		int byteread=-1;
		File file=new File("D:\\abc\\pqr.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()){
			String data=sc.nextLine();
			System.out.println(data);
		}
		
		//By using Filereader
		System.out.println("========file read using filereader=========");
		FileReader fr=new FileReader(file);
		System.out.println(file.length());
		while((byteread=fr.read())!=-1){
			System.out.print((char)byteread);
		}
	}
}
