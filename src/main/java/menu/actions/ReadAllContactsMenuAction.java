package menu.actions;

import contacts.ContactsList;
import contacts.ContactsService;
import menu.MenuActions;

public class ReadAllContactsMenuAction implements MenuActions {
    private final ContactsService contactsService;

    public ReadAllContactsMenuAction(ContactsService contactsService) {
        this.contactsService = contactsService;
    }

    @Override
    public void doAction() {
        System.out.println("--------------------");
        ContactsList contactsList = contactsService.getAll();
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.printf("%d - %s, %s\n", i, contactsList.getContact(i).getName(), contactsList.getContact(i).getPhone());
        }
        System.out.println("--------------------");
    }

    @Override
    public String getName() {
        return "show contacts";
    }


}
