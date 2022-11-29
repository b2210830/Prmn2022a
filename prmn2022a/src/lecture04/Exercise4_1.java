package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {

        Fighter f1 = new Fighter(1500,100,"Fighter1");
        Fighter f2 = new Fighter(900,150,"Fighter2");



        while (f1.isAlive()){
            f1.attack(f2);
        }



    }
}
