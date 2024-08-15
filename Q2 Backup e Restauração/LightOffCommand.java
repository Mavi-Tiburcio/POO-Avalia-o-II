import java.io.FileWriter;
import java.io.IOException;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void store() throws IOException {
        try (FileWriter writer = new FileWriter("commands.txt", true)) {
            writer.write("LightOffCommand\n");
        }
    }

    @Override
    public void load() {
        execute();
    }
}
