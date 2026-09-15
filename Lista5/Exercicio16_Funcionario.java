public class Exercicio16_Funcionario {

    static class Funcionario {
        private String nome;
        private String cargo;
        private double salario;

        Funcionario(String nome, String cargo, double salario) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;
        }

        public String getNome() { return nome; }
        public String getCargo() { return cargo; }

        // o funcionario pode ver o proprio salario, e o gerente tambem pode ver
        public double getSalario(Object quemPediu) {
            if (quemPediu == this || quemPediu instanceof Gerente) {
                return salario;
            }
            throw new SecurityException("sem acesso ao salario de " + nome);
        }

        // so o gerente pode mudar o salario
        public void setSalario(double novoSalario, Gerente gerente) {
            if (gerente == null) {
                throw new SecurityException("so o gerente pode alterar o salario");
            }
            this.salario = novoSalario;
        }
    }

    static class Gerente {
        String nome;
        Gerente(String nome) { this.nome = nome; }
    }

    public static void main(String[] args) {
        Funcionario carlos = new Funcionario("Carlos", "Analista", 3000.0);
        Gerente ana = new Gerente("Ana");

        System.out.println("Carlos ve o proprio salario: " + carlos.getSalario(carlos));
        System.out.println("Gerente ve salario do Carlos: " + carlos.getSalario(ana));

        carlos.setSalario(3500.0, ana);
        System.out.println("salario depois do reajuste: " + carlos.getSalario(carlos));

        Funcionario joao = new Funcionario("Joao", "Analista", 2800.0);
        try {
            carlos.getSalario(joao);
        } catch (SecurityException e) {
            System.out.println("erro esperado: " + e.getMessage());
        }
    }
}

// 1) quem usa o get do salario: o proprio funcionario e o gerente
// 2) quem usa o set: so o gerente
// 3) se o salario fosse public, qualquer parte do codigo poderia ler
//    ou mudar sem seguir nenhuma regra
// 4) o encapsulamento deixa o atributo escondido e so libera acesso
//    controlado via metodos, protegendo o dado
