import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        CommandHistory history = new CommandHistory();

        // Executa o comando e o armazena no histórico
        lightOn.execute();
        history.store(lightOn);

        lightOff.execute();
        history.store(lightOff);

        // Simula uma pane elétrica e recuperação
        System.out.println("\nSimulando recuperação após pane elétrica...");
        history.load();
    }
}
