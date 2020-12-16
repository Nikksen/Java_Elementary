package menu.actions;

import contacts.ContactsService;
import menu.MenuActions;

import java.util.Scanner;

public class FindNameMenuAction implements MenuActions {
    private final ContactsService contactsService;

    public FindNameMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println(contactsService.getContactWithName(inputName()));
    }

    private String inputName() {
        System.out.println("Put the name that you want to find");
        return new Scanner(System.in).nextLine();
    }

    @Override
    public String getName() {
        return "find the name";
    }
}
