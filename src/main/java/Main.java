import contacts.Contact;
import contacts.ContactsService;
import contacts.InMemoryContactsService;
import menu.Menu;
import menu.actions.AddContactMenuAction;
import menu.actions.ExitMenuAction;
import menu.actions.ReadAllContactsMenuAction;
import menu.actions.RemoveContactMenuAction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactsService contactsService = new InMemoryContactsService();
        contactsService.add(new Contact("Nikita","+380957748592"));
        contactsService.add(new Contact("Yakov","+380637564563"));
        Menu menu = new Menu(sc);
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new AddContactMenuAction(contactsService,sc));
        menu.addAction(new ExitMenuAction());
        menu.addAction(new RemoveContactMenuAction(contactsService,sc));
        menu.run();
    }
}
