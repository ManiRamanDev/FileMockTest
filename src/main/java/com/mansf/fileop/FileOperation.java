package com.mansf.fileop;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOperation{
	public void read() throws IOException {
		FileInputStream inputStream = null;
			inputStream = new FileInputStream("B:\\new 1.txt");
			inputStream.read();
			inputStream.close();
	}
	
}
