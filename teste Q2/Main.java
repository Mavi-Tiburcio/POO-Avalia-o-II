import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Sala de Estar");
        TV livingRoomTV = new TV();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Sound soundSystem = new Sound();
        Hottub hottub = new Hottub();
        SecurityControl securityControl = new SecurityControl();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command tvOn = new TVOnCommand(livingRoomTV);
        Command tvOff = new TVOffCommand(livingRoomTV);
        Command fanHigh = new CeilingFanHighCommand(ceilingFan);
        Command garageUp = new GarageDoorUpCommand(garageDoor);
        Command soundOn = new SoundOnCommand(soundSystem);
        Command hottubCirculate = new HottubCirculateCommand(hottub);
        Command securityArm = new SecurityArmCommand(securityControl);

        CommandHistory history = new CommandHistory();

        // Exemplo de execução de comandos
        lightOn.execute();
        history.store(lightOn);

        tvOn.execute();
        history.store(tvOn);

        fanHigh.execute();
        history.store(fanHigh);

        garageUp.execute();
        history.store(garageUp);

        soundOn.execute();
        history.store(soundOn);

        hottubCirculate.execute();
        history.store(hottubCirculate);

        securityArm.execute();
        history.store(securityArm);

         // Simulação de queda e retorno de energia
        System.out.println("\n--- Faltou energia! ---\n");

        // Tempo para simular a queda de energia
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- A energia voltou! Reativando os dispositivos... ---\n");

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Carregar e reexecutar comandos
        for (Command command : history.load(Arrays.asList(lightOn, lightOff, tvOn, tvOff, fanHigh, garageUp, soundOn, hottubCirculate, securityArm))) {
            command.execute();
        }
    }
}
