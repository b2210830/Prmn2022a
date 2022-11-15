package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {

    public static void main(String[] args) {

        System.out.println("何行分入力しますか？");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] ArrayList = new String[n];

        for (int i = 0; i < ArrayList.length; i++) {
            System.out.println((i + 1) + "行目：");
            ArrayList[i] = input.next();
        }

        System.out.println("入力した文字列：");

        int num = 0;

        for (String arrayList : ArrayList) {
            System.out.println("["+num+"]"+arrayList);
            num++;
        }

    }
}
