package lecture05;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect insect = new Insect();
        Butterfly butterfly = new Butterfly();
        Locust locust = new Locust();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();

        Insect[] List = new Insect[4];

        List[0] = insect;
        List[1] = butterfly;
        List[2] = locust;
        List[3] = swallowtailButterfly;

        for(Insect insect1 : List){
            insect1.move();
        }

    }
}
