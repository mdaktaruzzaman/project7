package fileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		String path = "/Users/mdaktaruzzaman/Downloads/helloworld";
	try {
		fr = new FileReader(path);
		br = new BufferedReader (fr);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		String st = "";
		try { 
			while((st = br.readLine())!= null) {
				System.out.println(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				fr = null;
			}
		} 
		if(br != null) {
			br = null;
			
		}

	}
}
