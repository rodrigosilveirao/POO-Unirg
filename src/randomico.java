import java.util.Random;

public class randomico {
    public static void main(String[] args) {
        int memoria = 0;
        while (memoria != 20) {
            Random aleatorio = new Random(); //cria random

            int numero = aleatorio.nextInt(20); //declara quantos numeros aleatorios terá

            System.out.println("Número aleatório: " + numero); 
            memoria++; // adiciona +1 a memoria ate ela chegar em 20 e parar
        }
    }

}