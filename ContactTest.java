package cs320_project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	//----------TESTING A VALID OBJECT----------//
	
	Contact validContact = new Contact("1","first","last","1234567890","address");
	
	@Test
	void constructor_idTest() {
		assertEquals("1", validContact.getContactID());
	}
	
	@Test
	void constructor_firstNameTest() {
		assertEquals("First", validContact.getFirstName());
	}
	
	@Test
	void constructor_lastNameTest() {
		assertEquals("First", validContact.getLastName());
	}
	
	@Test
	void constructor_PhoneNumberTest() {
		assertEquals("1234567890", validContact.getPhoneNumber());
	}
	
	@Test
	void constructor_addressTest() {
		assertEquals("address", validContact.getAddress());
	}
	
	@Test
	void outputTest() {
		assertEquals("Contact [contactID=1 firstName=first, lastName=last, phoneNumber=1234567890, address=address]",validContact.toString());
	}
	
	//----------TESTING ILLEGAL ARGUMENTS----------//
	
	@Test
	void idTooLong() {
		try {
			Contact t = new Contact("12345678901","first","last","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void idNull() {
		try {
			Contact t = new Contact(null,"first","last","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void firstNameTooLong() {
		try {
			Contact t = new Contact("1","first name too long","last","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void firstNameNull() {
		try {
			Contact t = new Contact("1",null,"last","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void lastNameTooLong() {
		try {
			Contact t = new Contact("1","first name too long","last","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void lastNameNull() {
		try {
			Contact t = new Contact("1","first","last name too long","1234567890","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void BadPhoneNumber() {
		try {
			Contact t = new Contact("1","first","last","123456789","address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void addressTooLong() {
		try {
			Contact t = new Contact("1","first","last","1234567890","bad address bad address bad address bad address");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void addressNull() {
		try {
			Contact t = new Contact("1","first","last","1234567890",null);
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	//----------TESTING GETTERS----------//
	
	@Test
	void getId_test() {
		assertEquals("1",validContact.getContactID());
	}
	
	@Test
	void getFirstName_test() {
		assertEquals("first",validContact.getFirstName());
	}
	
	@Test
	void getLastName_test() {
		assertEquals("last",validContact.getLastName());
	}
	
	@Test
	void getPhoneNumber_test() {
		assertEquals("1234567890",validContact.getPhoneNumber());
	}
	
	@Test
	void getAddress_test() {
		assertEquals("address",validContact.getAddress());
	}
	
	
	//----------TESTING VALID SETTERS----------//
	
	@Test
	void setName_test() {
		validContact.setFirstName("New Name");
		assertEquals("New Name",validContact.getFirstName());
	}
	
	@Test
	void setLastName_test() {
		validContact.setFirstName("New Name");
		assertEquals("New Name",validContact.getLastName());
	}
	
	@Test
	void setPhoneNumber_test() {
		validContact.setFirstName("9876543210");
		assertEquals("9876543210",validContact.getPhoneNumber());
	}
	
	@Test
	void setAddress_test() {
		validContact.setAddress("New Address");
		assertEquals("New Address",validContact.getAddress());
	}
	
	//----------TESTING INVALID SETTERS----------//
	
	@Test
	void setFirstName_tooLongTest() {
		try {
			validContact.setFirstName("This name is too long");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setFirstName_nullTest() {
		try {
			validContact.setFirstName(null);
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setLastName_tooLongTest() {
		try {
			validContact.setLastName("This name is too long");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setLastName_nullTest() {
		try {
			validContact.setLastName(null);
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setPhone_notTenTest() {
		try {
			validContact.setPhoneNumber("1");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setPhone_nullTest() {
		try {
			validContact.setPhoneNumber(null);
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setAddress_tooLongTest() {
		try {
			validContact.setAddress("This address is too long. This address is too long. This address is too long.");
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	
	@Test
	void setAddress_nullTest() {
		try {
			validContact.setAddress(null);
			fail("exception should have been thrown");
		}
		catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
}
