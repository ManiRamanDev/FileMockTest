package com.mansf.fileop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;
public class FileOperationTest {
	FileOperation fileOperation;
	FileInputStream mockFileInputStream;
	@Before
	public void setUp() {
		fileOperation = new FileOperation();
	}
	@After
	public void tearDown() {
		fileOperation = null;
	}
	@Test
	public void testRead() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andReturn(12);
		EasyMock.replay(mockFileInputStream);
		fileOperation.read();
//		EasyMock.verify(mockFileInputStream);
	}
	@Test
	public void testRead_IOException() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andThrow(new IOException());
		EasyMock.replay(mockFileInputStream);
		fileOperation.read();
//		EasyMock.verify(mockFileInputStream);
	}
}
