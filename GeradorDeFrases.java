import java.util.Random;

public class GeradorDeFrases {

    public static void main(String[] args) {
        String[] listaUm = {"agnostic", "opinionated", "voice activated", "highly driven"};
        String[] listaDois = {"loosely coupled", "six sigma", "asynchronous", "event driven"};
        String[] listaTres = {"framework", "library", "repository", "pipeline"};

        Random random = new Random();


        int tamanhoUm = listaUm.length;
        int tamanhoDois = listaDois.length;
        int tamanhoTres = listaTres.length;


        int memoriaUm = random.nextInt(tamanhoUm);
        int memoriaDois = random.nextInt(tamanhoDois);
        int memoriaTres = random.nextInt(tamanhoTres);


        String palavraUm = listaUm[memoriaUm];
        String palavraDois = listaDois[memoriaDois];
        String palavraTres = listaTres[memoriaTres];


        String frase = palavraUm + " " + palavraDois + " " + palavraTres;


        System.out.println(frase);
    }
}