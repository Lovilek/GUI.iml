package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    private JTextField textField;
    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My first GUI");
        setSize(300,300);
        setLayout(null);
        label =new JLabel("Welcome to my GUI");
        label.setSize(200,20);
        label.setLocation(100,100);
        add(label);
        textField=new JTextField("Hello world");
        textField.setSize(200,20);
        textField.setLocation(100,200);
        add(textField);
        button=new JButton("Click here");
        button.setSize(200,30);
        button.setLocation(100,300);
        button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String text=textField.getText();
            if(!text.equals("")){
                label.setText(text);
                textField.setText("");
            }
        }
        });
        add(button);
    }
}
