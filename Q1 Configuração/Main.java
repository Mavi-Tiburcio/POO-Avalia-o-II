public class Main {
    public static void main(String[] args) {
        // Obtém a única instância da classe Configuracao
        Config config = Config.getInstancia();

        // Imprime todos os dados do arquivo de configuração
        config.imprimirDadosConfig();
        
        // Exemplo de como acessar um valor específico
        String appId = config.getValor("AppId");
        System.out.println("AppId: " + appId);
    }
}
