
package edu.umb.cs680.hw04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	Student inStateStudent = Student.createInStateStudent("ABC", "boston",20);
	Student outStateStudent = Student.createOutStateStudent("ABC", "boston", 20,"NH");
	Student intlStudent = Student.createIntlStudent("ABC", "boston", 123456, "india");

	
	@Test
	void testGetName() {
		assertEquals("ABC", inStateStudent.getName());
		assertEquals("ABC", outStateStudent.getName());
		assertEquals("ABC", intlStudent.getName());
	}
	
	@Test
	void testGetI20num() {
		assertEquals(0, inStateStudent.getI20num());
		assertEquals(0, outStateStudent.getI20num());
		assertEquals(123456, intlStudent.getI20num());
		
	}
	
	@Test
	void testGetTution() {
		assertEquals(10000, inStateStudent.getTuition());
		assertEquals(15000, outStateStudent.getTuition());
		assertEquals(30000, intlStudent.getTuition());
		
	}

	@Test
	void testGetYearsInState() {
		assertEquals(20, inStateStudent.getYearsInState());
		assertEquals(20, outStateStudent.getYearsInState());
		assertEquals(0, intlStudent.getYearsInState());
	}

	@Test
	void testGetState() {
		assertNull(inStateStudent.getState());
		assertEquals("NH",outStateStudent.getState());
		assertNull(intlStudent.getState());
	}  
	@Test
	
	void testGetUsAddr() {
		assertEquals("boston", inStateStudent.getUsAddress());
		assertEquals("boston", outStateStudent.getUsAddress());
		assertEquals("boston", intlStudent.getUsAddress());
	}

	@Test
	void testGetForeignAddress() {
		assertNull(inStateStudent.getForeignAddress());
		assertNull(outStateStudent.getForeignAddress());
		assertEquals("india", intlStudent.getForeignAddress());
	}
	@Test
	void testCreateInStateStudentName() {
		Student student= Student.createInStateStudent("ABC", "boston",20);
		String name = "ABC";
		assertEquals(name, student.getName());
	}
	
	@Test
	void testCreateInStateStudentTuition() {
		Student student= Student.createInStateStudent("ABC", "boston",20);
		float actual = student.getTuition(); 
		float expected = 10000;
		assertEquals(expected, actual);
	
	}
	
	
	
	@Test
	void testCreateOutStateStudentState() {
		Student student = Student.createOutStateStudent("ABC", "boston", 20,"NH");
		String expected = "NH";
		assertEquals(expected, student.getState());
	}
	
	@Test
	void testCreateOutStateStudentTuition() {
		Student student = Student.createOutStateStudent("ABC", "boston", 20,"NH");
		float actual = student.getTuition(); 
		float expected = 15000;
		assertEquals(expected, actual);
	
	}   
	
	@Test
	void testCreateIntlStudentForeignAddress() {
		Student student = Student.createIntlStudent("ABC", "boston", 123456, "india");
		String address = "india";
		assertEquals(address, student.getForeignAddress());
	}
	
	@Test
	void testCreateIntlStudent() {
		Student student = Student.createIntlStudent("ABC", "boston", 123456, "india");
		float actual = student.getTuition(); 
		float expected = 30000;
		assertEquals(expected, actual);
	}
	

}