import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Components extends JFrame {
  
  private JLabel labelText;
  private JTextField fieldText;
  private JButton btn;
  private JPanel panel;

  public Components() {
    super("Components Example");

    //static final int CENTER - The central position in an area
    labelText = new JLabel("Components CENTER", SwingConstants.CENTER);
    //Constructs a new empty TextField with the specified number of columns
    fieldText = new JTextField(30);
    btn = new JButton("Delete");
    panel = new JPanel();
    
    //GridLayout(int rows, int cols) - the horizontal gap : the vertical gap
    panel.setLayout(new GridLayout(3, 1));
    
    /*---------------------------------------------------------------------------*/
    btn.addActionListener( new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent b) {
        fieldText.setText("");
      } 
    });

    fieldText.addKeyListener(new KeyAdapter() {

      @Override
      public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          String message = fieldText.getText();
          JOptionPane.showMessageDialog(null, "Message is: " + message);
        }
      }
    });

    panel.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseClicked(MouseEvent e) {

        if(SwingUtilities.isRightMouseButton(e)) {
          JOptionPane.showMessageDialog(null, "The process was corrupted!", "ATTENTION", JOptionPane.WARNING_MESSAGE);
        }
      }
    });
    /*----------------------------------------------------------------------------*/

    panel.add(labelText);
    panel.add(fieldText);
    panel.add(btn);
    setContentPane(panel);
    setSize(350, 300);
    setVisible(true);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Components();
  }
}
