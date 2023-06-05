public class Main {
    public static Cofre cofre;
    public static HackerThread hacker1;
    public static HackerThread hacker2;
    public static PoliciaThread policia;

    public static void main(String[] args){
        //Geração da Senha do Cofre
        cofre = new Cofre();

        //Criação da Polícia
        policia = new PoliciaThread();

        //Criação do Hacker
        hacker1 = new HackerThread("Hacker 1");
        hacker2 = new HackerThread("Hacker 2");

        //Inicializa as Threads
        hacker1.start();
        hacker2.start();
        policia.start();

        //Executa o Programa
        policia.run();
        hacker1.run();
        hacker2.run();

    }
}
