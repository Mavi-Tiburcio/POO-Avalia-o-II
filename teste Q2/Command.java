public interface Command {
    void execute();
    void undo();
    String store();
    void load(String commandData);
}
