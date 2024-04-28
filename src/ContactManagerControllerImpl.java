public class ContactManagerControllerImpl implements ContactManagerController {
    private ContactManagerModel model;
    private ContactManagerView view;

    public ContactManagerControllerImpl(ContactManagerModel model, ContactManagerView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void addContact(String name, String phone) {
        Contact contact = new Contact(name, phone);
        model.addContact(contact);
        view.displayContacts(model.getAllContacts());
    }

    @Override
    public void deleteContact(Contact contact) {
        model.deleteContact(contact);
        view.displayContacts(model.getAllContacts());
    }

    @Override
    public void loadContacts() {
        // Логіка завантаження контактів з файлу
    }
}
