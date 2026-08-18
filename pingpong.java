public class pingpong {

    public static void main(String[] args) {

        int numero = 1; 

        while (numero <= 30) { // enquanto numero nao chegar em 30 

            boolean multiploDeTres = (numero % 3 == 0); //verifico se é multiplo de 3
            boolean multiploDeCinco = (numero % 5 == 0); //verifico se é multiplo de 5

            if (multiploDeTres && multiploDeCinco) { // se for multiplo de 3 e 5 ao mesmo tempo, printa PING PONG
                System.out.println("PING PONG");
            } else if (multiploDeTres) { // se for multiplo de 3 printa PING
                System.out.println("PING");
            } else if (multiploDeCinco) { // se for multiplo de 5 printa PONG
                System.out.println("PONG");
            } else {
                System.out.println(numero);
            }

            numero++; // numero recebe +1 ate chegar em 30 e parar o loop
        }
    }
}

// fazemos aqui o famoso AND no comeco para duas opcoes que devem ser verdadeiramente iguais as outras so verificar se é true or false