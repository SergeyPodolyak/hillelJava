package Sving;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by User on 05.04.2016.
 */
public class MainForm extends JFrame {
    private JPanel panel;
    private JButton closeButton;
    private JButton anotherCloseButton;

    public MainForm() {
        setContentPane(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My first form");
        pack();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        actionListener = e -> System.exit(0);

        CloseOperation closeOperation = new CloseOperation();
closeButton.addActionListener(closeOperation);
        anotherCloseButton.addActionListener(closeOperation);
    }

    public static void main(String[] args) {
        new MainForm();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
