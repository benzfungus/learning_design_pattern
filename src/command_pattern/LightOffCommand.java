package command_pattern;

public class LightOffCommand implements Command {
    Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    
    @Override
    public void execute() {
        light.off();
    }


    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
    }

}
