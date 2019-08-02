package command_pattern;

public class LightOnCommand implements Command {
    Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    
    @Override
    public void execute() {
        light.on();
    }


    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
    }

}
