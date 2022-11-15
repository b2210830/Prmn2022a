package lecture03;

import java.util.Scanner;

public class Exercise3_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] sentence = new String[2];
        int[] num = new int[2];

        for(int i=0;i<2;i++) {
            System.out.println((i+1) + "つ目の整数を入力してください：");
            sentence[i] = input.nextLine();
            num[i] = Integer.parseInt(sentence[i]);
        }
        System.out.println(num[0] +"+"+ num[1] +"="+ (num[0]+num[1]) );


    }
}
