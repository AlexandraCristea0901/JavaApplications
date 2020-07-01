package com.company.alexandra.arrayList;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added successfully.");
        return true;
    }

    public boolean updateContact (Contact currentContact, Contact newContact){
        int foundPosition = findContact(currentContact);
        if (foundPosition < 0) {
            System.out.println(currentContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists." +
                    "Update was not successful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println("Contact " + currentContact.getName() + " has been replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) < 0){
            System.out.println("Contact " + contact.getName() + " was not found.");
            return false;
        }
        this.myContacts.remove(findContact(contact));
        System.out.println("Contact " + contact.getName() + " was deleted.");
        return true;
    }

    public String queryContact (Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact (String name){
        int position = findContact(name);
        if(position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    private int findContact (Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact (String contactName){
        for(int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contact list: ");
        for(int i = 0; i < this.myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + "->" + this.myContacts.get(i).getNumber());
        }
    }

}