package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print () {
        if(age<=18) {
            System.out.println("生徒:" + name + age + "歳です。");
        }else if(age<=20){
            System.out.println("学生:" + name + age + "歳です。");
        }else{
            return;
        }
    }

}
