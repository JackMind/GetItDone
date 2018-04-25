
package dataStructer;

import java.util.Calendar;
/**
 *
 * @author JackMind
 */
public class Schedule {
    public Schedule(){
        for(int i = 0; i < totalWeekDay; i++){
            for(int j = 0; j < totalHoursInADay; j++){
                scheduleSpace[i][j] = null;
            }
        }
    }
  
    public void setSchedule(Calendar scheduleCalendar, String task){
        this.scheduleSpace[this.weekDay][this.hour] = new Task(scheduleCalendar, task);
    }
    
    public Task getSchedule(){
        return scheduleSpace[this.weekDay][this.hour];
    }
    
    private final int totalWeekDay = 6;
    private final int totalHoursInADay = 23;
    private int weekDay;
    private int hour;
    private Task[][] scheduleSpace;
   
}

class Task {
    Task(Calendar taskCalendar, String task){
        this.taskCalendar = taskCalendar;
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Calendar getTaskCalendar() {
        return taskCalendar;
    }

    public void setTaskCalendar(Calendar taskCalendar) {
        this.taskCalendar = taskCalendar;
    }
       
    private Calendar taskCalendar;
    private String task;
    
}
