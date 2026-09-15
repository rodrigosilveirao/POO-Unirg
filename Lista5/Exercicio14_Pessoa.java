public class Exercicio14_Pessoa {

    static class Pessoa {
        String nome;
        String cpf;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Pessoa outra = (Pessoa) obj;
            return this.cpf.equals(outra.cpf);
        }
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Carlos";
        p1.cpf = "111.111.111-11";

        Pessoa p2 = new Pessoa();
        p2.nome = "Joao";
        p2.cpf = "111.111.111-11";

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria";
        p3.cpf = "222.222.222-22";

        System.out.println(p1 == p2);      // false
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}

// a) false / true / false
// b) nao, sao objetos diferentes
// c) p1.equals(p2) da true porque sobrescrevi o equals pra comparar
//    pelo cpf, e os dois tem o mesmo cpf mesmo com nomes diferentes
// d) antes o equals herdado de Object era igual ao ==, so comparava
//    se era o mesmo objeto. depois de sobrescrever ele passou a
//    comparar o cpf
// e) porque duas pessoas podem ser a "mesma pessoa" (mesmo cpf) mas
//    serem objetos diferentes no programa, e o == nao pegaria isso
// f) o cpf
