package contacts;


public class InMemoryContactsService implements ContactsService {

    private final ContactsList contacts = new ContactsList();

    @Override
    public ContactsList getAll() {
        return contacts;
    }

    @Override
    public ContactsList remove(int index) {
        contacts.remove(index);
        return contacts.getAll();
    }

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }
}
