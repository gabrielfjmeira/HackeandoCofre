import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HackerThread extends Thread{
    private String nomeThread;

    public HackerThread(String nomeThread){
        this.nomeThread = nomeThread;
    }
    @Override
    public void run() {
        Random generator = new Random();

        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
            }

            int senhaDecifrada = generator.nextInt(10000);;
            if (this.isInterrupted() == false) {
                if (Main.cofre.verificaSenha(senhaDecifrada) == true) {
                    System.out.println("Senha Decifrada(" + nomeThread + "): " + senhaDecifrada);
                    Main.hacker1.interrupt();
                    Main.hacker2.interrupt();
                    Main.policia.interrupt();
                    System.exit(0);
                    break;
                }
            }
        }

    }
}
