import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class PoliciaThread extends Thread {
    private int intervalo;
    public PoliciaThread() {
        this.intervalo = 10000;
    }




        @Override
        public void run() {
            for (int i = 1000; i <= this.intervalo; i += 1000) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(" Policia chegando em: " + (this.intervalo - i) / 1000 + "S");
                } catch (InterruptedException e) {
                }
            }
            System.out.println("Os hackers foram pegos pela polícia e estão presos!");
            System.exit(0);
        }

    }

