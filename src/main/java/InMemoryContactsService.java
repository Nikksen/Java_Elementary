public class InMemoryContactsService implements ContactsService {
    ContactsList contactsList = new ContactsList();

    @Override
    public ContactsList getAll() {
        return contactsList.getAll();
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);
    }

    @Override
    public void add(Contact contact) {
        contactsList.add(contact);
    }
}
