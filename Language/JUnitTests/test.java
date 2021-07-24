package JUnitTests;


import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import egtry.Example1;
import egtry.ParseException;
import egtry.TokenMgrError;

class test {

	@Test
	void test1() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test1.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    new egtry.Example1(br);
	    try {
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 1 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 1 Parsed Wrong");
		} 
	}
	
	@Test
	void test2() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test2.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 2 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 2 Parsed Wrong");
		} 
	}
	
	@Test
	void test3() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test3.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 3 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 3 Parsed Wrong");
		} 
	}
	
	@Test
	void test4() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test4.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 4 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 4 Parsed Wrong");
		} 
	}
	
	@Test
	void test5() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test5.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 5 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 5 Parsed Wrong");
		} 
	}
	
	@Test
	void test6() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test6.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 6 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 6 Parsed Wrong");
		} 
	}
	
	@Test
	void test7() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test7.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 7 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 7 Parsed Wrong");
		} 
	}
	
	@Test
	void test8() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test8.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 8 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 8 Parsed Wrong");
		} 
	}
	
	@Test
	void test9() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test9.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 9 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 9 Parsed Wrong");
		} 
	}
	
	@Test
	void testCase10() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test10.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 10 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 10 Parsed Wrong");
		} 
	}
	
	@Test
	void testCase11() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test11.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 11 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 11 Parsed Wrong");
		} 
	}
	
	@Test
	void testCase12() throws IOException {
	    String data = "";
		data = new String(Files.readAllBytes(Paths.get("..\\Language\\JUnitTests\\test12.txt")));
	    InputStream stream = new ByteArrayInputStream(data.getBytes(Charset.forName("UTF-8")));
	    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(stream));
	    Example1.ReInit(br);
	    try {     
	        assertTrue(Example1.Input());
		} catch (ParseException e) {
			System.out.println("Test Case 12 Parsed Wrong");
		} catch (TokenMgrError e) {
			System.out.println("Test Case 12 Parsed Wrong");
		} 
	}
	    
}
