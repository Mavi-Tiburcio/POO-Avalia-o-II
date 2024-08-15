import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<Command> history = new ArrayList<>();

    public void store(Command command) throws IOException {
        command.store();
        history.add(command);
    }

    public void load() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("commands.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Command command = createCommand(line);
                if (command != null) {
                    command.load();
                }
            }
        }
    }

    private Command createCommand(String commandName) {
        Light light = new Light();  // Nova instância de Light para cada comando
        if (commandName.equals("LightOnCommand")) {
            return new LightOnCommand(light);
        } else if (commandName.equals("LightOffCommand")) {
            return new LightOffCommand(light);
        }
        return null;
    }
}
