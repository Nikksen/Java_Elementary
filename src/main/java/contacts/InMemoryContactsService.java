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
    public String getContactWithName(String searchName) {
        for (int i = 0; i < contactsList.size() ; i++) {
            if (contactsList.contacts[i].getName().startsWith(searchName)){
                System.out.println(contactsList.contacts[i].getName() + " " + contactsList.contacts[i].getPhone());
            }
        }
        return "Все что нашли -_-";
    }

    @Override
    public String getContactWithPhone(String phone) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.contacts[i].getPhone().contains(phone)){
                System.out.println(contactsList.contacts[i].getPhone() + " " + contactsList.contacts[i].getName());
            }
        }
        return "Все что нашли -_-";
    }
}
