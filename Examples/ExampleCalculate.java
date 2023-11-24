package src.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleCalculate extends JFrame {
  
  private JFrame frame;
  private JLabel label, label2, label3;
  private JButton button;
  private JTextField a, b, c;

  public ExampleCalculate() {
    frame = new JFrame("Example Calculate");
    frame.setLayout(null);

    button = new JButton();
    label = new JLabel();
    label2 = new JLabel();
    label3 = new JLabel();

    a = new JTextField();
    b = new JTextField();
    c = new JTextField();

    frame.setBounds(200, 200, 400, 400);
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setVisible(true);

    button.setText("Calculate");
    button.setBounds(145, 300, 100, 50);

    label.setText("Coeficiente de (a): ");
    label.setBounds(25, 25, 200, 50);
    a.setBounds(25, 60, 200, 20);

    label2.setText("Coeficiente de (b): ");
    label2.setBounds(25, 85, 200, 50);
    b.setBounds(25, 120, 200, 20);

    label3.setText("Coeficiente de (c): ");
    label3.setBounds(25, 145, 200, 50);
    c.setBounds(25, 180, 200, 20);

    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        double x1;
        double x2;

        double valorA = Double.valueOf(a.getText());
        double valorB = Double.valueOf(b.getText());
        double valorC = Double.valueOf(c.getText());

        double result = Math.pow(valorB, 2) - 4 * valorA * valorC;

        if (result < 0) {
          JOptionPane.showMessageDialog(null, "No tiene solucion", "ATTENTION", JOptionPane.WARNING_MESSAGE);
        } else {
          x1 = (-valorB + Math.sqrt(result)) / 2 * valorA;
          x2 = (-valorB - Math.sqrt(result)) / 2 * valorA;

          JOptionPane.showMessageDialog(null, "La solucion es: \nx1: " + x1 + " \nx2: " + x2);
        }

        a.setText("");
        b.setText("");
        c.setText("");
      }
    });

    frame.add(button);
    frame.add(label);
    frame.add(a);
    frame.add(label2);
    frame.add(b);
    frame.add(label3);
    frame.add(c);
  }

  public static void main(String[] args) {
    new ExampleCalculate();
  }
}
