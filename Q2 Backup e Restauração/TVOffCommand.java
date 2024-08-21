public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }

    @Override
    public String store() {
        return "TVOffCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
