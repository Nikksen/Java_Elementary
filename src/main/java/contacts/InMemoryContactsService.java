package contacts;

import contacts.Contact;
import contacts.ContactsList;


public class InMemoryContactsService implements ContactsService {

    private final ContactsList contacts = new ContactsList();

    @Override
    public ContactsList getAll() {
        return contacts;
    }

    @Override
    public void remove(int index) {
        contacts.remove(index);
    }

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }
}
