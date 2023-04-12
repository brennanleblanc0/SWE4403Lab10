package ca.brennanleblanc.SWE4403Lab10.E02;

public abstract class TravelMode {
    protected DirectionService context;

    public void setContext(DirectionService context) {
        this.context = context;
    }

    public abstract Object getEta();
    public abstract Object getDirection();
}