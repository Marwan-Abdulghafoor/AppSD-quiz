package org.example.model;

import java.util.ArrayList;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<EmailAddress> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
    }

    public Contact(String firstName, String lastName, String company, String jobTitle, ArrayList<PhoneNumber> phoneNumbers, ArrayList<EmailAddress> emailAddresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emailAddresses = emailAddresses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ArrayList<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public ArrayList<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(ArrayList<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
