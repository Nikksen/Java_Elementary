import java.util.Arrays;

public class ContactsList {
    Contact[] contacts = new Contact[10];
    private int count = 0;

    public Contact getContact(int index) {
        return contacts[index];
    }

    public void setContact(int index, Contact contact) {
        this.contacts[index] = contact;
    }

    public int size() {
        return count;
    }

    public void remove(int index) {
        Contact[] buffer = new Contact[contacts.length - 1];
        for (int i = 0; i < contacts.length; i++) {
            buffer[i] = contacts[i < index ? i : i + 1];
        }
        contacts = buffer;
    }

    public void add(Contact contact) {
        if (count < contacts.length) {
            contacts[count] = contact;
        } else {
            contacts = Arrays.copyOf(contacts, contacts.length + 1);
            contacts[contacts.length - 1] = contact;
        }
        count++;
    }

    public ContactsList getAll(){
        for (Contact c : contacts){
            System.out.println(c);
        }
        return null;
    }


}

