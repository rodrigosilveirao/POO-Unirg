public class Exercicio11_Comparacao {
    public static void main(String[] args) {
        String proprietario1 = new String("Carlos");
        String proprietario2 = new String("Carlos");
        String proprietario3 = proprietario1;

        System.out.println(proprietario1 == proprietario2);      // false
        System.out.println(proprietario1 == proprietario3);      // true
        System.out.println(proprietario1.equals(proprietario2)); // true
        System.out.println(proprietario2.equals(proprietario3)); // true
    }
}

// a) false / true / true / true
// b) proprietario1 e proprietario3 apontam pro mesmo objeto
// c) proprietario2 é um objeto separado (mesmo conteudo, objeto diferente)
// d) == verifica se é o mesmo objeto
// e) equals verifica se o conteudo é igual
