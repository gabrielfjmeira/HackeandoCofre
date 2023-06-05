import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HackerThread extends Thread{
    private String nomeThread;
    private int min;
    private int max;

    public HackerThread(String nomeThread,int min,int max){
        this.nomeThread = nomeThread;
        this.min = min;
        this.max = max;
    }
    @Override
    public void run() {
        Random generator = new Random();
        for(int i =min;i<=max;i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
            }

            if (Main.cofre.verificaSenha(i) == true) {
                System.out.println("Senha Decifrada(" + nomeThread + "): " + i);
                System.exit(0);
                break;
            }

        }
    }

}
