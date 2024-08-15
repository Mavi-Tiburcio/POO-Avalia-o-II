public class OrderFacade {
    private ServicoEstoque servicoEstoque;
    private ServicoPagamento servicoPagamento;
    private ServicoRemessa servicoRemessa;

    public OrderFacade() {
        this.servicoEstoque = new ServicoEstoque();
        this.servicoPagamento = new ServicoPagamento();
        this.servicoRemessa = new ServicoRemessa();
    }

    public void processOrder(Produto product) {
        if (ServicoEstoque.isAvailable(product)) {
            System.out.println("Produto disponível: " + product.name);
            if (ServicoPagamento.makePayment()) {
                System.out.println("Pagamento aprovado para o produto: " + product.name);
                ServicoRemessa.shipProduct(product);
                System.out.println("Pedido processado com sucesso!");
            }
        } else {
            System.out.println("Produto não disponível: " + product.name);
        }
    }
}
