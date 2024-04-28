import javax.swing.*;

public class ContactManagerApp {
    public static void main(String[] args) {
        ContactManagerModel model = new ContactManagerModel();
        ContactManagerView view = new ContactManagerGUIView();
        ContactManagerController controller = new ContactManagerControllerImpl(model, view);

        // Запуск програми
        controller.loadContacts();

        SwingUtilities.invokeLater(() -> {
            view.displayContacts(model.getAllContacts()); // Оновлення відображення контактів
            view.setVisible(true); // Відображення вікна
        });
    }
}
