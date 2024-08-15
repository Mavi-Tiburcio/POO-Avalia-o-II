import java.io.IOException;

public interface Command {
    void execute();
    void store() throws IOException;
    void load() throws IOException;
}
