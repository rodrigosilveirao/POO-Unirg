public class Exercicio03_CofreDigital {

    static boolean verificarSenha(int senhaDigitada) {
        return senhaDigitada == 1234;
    }

    public static void main(String[] args) {
        int senha = 1234;

        boolean acesso = verificarSenha(senha);
        if (acesso) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Senha incorreta!");
        }

        // desafio: usar o retorno direto no if, sem variavel acesso
        if (verificarSenha(senha)) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
