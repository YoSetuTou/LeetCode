package code;

import java.util.Arrays;
import java.util.Random;

public class DoubleColorBall {
    public static void main(String[] args) {

        int howMuch = 1; //选1组

        System.out.println("红球\t\t\t蓝球");

        for(int i = 0; i < howMuch; i++) {
            String numbers = getNum(); // 获取号码
            System.out.println(numbers);
        }
    }
    public static String getNum(){
        int[] exist = new int[6];
        for (int i = 0; i < exist.length; i++) {
            int ball = getBall(33,exist);
            exist[i] = ball;
        }
        Arrays.sort(exist);
        int redBall = getBall(16,null);
        String numbers = "";
        for (int i = 0; i < exist.length; i++) {
            // 如果 exist[i] 小于 0，则输出 0+exist[i] 的值，否则直接输出 exist[i] 的值
            String num = exist[i] < 10 ? "0" + exist[i] : "" + exist[i];
            if (i == 0) {
                numbers = numbers + num;
            }else {
                numbers = numbers + ("," + num);
            }
        }
        // 先输出红球好吗，然后输出一个制表符，然后输出篮球号码
        numbers = numbers + "\t" + (redBall < 10 ? "0" + redBall : ""+ redBall);
        return numbers;
    }
    public static boolean testBall(int[] array,int value ){
        boolean hava = false;
        if(array == null){
            return  false;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                hava =  true;
                break;
            }
        }
        return hava;
    }

    private  static   int getBall(int total ,int[] exist){
        Random random = new Random();
        int ball = random.nextInt(total)+1;
        while (true){
            if(testBall(exist,ball)){
                ball = random.nextInt(total)+1;
            }else {
                break;
            }
        }
        return ball;
    }
}
