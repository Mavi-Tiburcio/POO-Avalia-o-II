public class Main {
    public static void main(String[] args) {
        // Cria um produto para testar
        Produto produto = new Produto(1, "Laptop");

        // Usa a Facade para processar o pedido
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.processOrder(produto);
    }
}
