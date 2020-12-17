package contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Contact[] contactsNew = contacts; // получили ссылку на наш массив
        Contact[] buffer = new Contact[contactsNew.length - 1]; // создаем новый массив
        System.arraycopy(contactsNew, 0, buffer, 0, index); // копируем ДО нашего элемент
        int countResult = contactsNew.length - 1 - index;
        System.arraycopy(contactsNew, index + 1, buffer, index, countResult);
        contacts = buffer;
        count--;
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

    @Override
    public String toString() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Contact contact = getContact(i);
            strings.add(contact.getName() + " -> " + contact.getPhone());
        }
        return "Contacts= " + strings.toString();
    }

    public ContactsList getAll() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
        return null;
    }


}

