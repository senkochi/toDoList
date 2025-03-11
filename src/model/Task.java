package model;

import java.time.LocalTime;

public class Task {
    private int taskId;
    private String taskName;
    private LocalTime startTime;
    private LocalTime endTime;
    private String note;

    public Task(String taskName,LocalTime startTime,LocalTime endTime,String note){
        //this.taskId = taskId;
        this.taskName = taskName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }
}
