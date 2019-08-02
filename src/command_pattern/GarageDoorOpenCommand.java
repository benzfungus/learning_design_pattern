package command_pattern;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;
    
    public GarageDoorOpenCommand(GarageDoor gargaeDoor) {
        this.garageDoor = gargaeDoor;
    }
    
    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
    }

}
