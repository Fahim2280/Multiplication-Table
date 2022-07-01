package Multiplication_Table;

import javax.swing.JFrame;

public class Main {

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
