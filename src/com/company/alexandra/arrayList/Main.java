/*
This program is meant to illustrate the Array List concept and builds a mobile phone
with various functions which implement the Array List methods.
 */

package com.company.alexandra.arrayList;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0040 7465 944");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printOptions();


        while(!quit){
            System.out.println("\n Enter option (6 to show the available options): ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateExistingContact();
                    break;
                case 4:
                    removeExistingContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        if(mobilePhone.addContact(newContact)){
            System.out.println("New contact added: name= " + name + ", number= " + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateExistingContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact)){
            System.out.println("Contact successfully updated");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void removeExistingContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact() {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        } else {
            System.out.println("Name: " + existingContact.getName() + " phone number is " + existingContact.getNumber());
        }
    }


    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void printOptions(){
        System.out.println("\t Options:");
        System.out.println("\r 0 - Quit");
        System.out.println("\r 1 - Print list of contacts");
        System.out.println("\r 2 - Add new contact");
        System.out.println("\r 3 - Update existing contact");
        System.out.println("\r 4 - Remove contact");
        System.out.println("\r 5 - Search contact");
        System.out.println("\r 6 - Print list of options");
        System.out.println("Choose your action: ");
    }

}
