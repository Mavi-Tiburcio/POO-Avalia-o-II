public class SoundOnCommand implements Command {
    private Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void undo() {
        sound.off();
    }

    @Override
    public String store() {
        return "SoundOnCommand";
    }

    @Override
    public void load(String commandData) {
        // Nenhum dado específico para carregar
    }
}
