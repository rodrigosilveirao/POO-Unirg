public class Exercicio07e08_Referencias {

    static class Casa {
        String proprietario;
        Casa(String proprietario) { this.proprietario = proprietario; }
    }

    public static void main(String[] args) {
        Casa c1 = new Casa("Ana");
        Casa c2 = new Casa("Bruno");
        Casa c3 = new Casa("Carlos");
        Casa c4 = new Casa("Daniel");
        Casa c5 = new Casa("Eduarda");

        c2 = c1;
        c4 = null;
        c5 = c3;
        c1 = c5;
        c3 = c2;

        System.out.println("c1 -> " + (c1 == null ? "null" : c1.proprietario));
        System.out.println("c2 -> " + (c2 == null ? "null" : c2.proprietario));
        System.out.println("c3 -> " + (c3 == null ? "null" : c3.proprietario));
        System.out.println("c4 -> " + (c4 == null ? "null" : c4.proprietario));
        System.out.println("c5 -> " + (c5 == null ? "null" : c5.proprietario));
    }
}

/*
EXERCICIO 7

a) c1 -> objeto C (Carlos)
   c2 -> objeto A (Ana)
   c3 -> objeto A (Ana), porque c3=c2 e c2 ja era o objeto A
   c4 -> null
   c5 -> objeto C (Carlos)

b) objeto A tem duas referencias (c2 e c3). objeto C tambem tem duas (c1 e c5).

c) sim, objeto B (Bruno) e objeto D (Daniel) ficaram sem nenhuma
   referencia apontando pra eles. Viram lixo pro garbage collector.

d) null quer dizer que a referencia nao aponta pra nenhum objeto.

e) c4 é quem esta em null.

EXERCICIO 8 (mesmo codigo)

b)
i.   V - c2=c1 faz os dois apontarem pro mesmo objeto
ii.  F - c4=null nao destroi nada na hora, so tira a referencia. o
         objeto so vira "lixo" se ninguem mais apontar pra ele
iii. V
iv.  F - c1=c5 copia a referencia, nao o objeto
v.   V

c) depois de c2 = c4; c4 = c3;
   antes disso: c2->A, c4->null, c3->A
   i)  c2 aponta pra null
   ii) c4 aponta pro objeto A (mesmo que c3)
   iii) c3 e c4 apontam pro mesmo objeto agora (A). c1 e c5 continuam
        juntos apontando pro objeto C.

d) continuando do estado: c1->C, c2->null, c3->A, c4->A, c5->C
   depois de:
     c1 = c2;  -> c1 vira null
     c2 = c3;  -> c2 vira A
     c3 = c4;  -> c3 vira A
     c4 = c5;  -> c4 vira C
     c5 = null;-> c5 vira null

   se agora fizer c1 = c3:
   - a referencia alterada é c1
   - c1 passa a apontar pro objeto A (mesmo que c3)
   - c3 nao muda, continua apontando pra A
   - nao sobra nenhum objeto sem referencia nessa jogada, porque c1
     ja estava null (nao tava "segurando" nenhum objeto antes)
*/
