import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ContactManagerGUIView extends JFrame implements ContactManagerView {
    private DefaultListModel<Contact> contactsModel;
    private JList<Contact> contactsList;

    public ContactManagerGUIView() {
        // Ініціалізація компонентів GUI
        contactsModel = new DefaultListModel<>();
        contactsList = new JList<>(contactsModel);
        JButton addButton = new JButton("Add Contact");
        JButton deleteButton = new JButton("Delete Contact");

        // Додавання компонентів на вікно програми з використанням BorderLayout
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        add(new JScrollPane(contactsList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Центруємо вікно програми на екрані
    }

    @Override
    public void displayContacts(List<Contact> contacts) {
        // Оновлення відображення списку контактів
        contactsModel.clear();
        for (Contact contact : contacts) {
            contactsModel.addElement(contact);
        }
    }

    @Override
    public void showMessage(String message) {
        // Відображення повідомлення
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
}
