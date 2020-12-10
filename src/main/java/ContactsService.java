public interface ContactsService {
    ContactsList getAll();

    void remove(int index);

    void add(Contact contact);

}
