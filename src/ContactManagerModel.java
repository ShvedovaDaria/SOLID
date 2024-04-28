import java.util.ArrayList;
import java.util.List;

public class ContactManagerModel {
    private List<Contact> contacts;

    public ContactManagerModel() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }
}
