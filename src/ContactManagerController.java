import java.util.List;

public interface ContactManagerController {
    void addContact(String name, String phone);
    void deleteContact(Contact contact);
    void loadContacts();
}

