package contacts;

public interface ContactsService {
    ContactsList getAll();

    ContactsList remove(int index);

    void add(Contact contact);

    ContactsList getContactWithName(String searchName);

    ContactsList getContactWithPhone(String phone);

}
