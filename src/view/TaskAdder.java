package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class TaskAdder extends JFrame {
    private JTextField tID;
    private JPanel tNamePanel;
    private JPanel sTimePanel;
    private JPanel eTimePanel;
    private JPanel notePanel;
    private LocalTime sTime;
    private LocalTime eTime;
    private JButton button;
    JLabel taskNameLabel;
    JTextField taskNameTextField;
    JLabel sTimeLabel;
    JTextField noteTextField;
    String[] time = {"hr", "min", "sec"};
    Integer[] hours = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
    Integer[] minutes = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,
                         26,27,28,28,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,
                         49,50,51,52,53,54,55,56,57,58,59};
    public TaskAdder(){
        Integer[] sArray = {0,0,0};
        tID = new JTextField();
        tNamePanel = new JPanel();
        sTimePanel = new JPanel();
        sTimePanel.setBackground(Color.yellow);
        eTimePanel = new JPanel();
        eTimePanel.setBackground(Color.yellow);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new GridLayout(5,1));
        //Input task name
        taskNameLabel = new JLabel("Task name");
        taskNameTextField = new JTextField();
        taskNameTextField.setPreferredSize(new Dimension(300,50));
        tNamePanel.add(taskNameLabel);
        tNamePanel.add(taskNameTextField);
        //Start Time panel
        sTimeLabel = new JLabel("Start time:");
        sTimePanel.add(sTimeLabel);
        for(String text : time){
            JLabel label = new JLabel(text);
            JComboBox<Integer> comboBox;
            if(text.equals("hr")) comboBox = new JComboBox<Integer>(hours);
            else comboBox = new JComboBox<>(minutes);
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==comboBox){
                        if(text.equals("hr")){
                            sArray[0]= (Integer) comboBox.getSelectedItem();
                        }
                        else if(text.equals("min")){
                            sArray[1]= (Integer) comboBox.getSelectedItem();
                        }
                        else{
                            sArray[2]= (Integer) comboBox.getSelectedItem();
                        }
                        try {
                            sTime = LocalTime.of(sArray[0], sArray[1], sArray[2]);
                        } catch (Exception ex) {
                            throw new RuntimeException(ex);
                        }
                        System.out.println(sTime);
                    }
                }
            });
            sTimePanel.add(label);
            sTimePanel.add(comboBox);
        }

        //End Time panel
        JLabel eTimeLabel = new JLabel("End time:");
        eTimePanel.add(eTimeLabel);
        for(String text : time){
            JLabel label = new JLabel(text);
            JComboBox<Integer> comboBox = new JComboBox<Integer>(hours);
            comboBox.addSubmitListener(ActionListener listener);
            eTimePanel.add(label);
            eTimePanel.add(comboBox);
        }
        //Note panel
        notePanel = new JPanel();
        JLabel noteLabel = new JLabel("Note:");
        noteTextField = new JTextField();
        noteTextField.setPreferredSize(new Dimension(300,50));
        notePanel.add(noteLabel);
        notePanel.add(noteTextField);
        //Done button
        button = new JButton("Done!");
        button.setBounds(550,225,50,30);


        this.add(tNamePanel);
        this.add(sTimePanel);
        this.add(eTimePanel);
        this.add(notePanel);
        this.add(button);
        this.setVisible(true);
    }
    public String getTaskName(){
        return taskNameTextField.getText();
    }
    public LocalTime getsTime(){
        return sTime;
    }
    public LocalTime geteTime(){
        return eTime;
    }
    public String getNote(){
        return noteTextField.getText();
    }
    public void addSubmitListener(){

    }
}
