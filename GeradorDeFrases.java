import java.util.Random;

public class GeradorDeFrases {

    public static void main(String[] args) {
        String[] listaUm = {"agnostic", "opinionated", "voice activated", "highly driven"};
        String[] listaDois = {"loosely coupled", "six sigma", "asynchronous", "event driven"};
        String[] listaTres = {"framework", "library", "repository", "pipeline"};

        Random random = new Random(); //cria um random


        int tamanhoUm = listaUm.length; // tamanho das listas
        int tamanhoDois = listaDois.length;
        int tamanhoTres = listaTres.length;


        int memoriaUm = random.nextInt(tamanhoUm); // uma variavel de memoria para randomizar uma palavra dentre o tamanho (lenght) da string
        int memoriaDois = random.nextInt(tamanhoDois);
        int memoriaTres = random.nextInt(tamanhoTres);


        String palavraUm = listaUm[memoriaUm]; // a palavra um recebe a posicao randomizada da lista em questao
        String palavraDois = listaDois[memoriaDois];
        String palavraTres = listaTres[memoriaTres];


        String frase = palavraUm + " " + palavraDois + " " + palavraTres; // monta a frase 


        System.out.println(frase);
    }
}