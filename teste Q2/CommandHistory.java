import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<String> history = new ArrayList<>();

    public void store(Command command) {
        history.add(command.store());
    }

    public List<Command> load(List<Command> availableCommands) {
        List<Command> loadedCommands = new ArrayList<>();
        for (String commandData : history) {
            for (Command command : availableCommands) {
                if (command.store().equals(commandData)) {
                    command.load(commandData);
                    loadedCommands.add(command);
                    break;
                }
            }
        }
        return loadedCommands;
    }
}
