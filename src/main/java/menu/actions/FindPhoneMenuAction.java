package menu.actions;

import contacts.ContactsService;
import menu.MenuActions;

import java.util.Scanner;

public class FindPhoneMenuAction implements MenuActions {
    private final ContactsService contactsService;

    public FindPhoneMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }


    @Override
    public void doAction() {
        System.out.println(contactsService.getContactWithPhone(inputNumber()));
    }

    private String inputNumber() {
        System.out.println("Put the number that you want to find");
        return new Scanner(System.in).nextLine();
    }

    @Override
    public String getName() {
        return "find the phone number";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
