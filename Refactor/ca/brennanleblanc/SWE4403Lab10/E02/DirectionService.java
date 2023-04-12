package ca.brennanleblanc.SWE4403Lab10.E02;

public class DirectionService {
    private TravelMode state;

    public DirectionService(TravelMode state) {
        this.state = state;
    }

    public void changeState(TravelMode state) {
        this.state = state;
    }
    
    public Object getEta() {
        return state.getEta();
    }

    public Object getDirection() {
        return state.getDirection();
    }
}   
