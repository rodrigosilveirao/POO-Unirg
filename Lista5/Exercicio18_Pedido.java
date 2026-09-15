public class Exercicio18_Pedido {

    static class Pedido {
        private String cliente;
        private double valorTotal;
        private boolean pago;
        private boolean entregue;
        private double desconto;

        private static final double TAXA_ENTREGA = 5.0;
        private static final double VALOR_ENTREGA_GRATIS = 100.0;

        public Pedido(String cliente) {
            this.cliente = cliente;
        }

        public String getCliente() { return cliente; }
        public boolean isPago() { return pago; }
        public boolean isEntregue() { return entregue; }

        public void adicionarItem(String nome, double preco, int qtd) {
            valorTotal += preco * qtd;
            System.out.println(qtd + "x " + nome + " adicionado, subtotal: " + valorTotal);
        }

        public void aplicarDesconto(double percentual) {
            this.desconto = percentual;
        }

        public double calcularTaxaEntrega() {
            return valorTotal >= VALOR_ENTREGA_GRATIS ? 0.0 : TAXA_ENTREGA;
        }

        public double calcularValorFinal() {
            return valorTotal * (1 - desconto) + calcularTaxaEntrega();
        }

        public boolean podeSerEntregue() {
            return valorTotal > 0 && pago && !entregue;
        }

        public void marcarComoPago() {
            pago = true;
        }

        public void entregar() {
            if (!podeSerEntregue()) {
                throw new IllegalStateException("pedido nao pode ser entregue ainda");
            }
            entregue = true;
        }

        public void statusEntrega() {
            System.out.println(entregue ? "pedido entregue" : "ainda nao entregue");
        }
    }

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Carlos");

        pedido.adicionarItem("Pizza Grande", 45.0, 1);
        pedido.adicionarItem("Refrigerante", 8.0, 2);

        pedido.aplicarDesconto(0.10);

        System.out.println("taxa de entrega: " + pedido.calcularTaxaEntrega());
        System.out.println("valor final: " + pedido.calcularValorFinal());
        System.out.println("pode entregar antes de pagar? " + pedido.podeSerEntregue());

        pedido.marcarComoPago();
        System.out.println("pode entregar depois de pagar? " + pedido.podeSerEntregue());

        pedido.entregar();
        pedido.statusEntrega();
    }
}
