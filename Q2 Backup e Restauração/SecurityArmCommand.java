public class SecurityArmCommand implements Command {
    private SecurityControl securityControl;

    public SecurityArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void undo() {
        securityControl.disarm();
    }

    @Override
    public String store() {
        return "SecurityArmCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
