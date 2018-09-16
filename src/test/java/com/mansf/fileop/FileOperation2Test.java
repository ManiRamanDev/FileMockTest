package com.mansf.fileop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.easymock.PowerMock;
public class FileOperation2Test {
	FileOperation2 fileOperation2;
	FileInputStream mockFileInputStream;
	@Before
	public void setUp() {
		fileOperation2 = new FileOperation2();
	}
	@After
	public void tearDown() {
		fileOperation2 = null;
	}
	@Test
	public void testRead_a0() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andReturn(12);
		EasyMock.replay(mockFileInputStream);
		fileOperation2.read(0);
//		EasyMock.verify(mockFileInputStream);
	}
	@Test
	public void testRead_a1() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andReturn(12);
		EasyMock.replay(mockFileInputStream);
		fileOperation2.read(1);
//		EasyMock.verify(mockFileInputStream);
	}
	@Test
	public void testRead_IOException() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andThrow(new IOException());
		EasyMock.replay(mockFileInputStream);
		fileOperation2.read(0);
//		EasyMock.verify(mockFileInputStream);
	}
	@Test
	public void testRead_FileNotFoundException() throws Exception {
		mockFileInputStream = PowerMock.createMock(FileInputStream.class);
		EasyMock.expect(mockFileInputStream.read()).andThrow(new FileNotFoundException());
		fileOperation2.read(0);
//		EasyMock.verify(mockFileInputStream);
	}
}
