public class Exercicio04_Pontuacao {

    static int calcularPontos(int inimigosDerrotados, int pontosPorInimigo) {
        return inimigosDerrotados * pontosPorInimigo;
    }

    public static void main(String[] args) {
        int inimigos = 8;
        int pontosPorInimigo = 150;

        int pontuacao = calcularPontos(inimigos, pontosPorInimigo);
        System.out.println("Pontuacao: " + pontuacao);

        // desafio: checar se passou de 1000 pontos sem mexer no metodo
        if (pontuacao >= 1000) {
            System.out.println("Parabens! Voce passou de fase!");
        } else {
            System.out.println("Continue jogando!");
        }
    }
}

// calcularPontos imprime ou devolve o valor? Ele so devolve (return),
// nao imprime nada. Quem decide o que fazer com o numero é quem chamou
// o metodo (o main). Por isso deu pra fazer o desafio sem mexer no
// metodo: o valor ja ta guardado em pontuacao e da pra comparar com
// 1000 fora dele.
