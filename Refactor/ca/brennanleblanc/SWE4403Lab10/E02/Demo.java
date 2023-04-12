package ca.brennanleblanc.SWE4403Lab10.E02;

public class Demo {
    public static void main(String[] args) {
        TravelMode state = new Driving();
        DirectionService context = new DirectionService(state);
        state.setContext(context);

        context.getEta();
        context.getDirection();

        state = new Walking();
        state.setContext(context);
        context.changeState(state);

        context.getEta();
        context.getDirection();
    }
}
