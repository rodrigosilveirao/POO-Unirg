
public class Exercicio01_DobroNumero {

    static void dobrar(int n) {
        n = n * 2;
        System.out.println("dentro do metodo: " + n);
    }

    public static void main(String[] args) {
        int numero = 10;

        System.out.println("antes: " + numero);
        dobrar(numero);
        System.out.println("depois: " + numero);
    }
}

// Pergunta: o valor de numero muda depois de chamar dobrar()?
// Nao muda. int e passado por valor, entao o metodo recebe uma copia
// de numero. A variavel n so existe dentro do metodo, e quando ele
// termina essa copia é descartada. A numero do main nunca é tocada.
