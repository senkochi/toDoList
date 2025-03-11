//package controller;
//
//import model.Model;
//import view.View;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Controller {
//    private Model model;
//    private View view;
//
//    public Controller(Model model, View view) {
//        this.model = model;
//        this.view = view;
//
//        this.view.addSubmitListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String name = view.getUserInput();
//                model.setName(name);
//                view.setWelcomeMessage("Welcome, " + name + "!");
//            }
//        });
//    }
//}
package controller;

import model.Model;
import view.TaskAdder;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class Controller {
    private Model model;
    private View view;
    private TaskAdder taskAdder;

    public Controller(Model model,View view){
        this.model = model;
        this.view = view;

        this.view.addSubmitListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskAdder = new TaskAdder();
                taskAdder.addSubmitListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println(taskAdder.getTaskName());
                    }
                });
            }
        });

    }

}

//public void actionPerformed(ActionEvent e) {
//    if(e.getSource()==comboBox){
//        if(text.equals("hr")){
//            sArray[0]= (Integer) comboBox.getSelectedItem();
//        }
//        else if(text.equals("min")){
//            sArray[1]= (Integer) comboBox.getSelectedItem();
//        }
//        else{
//            sArray[2]= (Integer) comboBox.getSelectedItem();
//        }
//        try {
//            eTime = LocalTime.of(sArray[0], sArray[1], sArray[2]);
//        } catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
//        System.out.println(eTime);
//    }
//}