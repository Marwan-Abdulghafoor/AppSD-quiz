package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Contact;
import org.example.model.EmailAddress;
import org.example.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ArrayList<Contact> contacts = new ArrayList<>();

        // First Contact :: David
        Contact contact = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        ArrayList<PhoneNumber> contactNumbers = new ArrayList<>();
        contactNumbers.add(new PhoneNumber("240-112-0123", "Mobile"));
        contactNumbers.add(new PhoneNumber("240-133-0011", "Home"));
        contact.setPhoneNumbers(contactNumbers);
        ArrayList<EmailAddress> contactEmails = new ArrayList<>();
        contactEmails.add(new EmailAddress("dave.san@gmail.com", "Home"));
        contactEmails.add(new EmailAddress("dsanger@argos.com", "Work"));
        contact.setEmailAddresses(contactEmails);

        contacts.add(contact);


        // Second Contact :: Carlos
        contact = new Contact("Carlos", "Jimenez", "", "");
        contactNumbers = new ArrayList<>();
        contactNumbers.add(new PhoneNumber("412-116-9988", "Mobile"));
        contact.setPhoneNumbers(contactNumbers);

        contacts.add(contact);


        // Third Contact :: Ali
        contact = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contactEmails = new ArrayList<>();
        contactEmails.add(new EmailAddress("ali@bmi.com", "Work"));
        contact.setEmailAddresses(contactEmails);

        contacts.add(contact);


        List<Contact> sortedContacts = contacts.stream().sorted((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())).collect(Collectors.toList());

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(sortedContacts);
        System.out.println("Contacts JSON Format:");
        System.out.println(json);

    }

}
