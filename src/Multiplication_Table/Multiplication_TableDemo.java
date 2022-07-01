package Multiplication_Table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Multiplication_TableDemo extends JFrame {

    private ImageIcon icon, img;
    private Container c;
    private JLabel imglb, textlb;
    private Font f1, f2;
    private JTextField tf;
    private JTextArea ta;
    private JButton bu;
    private Cursor cu;

    void icon() {
        icon = new ImageIcon(getClass().getResource("Multiplication Table  icon.png"));
        this.setIconImage(icon.getImage());
    }

    void label() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Arial", Font.BOLD, 18);
        cu = new Cursor(Cursor.HAND_CURSOR);

        img = new ImageIcon(getClass().getResource("Multiplication Table img.png"));
        imglb = new JLabel(img);
        imglb.setBounds(20, 10, img.getIconWidth(), img.getIconWidth());
        c.add(imglb);

        textlb = new JLabel("Enter any number : ");
        textlb.setBounds(20, 250, 250, 50);
        textlb.setForeground(Color.black);
        textlb.setFont(f1);
        c.add(textlb);

        tf = new JTextField();
        tf.setBounds(230, 250, 90, 50);
        tf.setBackground(Color.LIGHT_GRAY);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f1);
        c.add(tf);

        bu = new JButton("Clear");
        bu.setBounds(230, 315, 90, 50);
        bu.setFont(f1);
        bu.setCursor(cu);
        bu.setBackground(Color.RED);
        c.add(bu);

        ta = new JTextArea();
        ta.setBounds(20, 380, 300, 250);
        ta.setFont(f2);
        c.add(ta);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Value = tf.getText();
                if (Value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't Enter any number", "Multiplication Table", 0);
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + incr + " = " + r + "\n");

                    }
                }
            }
        });
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                tf.setText("");

            }
        });

    }

    public static void main(String[] args) {
        Multiplication_TableDemo obj = new Multiplication_TableDemo();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setBounds(300, 20, 360, 700);
        obj.setTitle("Multiplication Table");
        obj.icon();
        obj.label();
    }
}
