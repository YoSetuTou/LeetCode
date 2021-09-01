package code;

import java.util.Arrays;
import java.util.Scanner;

public class JingJuge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        boolean gotResult = false;
        int numofx = 0;
        int numofo = 0;
        //键入井字棋
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        //判断行
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    numofo++;
                } else {
                    numofx++;
                }
            }
            if (numofo == 3 || numofx == 3) {
                gotResult = true;
                break;
            } else {
                numofx = 0;
                numofo = 0;
            }
        }

        //判断列
        if(!gotResult) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 1) {
                        numofo++;
                    } else {
                        numofx++;
                    }
                }
                if (numofo == 3 || numofx == 3) {
                    gotResult = true;
                    break;
                } else {
                    numofx = 0;
                    numofo = 0;
                }
            }
        }
        //正对角线
        if(!gotResult){
            for (int i = 0; i < board.length; i++) {
                if(board[i][i] == 1){
                    numofo++;
                }else {
                    numofx++;
                }
                if (numofo == 3 || numofx ==3){
                    gotResult = true;
                    break;
                }else{
                    numofx =0;
                    numofo =0;
                }
            }
        }
        //反对角线
        if(!gotResult){
            for (int i = 0; i < board.length; i++) {
                if(board[i][3-i-1] == 1){
                    numofo++;
                }else {
                    numofx++;
                }
                if (numofo == 3 || numofx ==3){
                    gotResult = true;
                    break;
                }else{
                    numofx =0;
                    numofo =0;
                }
            }
        }
        //输出结果
        if(gotResult){
            if(numofo == 3){
                System.out.println("1");
            }else if (numofx == 3){
                System.out.println("0");
            }
        }else {
            System.out.println("NTL");
        }
    }

}
