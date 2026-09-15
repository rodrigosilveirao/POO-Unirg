public class Exercicio17_ContaBancaria {

    static class ContaBancaria {
        private String numeroConta;
        private String titular;
        private double saldo;

        ContaBancaria(String numeroConta, String titular, double saldoInicial) {
            this.numeroConta = numeroConta;
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public String getNumeroConta() { return numeroConta; }
        public String getTitular() { return titular; }
        public void setTitular(String novoTitular) { this.titular = novoTitular; }

        public double getSaldo() { return saldo; }
        // sem setSaldo de proposito

        public void depositar(double valor) {
            if (valor <= 0) throw new IllegalArgumentException("valor invalido");
            saldo += valor;
        }

        public void sacar(double valor) {
            if (valor <= 0) throw new IllegalArgumentException("valor invalido");
            if (valor > saldo) throw new IllegalStateException("saldo insuficiente");
            saldo -= valor;
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", "Carlos", 1000.0);

        System.out.println("titular: " + conta.getTitular());
        System.out.println("saldo inicial: " + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("saldo apos deposito: " + conta.getSaldo());

        conta.sacar(200.0);
        System.out.println("saldo apos saque: " + conta.getSaldo());

        conta.setTitular("Carlos Eduardo");
        System.out.println("novo titular: " + conta.getTitular());
    }
}

// 1) get: numeroConta, titular, saldo
// 2) set: so titular
// 3) se tivesse set de saldo comum, qualquer codigo poderia mudar o
//    saldo sem passar pelas regras do banco (saldo negativo, etc).
//    o saldo so deve mudar via depositar/sacar
// 4) mantendo os atributos private e so liberando metodos especificos,
//    evita que o estado da conta fique inconsistente
