public class Exercicio09_Comparacao {
    public static void main(String[] args) {
        String casa1 = new String("Casa Azul");
        String casa2 = new String("Casa Azul");
        System.out.println(casa1 == casa2);      // false
        System.out.println(casa1.equals(casa2)); // true
    }
}

// a) false / true
// b) sim, mesmo conteudo ("Casa Azul")
// c) nao, sao objetos diferentes (new String cria um objeto novo cada vez)
// d) == compara se é o mesmo objeto na memoria, nao o conteudo
// e) equals compara o conteudo das strings
