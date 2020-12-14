package menu.actions;

import contacts.Contact;
import contacts.ContactsList;
import contacts.ContactsService;
import menu.MenuActions;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuActions {
    private final ContactsService contactsService;
    private final Scanner scanner;

    public RemoveContactMenuAction(ContactsService contactsService, Scanner scanner) {
        this.contactsService = contactsService;
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.println("Введите индекс контакта который желаете удалить: ");
        int index = scanner.nextInt();
        ContactsList contactsList = contactsService.getAll();
        contactsList.remove(index);
        System.out.println("Вы удалили контакт: " + index);

    }

    @Override
    public String getName() {
        return "delete contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
