package cs320_project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {
	ContactService CS_Valid = new ContactService();
	
	
	//---------VALID METHOD TESTS----------//
	@Test
	void addContactTest() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		assertTrue(CS_Valid.addContact(temp));
	}
	
	@Test
	void deleteApptTest() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertTrue(CS_Valid.deleteContact("1"));
	}
	
	void outputTest() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		assertEquals("Contact [contactID=1, firstName=first, lastName=last, phoneNumber=1234567890, address=test address]", temp.toString());
	}
	
	@Test
	void updateContactFirst() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertTrue(CS_Valid.updateContactFirstName("1", "updated"));
	}
	
	@Test
	void updateContactLast() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertTrue(CS_Valid.updateContactLastName("1", "updated"));
	}
	
	@Test
	void updateContactAddress() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertTrue(CS_Valid.updateContactAddress("1", "new address"));
	}
	
	@Test
	void updateContactNumber() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertTrue(CS_Valid.updateContactNumber("1", "0987654321"));
	}
	
	//---------INVALID PARAMETER TESTS----------//
	@Test
	void updateContactFirst_tooLong() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactFirstName("1", "this is too long"));
	}
	
	@Test
	void updateContactFirst_null() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactFirstName("1", null));
	}
	
	@Test
	void updateContactLast_tooLong() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactLastName("1", "this is too long"));
	}
	
	@Test
	void updateContactLast_null() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactLastName("1", null));
	}
	
	@Test
	void updateContactAddress_tooLong() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactAddress("1", "this is too long this is too long this is too long this is too long"));
	}
	
	@Test
	void updateContactAddress_null() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactAddress("1", null));
	}
	
	@Test
	void updateContactNumber_tooLong() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactNumber("1", "12345678901"));
	}
	
	@Test
	void updateContactNumber_tooShort() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactNumber("1", "123456789"));
	}
	
	@Test
	void updateContactNumber_null() {
		Contact temp = new Contact("1","first","last","1234567890","test address");
		CS_Valid.addContact(temp);
		assertFalse(CS_Valid.updateContactNumber("1", null));
	}
}
