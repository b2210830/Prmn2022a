package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engines;

    Car(Tire[] tires, Engine engines){
        this.fuel = 0;
        this.tires = tires;
        this.engines = engines;
    }


    void run(){
        if(fuel <=0 ){
            System.out.println("燃料がないので走れませんでした。");
        }else{
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        Engine engine = new Engine(engines.rpm);
        engine.start();
    }



}
