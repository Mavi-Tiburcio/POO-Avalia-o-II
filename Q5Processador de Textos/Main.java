public class Main {
    public static void main(String[] args) {
        ProcessadorTexto maiuscula = new TudoMaiuscula();
        ProcessadorTexto minuscula = new TudoMinuscula();

        String texto = "ExEmPlO De TeXtO MiStO";

        String resultadoMaiuscula = maiuscula.converterTexto(texto);
        String resultadoMinuscula = minuscula.converterTexto(texto);

        System.out.println("Texto Original: " + texto);
        System.out.println("Texto em Maiúsculas: " + resultadoMaiuscula);
        System.out.println("Texto em Minúsculas: " + resultadoMinuscula);
    }
}
