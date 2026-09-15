public class Exercicio12_Comparacao {
    public static void main(String[] args) {
        String cidade1 = new String("Gurupi");
        String cidade2 = new String("Palmas");
        cidade2 = cidade1;

        System.out.println(cidade1 == cidade2);      // true
        System.out.println(cidade1.equals(cidade2)); // true
    }
}

// a) cidade1 aponta pro objeto "Gurupi"
// b) depois de cidade2 = cidade1, cidade2 tambem passa a apontar pro
//    objeto "Gurupi", perdendo a referencia que tinha pro "Palmas"
// c) true / true
// d) o objeto "Palmas" continua na memoria ate o garbage collector
//    passar, mas nenhuma variavel aponta mais pra ele
// e) copia so a referencia, nao o objeto
