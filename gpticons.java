import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class gpticons implements ActionListener {
    private JLabel l1, l2, l3;
    private JTextField t1, t2, t3;
    private JToggleButton b1, b2, b3;
    private JFrame j;

    gpticons() {
        j = new JFrame();
        j.setTitle("Calculator");
        j.setLayout(null);

        l1 = new JLabel("Number 1");
        t1 = new JTextField(20);
        l2 = new JLabel("Number 2");
        t2 = new JTextField(20);
        l3 = new JLabel("Result");
        t3 = new JTextField(20);
        t3.setEditable(false); // Result field should not be editable

        ImageIcon addIcon = new ImageIcon("Download.png");
        ImageIcon subIcon = new ImageIcon("minus.png");
        ImageIcon mulIcon = new ImageIcon("mul.png");

        b1 = new JToggleButton(addIcon);
        b2 = new JToggleButton(subIcon);
        b3 = new JToggleButton(mulIcon);

        l1.setBounds(50, 50, 100, 50);
        t1.setBounds(200, 50, 100, 50);
        l2.setBounds(50, 150, 100, 50);
        t2.setBounds(200, 150, 100, 50);
        l3.setBounds(50, 250, 100, 50);
        t3.setBounds(200, 250, 100, 50);
        b1.setBounds(50, 350, 75, 35);
        b2.setBounds(150, 350, 75, 35);
        b3.setBounds(250, 350, 75, 35);

        j.add(l1);
        j.add(t1);
        j.add(l2);
        j.add(t2);
        j.add(l3);
        j.add(t3);
        j.add(b1);
        j.add(b2);
        j.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        j.setSize(500, 500);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int result = 0;

            if (e.getSource() == b1) {
                result = n1 + n2;
            } else if (e.getSource() == b2) {
                result = n1 - n2;
            } else if (e.getSource() == b3) {
                result = n1 * n2;
            }

            t3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new gpticons();
    }
}
