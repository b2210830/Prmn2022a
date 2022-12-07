package lecture06;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(5)+1);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("何番目のさいころの値を確認しますか？");

        try {
            int index = input.nextInt();
            System.out.println(list.get(index));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました");
            System.out.println("プログラムを終了します");
        }
        catch (InputMismatchException e){       //課題3
            System.out.println("整数以外の値が入力されました");
            System.out.println("プログラムを終了します");
        }

    }
}
