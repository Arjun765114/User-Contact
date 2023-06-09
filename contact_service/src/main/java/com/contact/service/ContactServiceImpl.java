package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact>list= Arrays.asList(new Contact(1L,"arjun@gmail.com","Arjun",1311L),
            new Contact(2L,"anil@gmail.com","Anil",1312L),
            new Contact(3L,"rohan@gmail.com","Rohan",1313L));




    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
