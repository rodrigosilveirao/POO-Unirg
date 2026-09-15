public class Exercicio06_Controle {

    static class Controle {
        String jogador;
    }

    static void trocar(Controle a, Controle b) {
        a = b;
        a.jogador = "Carlos";
    }

    public static void main(String[] args) {
        Controle c1 = new Controle();
        Controle c2 = new Controle();
        c1.jogador = "Maria";
        c2.jogador = "Joao";

        trocar(c1, c2);

        System.out.println("c1.jogador = " + c1.jogador); // Maria
        System.out.println("c2.jogador = " + c2.jogador); // Carlos
    }
}

// a) resultado: c1 = Maria, c2 = Carlos
// b) c1 nao passa a apontar pro objeto de c2 porque "a" dentro do
//    metodo é so uma copia da referencia de c1. Fazer a=b muda pra
//    onde essa copia local aponta, mas nao mexe na variavel c1 do main.
// c) mesmo assim c2.jogador muda pra Carlos porque depois de a=b, a
//    variavel a passa a apontar pro mesmo objeto que b (e que c2)
//    apontam. Ai a.jogador="Carlos" altera esse objeto compartilhado.
