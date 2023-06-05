import java.util.Timer;
import java.util.TimerTask;

public class PoliciaThread extends Thread{

    public PoliciaThread() {
        int intervalo = 10000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (Main.policia.isInterrupted() == false){
                    System.out.println("Os hackers foram pegos pela polícia e estão presos!");
                    Main.hacker1.interrupt();
                    Main.hacker2.interrupt();
                    Main.policia.interrupt();
                    System.exit(0);
                }
            }
        }, intervalo);
    }
}
