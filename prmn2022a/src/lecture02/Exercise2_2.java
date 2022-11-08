package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Tire[] tire = new Tire[4];
        Engine engine = new Engine(4000);

        Car car = new Car((Tire[]) tire,(Engine) engine);
        GasStation gasStation = new GasStation();

        car.run();
        gasStation.refuel((Car) car);
        car.run();

    }
}
