import java.util.Random;

public class randomico {
    public static void main(String[] args) {
        int memoria = 0;
        while (memoria != 20) {
            Random aleatorio = new Random();

            int numero = aleatorio.nextInt(20);

            System.out.println("Número aleatório: " + numero);
            memoria++;
        }
    }

}