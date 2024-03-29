package compound_pattern;

public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;
    
    public HeartController(HeartModelInterface model) {
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }
    
    @Override
    public void start() {}

    @Override
    public void stop() {}

    @Override
    public void setBPM(int bpm) {}

    @Override
    public void increaseBPM() {}

    @Override
    public void decreaseBPM() {}

}
