/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public String getFirstName()
    {
        String newGuy = firstName;
        return newGuy;
    }
    
        public String getLastName()
    {
        String otherGuy = lastName;
        return otherGuy;
    }
    
    public String toString(){
        String newName = firstName + " " + lastName + " " + phoneNumber + " " + emailAddress;
        return newName;
    }
}
