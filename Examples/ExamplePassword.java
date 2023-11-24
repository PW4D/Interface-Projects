package src.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamplePassword extends JFrame {

  private JFrame frame;
  private JButton button;
  private JLabel label;
  private JLabel label2;
  private JTextField username;
  private JPasswordField password;

  public ExamplePassword() {
    frame = new JFrame("Example Password");
    frame.setLayout(null);

    button = new JButton();
    label = new JLabel();
    label2 = new JLabel();
    username = new JTextField();
    password = new JPasswordField();

    frame.setBounds(200, 200, 500, 500);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setVisible(true);

    button.setBounds(200, 400, 100, 50);
    button.setText("Login");

    label.setText("Username");
    label.setBounds(50, 50, 100, 50);
    username.setBounds(50, 100, 300, 50);

    label2.setText("Password");
    label2.setBounds(50, 200, 100, 50);
    password.setBounds(50, 250, 300, 50);

    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String pass;
        String user;
        
        user = username.getText();
        pass = new String(password.getPassword());

        if ((user.equals("root")) && (pass.equals("toor"))) {
          JOptionPane.showMessageDialog(null, "Successful Login");
        } else {
          JOptionPane.showMessageDialog(null, "Incorrect Login", "ATTENTION", JOptionPane.WARNING_MESSAGE);
        }

        username.setText("");
        password.setText("");
      }
    });

    frame.add(button);
    frame.add(label);
    frame.add(username);
    frame.add(label2);
    frame.add(password);
  }

  public static void main(String[] args) {
    new ExamplePassword();
  }
}
