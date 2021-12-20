package cs320_project1;
public class Contact {
        private String contactID = "";
        private String firstName = "";
        private String lastName = "";
        private String phoneNumber = "";
        private String address = "";
        
        public Contact(String contactId,String fName,String lName,String phone,String address){
                if(contactId.length() <= 10 && contactId != null) {
                		this.contactID = contactId;
                }
                else {
                		throw new IllegalArgumentException("Invalid Contact ID.");
                }
                
                if(fName.length() <= 10 && firstName != null) {
                    	this.firstName = fName;
                }
                else {
            			throw new IllegalArgumentException("Invalid First Name.");
                }
                
                if(lName.length() <= 10 && fName != null) {
                		this.lastName = lName;
                }
                else {
            			throw new IllegalArgumentException("Invalid Last Name.");
                }
                
                if(phone.length() == 10) {
                		this.phoneNumber = phone;
                }
                else {
            			throw new IllegalArgumentException("Invalid Phone Number.");
                }
                
                if(address.length() <= 30 && address != null) {
            			this.address = address;
                }
                else {
            			throw new IllegalArgumentException("Invalid Address.");
                }
        }

        //----------SETTERS-----------//
        public void setFirstName(String fName) {
                if(fName.length() <= 10 && fName != null) {
                        this.firstName = fName;
                }
                else {
        				throw new IllegalArgumentException("Invalid First Name.");
                }
        }
        
        public void setLastName(String lName) {
                if(lName.length() <= 10 && lName != null) {
                        this.lastName = lName;
                }
                else {
        				throw new IllegalArgumentException("Invalid Last Name.");
                }
        }

        public void setPhoneNumber(String phoneNumber) {
                if(phoneNumber.length() == 10 && phoneNumber != null) {
                        this.phoneNumber = phoneNumber;
                }
                else {
        				throw new IllegalArgumentException("Invalid Phone Number.");
                }
        }
        
        public void setAddress(String address) {
                if(address.length() <= 30 && address != null) {
                        this.address = address;
                }
                else {
        			throw new IllegalArgumentException("Invalid Address.");
                }
        }

        //----------GETTERS-----------//
        public String getContactID() {
                return contactID;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public String getAddress() {
                return address;
        }

        @Override
        public String toString() {
                return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName
                                + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
        }
}