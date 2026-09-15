

public class Exercicio02_TrocaValores {

    static void trocar(int x, int y) {
        int aux = x;
        x = y;
        y = aux;
        System.out.println("dentro do metodo: x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("antes: a=" + a + " b=" + b);
        trocar(a, b);
        System.out.println("depois: a=" + a + " b=" + b);
    }
}

// Desafio: da pra fazer a virar 20 e b virar 10 depois de trocar()?
// Nao usando so o metodo trocar(int, int), porque em java tudo é
// passado por valor - o metodo so mexe em copias de a e b. Pra
// conseguir o resultado teria que fazer a troca direto no main
// (sem metodo) ou o metodo devolver os dois valores (ex: num array)
// e o main reatribuir a e b com o que foi devolvido.
