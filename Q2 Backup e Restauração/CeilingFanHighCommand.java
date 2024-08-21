public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }

    @Override
    public String store() {
        return "CeilingFanHighCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
