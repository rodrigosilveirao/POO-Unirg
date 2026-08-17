import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int notas = 0;
        int soma = 0;
        while (notas < 3) {
            System.out.println("Digite um suas notas:");
            int nota = s.nextInt();
            soma += nota;
            notas++;
        }
        int media = soma / 3;
        System.out.println("A média das notas é: " + media);
        s.close();
    }

}
