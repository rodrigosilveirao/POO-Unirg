public class saidas {

    public static void main(String[] args) {

        int numero = 1;   // representa o número da linha 
        int soma = 0;     //  soma dos números


        while (numero <= 6) { // enquanto numero for menor ou igual a 6
            soma = soma + numero; // soma numero(1) + soma(0)

            System.out.println(numero + " " + soma); // mostra tudo

            numero++; //adiciona sempre +1 a variavel numero
        }
    }
}