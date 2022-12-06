package lecture06;

import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            double A = input.nextDouble();
            System.out.println("入力した値：" + A);
        }catch (Exception exception){
            System.out.println("エラー");
        }

    }
}
