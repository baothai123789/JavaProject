package org.baothai.TodoListApp;

import java.time.LocalDateTime;

public class Task {
    private String taskID;
    private String jobDescription;
    private String field;
    private Status status;
    private final LocalDateTime createAt;
    private LocalDateTime End_date;
    private Priority priority;
    public Task(){
        this.createAt = LocalDateTime.now();
        this.End_date=LocalDateTime.now();
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }



    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID='" + taskID + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", field='" + field + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", End_date=" + End_date +
                ", priority=" + priority +
                '}';

    }
}
