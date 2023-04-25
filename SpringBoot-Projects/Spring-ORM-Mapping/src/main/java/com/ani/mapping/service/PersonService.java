package com.ani.mapping.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ani.mapping.domain.ContactDetails;
import com.ani.mapping.domain.IdentityDoc;
import com.ani.mapping.domain.Person;
import com.ani.mapping.repository.ContactDetailsRepository;
import com.ani.mapping.repository.IdentityDocRepository;
import com.ani.mapping.repository.PersonRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonService {
    private PersonRepository personRepository;
    private ContactDetailsRepository contactDetailsRepository;
    private IdentityDocRepository identityDocRepository;

    public void insertPerson(String name, LocalDate dob, String docType, boolean isActive, String mobile, String email) {
        // Create a new Person object and set its properties
        Person person = new Person();
        person.setName(name);
        person.setDob(dob);

        person = personRepository.save(person);

        IdentityDoc identityDoc = new IdentityDoc();
        identityDoc.setType(docType);
        identityDoc.setIsActive(isActive);
        identityDoc.setPerson(person);

        identityDocRepository.save(identityDoc);

        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setMobile(mobile);
        contactDetails.setEmail(email);
        contactDetails.setPerson(person);

        contactDetailsRepository.save(contactDetails);
    }

    public void insertPersonOnly(String name, LocalDate dob) {
        Person person = new Person();
        person.setName(name);
        person.setDob(dob);

        // Save the Person object to the database and retrieve its generated ID
        personRepository.save(person);
    }

    public void addContactDetails(long personId, String mob, String eml) {

        Optional<Person> op = personRepository.findById(personId);
        Person person = op.orElseThrow(RuntimeException::new);

        ContactDetails details = new ContactDetails();
        details.setEmail(eml);
        details.setMobile(mob);
        details.setPerson(person);

        contactDetailsRepository.save(details);
    }

    public List<Person> listAll() {
        return personRepository.findAll();
    }


}
