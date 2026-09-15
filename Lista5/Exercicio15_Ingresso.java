public class Exercicio15_Ingresso {

    static class Ingresso {
        String filme;
        int numero;

        Ingresso(String filme, int numero) {
            this.filme = filme;
            this.numero = numero;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Ingresso outro = (Ingresso) obj;
            return this.numero == outro.numero;
        }
    }

    public static void main(String[] args) {
        Ingresso i1 = new Ingresso("Avatar", 25);
        Ingresso i2 = new Ingresso("Interestelar", 25);
        Ingresso i3 = new Ingresso("Avatar", 30);

        System.out.println(i1 == i2);      // false
        System.out.println(i1.equals(i2)); // true
        System.out.println(i1.equals(i3)); // false
    }
}

// a) false / true / false
// b) == compara se é o mesmo objeto (sao diferentes -> false).
//    equals usa o criterio que eu defini (so o numero), que é igual
//    (25) -> true. por isso os dois dao resultado diferente
// c) o numero do ingresso, nao importa o filme
// d) se o numero de i2 virasse 30, i2.equals(i3) daria true e
//    i1.equals(i2) daria false
// e) da pra definir o que conta como "ingresso igual" no sistema
//    (mesma posicao/numero), o que é mais util que so comparar
//    identidade
// f) o equals padrao do Object so olha se é o mesmo objeto, e como
//    sempre uso new pra criar os ingressos nunca ia dar true mesmo
//    com numero igual
