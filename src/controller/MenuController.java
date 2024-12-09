package controller;

import models.Contact;
import view.ConsoleView;

public class MenuController {

    private ContactManager contactManager;
    private ConsoleView consoleView;
    
    

    

    public MenuController() {
    }

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleView.displayMenu();
            String option = consoleView.getInput(" ");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Exiting...");
                    break;
                default:
                    consoleView.showMessage("Invalid Option");
                    break;
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contact added");
    }

    private void findContact() {
        // String name = consoleView.getInput("Ingrese el nombre del contacto a buscar: ");
        // Contact<?, ?> contact = contactManager.findContactByName(name);
        // if (contact != null) {
        //     consoleView.showMessage(contact.toString());
        // } else {
        //     consoleView.showMessage("Contacto no encontrado.");
        // }
    }

    private void deleteContact() {
        // String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        // contactManager.deleteContactByName(name);
        // consoleView.showMessage("Contacto eliminado.");
    }

    private void printList() {
        contactManager.printList();
    }
}
