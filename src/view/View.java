//package view;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//public class View extends JFrame {
//    private JTextField nameField;
//    private JButton submitButton;
//    private JLabel messageLabel;
//
//    public View() {
//        setTitle("MVC GUI Example");
//        setSize(300, 200);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(new FlowLayout());
//
//        // UI Components
//        nameField = new JTextField(15);
//        submitButton = new JButton("Submit");
//        messageLabel = new JLabel("Enter your name:");
//
//        // Add Components to Frame
//        add(messageLabel);
//        add(nameField);
//        add(submitButton);
//
//        setVisible(true);
//    }
//
//    public String getUserInput() {
//        return nameField.getText();
//    }
//
//    public void setWelcomeMessage(String message) {
//        messageLabel.setText(message);
//    }
//
//    public void addSubmitListener(ActionListener listener) {
//        submitButton.addActionListener(listener);
//    }
//}

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;
    private JButton addButton;

    public View(){
        topPanel = new JPanel();
        midPanel = new JPanel();
        botPanel = new JPanel();

        addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TaskAdder();
            }
        });

        topPanel.setBackground(Color.red);
        midPanel.setBackground(Color.green);
        botPanel.setBackground(Color.blue);
        //Top panel
        topPanel.setPreferredSize(new Dimension(50,50));
        JLabel topLabel = new JLabel("To do list");
        topPanel.add(topLabel);
        //Mid panel

        //Bot panel
        botPanel.setPreferredSize(new Dimension(50,75));

        botPanel.add(addButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,600);
        this.setLayout(new BorderLayout());

        this.add(topPanel,BorderLayout.NORTH);
        this.add(midPanel,BorderLayout.CENTER);
        this.add(botPanel,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void addTasks(JPanel task) {
        midPanel.add(task);
    }
}