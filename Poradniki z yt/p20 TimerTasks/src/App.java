import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if(count<0){
                    System.out.println("kuiniec");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);
    }
}
