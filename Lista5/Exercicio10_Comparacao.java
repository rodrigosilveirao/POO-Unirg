public class Exercicio10_Comparacao {
    public static void main(String[] args) {
        String endereco1 = new String("Rua das Flores");
        String endereco2 = endereco1;
        System.out.println(endereco1 == endereco2);      // true
        System.out.println(endereco1.equals(endereco2)); // true
    }
}

// a) true / true
// b) so 1 objeto foi criado, endereco2 = endereco1 so copia a referencia
// c) endereco1 aponta pro objeto criado com new String
// d) endereco2 aponta pro mesmo objeto que endereco1
// e) porque depois de endereco2 = endereco1 as duas variaveis guardam
//    a mesma referencia, entao == da true
