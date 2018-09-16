package com.mansf.fileop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperation2{
	public void read(int a) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("B:\\new 1.txt");
			try {
				if(a==1)
				inputStream.read();
				else
				inputStream.skip(10);
			} catch (IOException e) {
			}
		} catch (FileNotFoundException e) {
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
			}
		}
	}
	
}
