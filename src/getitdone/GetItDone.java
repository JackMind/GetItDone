package getitdone;
import java.util.Calendar;
import dataStructer.Schedule;
import gui.App;

/**
 * 
 * @author JackMind
 */
public class GetItDone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new App().setVisible(true);
        GetYMDHMS a = new GetYMDHMS();
        a.now();
        Schedule b = new Schedule();       
    }
    
}

class GetYMDHMS{   
    public void now () {
        Calendar cal = Calendar.getInstance();
        
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        
        System.out.printf("Now is %02d:%02d:%02d of %02d/%02d/%4d\n", hour, minute, second, day, month, year);
    }
}