package lecture01;

public class lecture1_5 {
    public static void main(String[] args) {

        int[] score = {41, 85, 72, 38, 80};

        for(int i=0;i<5;i++) {
            if (score[i] >= 90) {
                System.out.println(i + "番　" + score[i] + "点" + "　秀");
            } else if (score[i] >= 80) {
                System.out.println(i + "番　" + score[i] + "点" + "　優");
            } else if (score[i] >= 70) {
                System.out.println(i + "番　" + score[i] + "点" + "　良");
            } else if (score[i] >= 60) {
                System.out.println(i + "番　" + score[i] + "点" + "　可");
            }else {
                System.out.println(i + "番　" + score[i] + "点" + "　不可");
            }
        }
        System.out.println("・・・・・");

        System.out.println("最高点：" + max(score) + "点");
        System.out.println("最低点：" + min(score) + "点");
        System.out.println("平均点：" + average(score) + "点");

        System.out.println("・・・・・");

    }


    static int min(int[] score) {
        int min = 100;
        for (int i = 0; i < 5; i++) {

            if (score[i] < min) {
                min = score[i];
            } else {
            }
        }
        return min;
    }
    static int max(int[] score) {
        int max = 0;
        for (int i = 0; i < 5; i++) {

            if (score[i] > max) {
                max = score[i];
            } else {
            }
        }
        return max;
    }


    static double average(int[] score) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = score[i] +sum ;
            }
        double ave = (double) sum / (double) score.length;
        return  ave;

    }
}