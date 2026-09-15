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

// Crio variaveis de nota e a soma, faco o while para que receba as 3 notas, smepre q receber a gente aumenta notas em 1 para que quanto chegue em 3
// ela pare e faca a soma, soma recebe as 3 notas e as soma obviamente
// dps ciramos variavel media e dividmos pela quantidade de notas esperadas
