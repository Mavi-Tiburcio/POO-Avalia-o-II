import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Config {
    private static Config instancia;
    private Map<String, String> dadosConfig;

    // Construtor privado para impedir a criação de novas instâncias
    private Config() {
        dadosConfig = new HashMap<>();
        carregarDadosConfig();
    }

    // Método estático para obter a única instância da classe
    public static Config getInstancia() {
        if (instancia == null) {
            synchronized (Config.class) {
                if (instancia == null) {
                    instancia = new Config();
                }
            }
        }
        return instancia;
    }

    // Método para carregar os dados do arquivo de configuração
    private void carregarDadosConfig() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Q1config.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    String[] partes = linha.split("=", 2);
                    if (partes.length == 2) {
                        dadosConfig.put(partes[0].trim(), partes[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obter o valor de uma chave específica
    public String getValor(String chave) {
        return dadosConfig.get(chave);
    }

    // Método para imprimir todos os dados do arquivo de configuração
    public void imprimirDadosConfig() {
        for (Map.Entry<String, String> entrada : dadosConfig.entrySet()) {
            System.out.println(entrada.getKey() + "=" + entrada.getValue());
        }
    }
}
