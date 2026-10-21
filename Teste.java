
class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
    }
}

class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome + "  Salário: " + salario + "  Departamento: " + departamento);
    }
}

public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 3000);   
        f.exibirDados();

        Gerente g = new Gerente("Maria", 5000, "TI");
        g.exibirDados();
    }
}