public class hanoi {

    static int contadorMovimentos = 0;

    public static void main(String[] args) {
        resolverHanoi(3, 'A', 'C', 'B');

        System.out.println("Problema resolvido!");
        System.out.println("Total de movimentos: " + contadorMovimentos);
    }

    static void resolverHanoi(int quantidade, char origem, char destino, char auxiliar) {
        if (quantidade == 0) {
            return;
        }

        resolverHanoi(quantidade - 1, origem, auxiliar, destino);

        contadorMovimentos++;
        System.out.println("Movimento " + contadorMovimentos + ": disco " + quantidade
                + " da torre " + origem + " para a torre " + destino);

        resolverHanoi(quantidade - 1, auxiliar, destino, origem);
    }
}