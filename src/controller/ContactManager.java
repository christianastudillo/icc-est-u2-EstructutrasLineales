package controller;

import materia.models.NodeGeneric;
import models.Contact;
import models.LinkedList;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name) {
        //contacts.deleteByValue(findContactByName(name));
    }

    public void printList() {
        contacts.print();
    }
}
