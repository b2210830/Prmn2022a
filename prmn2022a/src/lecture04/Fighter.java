package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.hitPoint -= power;
        System.out.println(name+"は"+enemy.name+"に"+power+"ダメージを与えた");
        System.out.println(enemy.name+"の残りhitPoint:"+enemy.hitPoint);
    }

    public boolean isAlive() {
        return hitPoint >= 0;
    }


    public int getHitPoint(){
        return hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public String getName(){
        return name;
    }


}


