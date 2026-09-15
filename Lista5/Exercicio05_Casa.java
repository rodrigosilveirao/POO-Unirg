public class Exercicio05_Casa {

    static class Casa {
        String proprietario;
        int quartos;
    }

    static void modificarCasa(Casa casa) {
        casa.quartos = casa.quartos + 2;
        casa.proprietario = "Ana";
    }

    static void modificarCasaDesafio(Casa casa) {
        casa = new Casa();
        casa.proprietario = "Joao";
        casa.quartos = 10;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa();
        minhaCasa.proprietario = "Carlos";
        minhaCasa.quartos = 3;

        System.out.println("Antes:");
        System.out.println("Proprietario: " + minhaCasa.proprietario);
        System.out.println("Quartos: " + minhaCasa.quartos);

        modificarCasa(minhaCasa);

        System.out.println("Depois:");
        System.out.println("Proprietario: " + minhaCasa.proprietario);
        System.out.println("Quartos: " + minhaCasa.quartos);

        modificarCasaDesafio(minhaCasa);
        System.out.println("Depois do desafio ainda: " + minhaCasa.proprietario + ", " + minhaCasa.quartos);
    }
}

// O metodo recebe uma copia da referencia, entao por que as mudancas
// aparecem no main? Porque essa copia aponta pro MESMO objeto que ta
// na memoria. Mudar casa.quartos ou casa.proprietario nao mexe na
// referencia, mexe no conteudo do objeto que as duas referencias
// (a do main e a do metodo) apontam junto.
//
// No desafio, por que a casa do main nao vira "Joao" com 10 quartos?
// Porque "casa = new Casa()" so faz a copia local da referencia
// apontar pra um objeto novo. A variavel minhaCasa la no main continua
// apontando pro objeto antigo, que nao foi alterado. Da pra mudar o
// objeto, mas nao da pra fazer a referencia de quem chamou apontar
// pra outro lugar.
