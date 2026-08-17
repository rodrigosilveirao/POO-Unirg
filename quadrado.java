import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = s.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado do numero é: " + quadrado);
        s.close();
    }
}
