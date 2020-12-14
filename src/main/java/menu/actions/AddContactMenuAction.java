package menu.actions;

import contacts.Contact;
import contacts.ContactsService;
import menu.MenuActions;

import java.util.Scanner;

public class AddContactMenuAction implements MenuActions {
    private ContactsService contactsService;
    private Scanner scanner;

    public AddContactMenuAction(ContactsService contactsService, Scanner scanner) {
        this.contactsService = contactsService;
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.println("Введите номер телефона: ");
        String phone = scanner.nextLine();
        System.out.println("Введите имя человека: ");
        String name = scanner.nextLine();
        Contact contact = new Contact(name, phone);
        contactsService.add(contact);
    }

    @Override
    public String getName() {
        return "add contact";
    }


}
