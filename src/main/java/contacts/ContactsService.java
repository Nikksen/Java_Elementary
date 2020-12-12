package contacts;

import contacts.Contact;
import contacts.ContactsList;

public interface ContactsService {
    ContactsList getAll();

    void remove(int index);

    void add(Contact contact);

}
