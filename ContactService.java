package cs320_project1;
import java.util.ArrayList;

public class ContactService {
        ArrayList<Contact> contacts;

        public ContactService() {
                contacts = new ArrayList<>();
        }

        // Add a new contact
        public boolean addContact(Contact newContact) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
                                return false;
                        }
                }

                contacts.add(newContact);
                return true;

    
        }

        // remove a contact
        public boolean deleteContact(String contactID) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                contacts.remove(c);
                                return true;
                        }
                }
                // contact not found
                return false;
        }

        // Update the first name given contact
        public boolean updateContactFirstName(String contactID, String newFirstName) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                                // try to update, check for invalid values
                        		try {
                                		c.setFirstName(newFirstName);
                                }
                                catch (IllegalArgumentException e){
                                		System.out.println("ERROR: " + e);
                                		return false;
                                }
                        		// if an exception is not caught, return true
                        		return true;
                        }
                }
                // contact not found
                return false;
        }

        // Update the last name of a given contact
        public boolean updateContactLastName(String contactID, String newLastName) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                        		// try to update, check for invalid values
                        		try {
                                		c.setLastName(newLastName);
                                }
                                catch (IllegalArgumentException e){
                                		System.out.println("ERROR: " + e);
                                		return false;
                                }
                        		// if an exception is not caught, return true
                                return true;
                        }
                }
                // contact not found
                return false;
        }

        // Update phone number for a given contact
        public boolean updateContactNumber(String contactID, String newNumber) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                        		// try to update, check for invalid values
                        		try {
                                		c.setPhoneNumber(newNumber);
                                }
                                catch (IllegalArgumentException e){
                                		System.out.println("ERROR: " + e);
                                		return false;
                                }
                        		// if an exception is not caught, return true
                                return true;
                        }
                }
                // contact not found
                return false;
        }

        // Update address for a given contact
        public boolean updateContactAddress(String contactID, String newAddress) {
                for (Contact c : contacts) {
                        if (c.getContactID().equalsIgnoreCase(contactID)) {
                        		// try to update, check for invalid values
                                try {
                                		c.setAddress(newAddress);
                                }
                                catch (IllegalArgumentException e){
                                		System.out.println("ERROR: " + e);
                                		return false;
                                }
                                // if an exception is not caught, return true
                                return true;
                        }
                }
                // contact not found
                return false;
        }
        
        // Print all contacts
        public void displayAllContacts() {
        		if (contacts.size() == 0) {
        			System.out.println("No Contacts.");
        		}
        		else {
        				for(Contact c: contacts) {
        						System.out.println(c.toString());
        				}
        		}
        }
        
}