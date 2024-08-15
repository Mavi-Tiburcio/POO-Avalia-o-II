import java.io.FileWriter;
import java.io.IOException;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void store() throws IOException {
        try (FileWriter writer = new FileWriter("commands.txt", true)) {
            writer.write("LightOnCommand\n");
        }
    }

    @Override
    public void load() {
        execute();
    }
}
