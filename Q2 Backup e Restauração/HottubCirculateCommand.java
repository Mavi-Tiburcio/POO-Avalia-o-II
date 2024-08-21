public class HottubCirculateCommand implements Command {
    private Hottub hottub;

    public HottubCirculateCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }

    @Override
    public String store() {
        return "HottubCirculateCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
