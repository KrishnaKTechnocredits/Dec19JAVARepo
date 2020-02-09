package shitalSDec19.fileReadingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("G:\\Shital_JAVA\\4th and 5th Jan 2020 Topics to cover.txt");//open file
		FileReader reader = new FileReader(file);//enable read mode
		BufferedReader br = new BufferedReader(reader);//store file in buffer 
		
		String line = br.readLine();//read line from buffered space.
		System.out.println(line);
	}

}
