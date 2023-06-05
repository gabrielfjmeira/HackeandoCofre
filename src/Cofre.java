import java.util.Random;

public class Cofre {
    private int senha;

    public Cofre() {
        Random generator = new Random();
        this.senha = generator.nextInt(10000);;
        System.out.println("Senha do Cofre: " + senha);
    }

    public Boolean verificaSenha(int senhaGerada) {
        if (this.senha == senhaGerada){
            return true;
        }else {
            return false;
        }
    }
}
