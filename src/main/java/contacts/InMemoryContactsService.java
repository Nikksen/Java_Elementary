package contacts;


public class InMemoryContactsService implements ContactsService {

    private final ContactsList contactsList = new ContactsList();

    @Override
    public ContactsList getAll() {
        return contactsList;
    }

    @Override
    public ContactsList remove(int index) {
        contactsList.remove(index);
        return contactsList.getAll();
    }

    @Override
    public void add(Contact contact) {
        contactsList.add(contact);
    }

    @Override
    public ContactsList getContactWithName(String searchName) {
       ContactsList contactsListByName = new ContactsList();
        for (int i = 0; i < contactsList.size() ; i++) {
            if (contactsList.getContact(i).getName().startsWith(searchName)){
                contactsListByName.add(contactsList.getContact(i));
            }
        }
        return contactsListByName;
    }

    @Override
    public ContactsList getContactWithPhone(String phone) {
        ContactsList contactsListByPhone = new ContactsList();
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.getContact(i).getPhone().contains(phone)){
                contactsListByPhone.add(contactsList.getContact(i));
            }
        }
        return contactsListByPhone;
    }
}
