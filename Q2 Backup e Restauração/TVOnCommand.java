public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

    @Override
    public String store() {
        return "TVOnCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
