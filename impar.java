import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        while (numero != -1) {
            System.out.println("Digite um numero positivo");
            numero = s.nextInt();
            if (numero % 2 != 0) {
                System.out.println("O numero "+ numero + " é impar");
            } else {
                System.out.println("O numero "+ numero + " é par");
            }
            System.out.println("\nDigite -1 para sair ou\n");

        }
        s.close();
    }

}


