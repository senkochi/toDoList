//package model;
//
//public class Model {
//    private String name;
//
//    public Model(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

package model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Model {
    private ArrayList<Task> tasks;

    public Model(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
