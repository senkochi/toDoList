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
    JLabel eTimeLabel;
    JTextField noteTextField;
    JLabel sHourLabel;
    JLabel sMinuteLabel;
    JLabel sSecondLabel;
    JLabel eHourLabel;
    JLabel eMinuteLabel;
    JLabel eSecondLabel;
    JComboBox<Integer> eHourComboBox;
    JComboBox<Integer> eMinuteComboBox;
    JComboBox<Integer> eSecondComboBox;
    JComboBox<Integer> sHourComboBox;
    JComboBox<Integer> sMinuteComboBox;
    JComboBox<Integer> sSecondComboBox;
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

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new GridLayout(5,1));
        //Input task name
        taskNameLabel = new JLabel("Task name");
        taskNameTextField = new JTextField();
        taskNameTextField.setPreferredSize(new Dimension(300,50));
        tNamePanel.add(taskNameLabel);
        tNamePanel.add(taskNameTextField);

        //Time labels
        sHourLabel = new JLabel("hour");
        sMinuteLabel = new JLabel("minute");
        sSecondLabel = new JLabel("second");
        eHourLabel = new JLabel("hour");
        eMinuteLabel = new JLabel("minute");
        eSecondLabel = new JLabel("second");

        //End Time panel
        sTimeLabel = new JLabel("End time:");
        sTimePanel.add(sTimeLabel);
        //End hour
        sHourComboBox = new JComboBox<Integer>(hours);
        sTimePanel.add(sHourLabel);
        sTimePanel.add(sHourComboBox);
        //End minute
        sMinuteComboBox = new JComboBox<Integer>(minutes);
        sTimePanel.add(sMinuteLabel);
        sTimePanel.add(sMinuteComboBox);
        //End second
        sSecondComboBox = new JComboBox<Integer>(minutes);
        sTimePanel.add(sSecondLabel);
        sTimePanel.add(sSecondComboBox);

        //End Time panel
        eTimeLabel = new JLabel("End time:");
        eTimePanel.add(eTimeLabel);
        //End hour
        eHourComboBox = new JComboBox<Integer>(hours);
        eTimePanel.add(eHourLabel);
        eTimePanel.add(eHourComboBox);
        //End minute
        eMinuteComboBox = new JComboBox<Integer>(minutes);
        eTimePanel.add(eMinuteLabel);
        eTimePanel.add(eMinuteComboBox);
        //End second
        eSecondComboBox = new JComboBox<Integer>(minutes);
        eTimePanel.add(eSecondLabel);
        eTimePanel.add(eSecondComboBox);

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
        try {
            return LocalTime.of((Integer) sHourComboBox.getSelectedItem(),
                    (Integer) sMinuteComboBox.getSelectedItem(),
                    (Integer) sSecondComboBox.getSelectedItem());
        } catch (Exception e) {
            return LocalTime.of(0,0,0);
        }
    }
    public LocalTime geteTime(){
        try {
            return LocalTime.of((Integer) eHourComboBox.getSelectedItem(),
                    (Integer) eMinuteComboBox.getSelectedItem(),
                    (Integer) eSecondComboBox.getSelectedItem());
        } catch (Exception e) {
            return LocalTime.of(0,0,0);
        }
    }
    public String getNote(){
        return noteTextField.getText();
    }
    public void addDoneListener(ActionListener listener){
        button.addActionListener(listener);
    }
}
