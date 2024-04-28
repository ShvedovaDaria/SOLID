import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public interface ContactManagerView {
    void displayContacts(List<Contact> contacts);
    void showMessage(String message);

    void setVisible(boolean b);
}



