package lecture06;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            double A = input.nextDouble();
            System.out.println("入力した値：" + A);
        }catch (InputMismatchException e){
            System.out.println("エラー");
        }

    }
}
