package contacts;

public interface ContactsService {
    ContactsList getAll();

    ContactsList remove(int index);

    void add(Contact contact);

}
