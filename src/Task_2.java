/**
 * Created by Петр on 21.03.2017.
 */

import java.util.Random;

import static java.lang.Integer.MIN_VALUE;

public class Task_2 {
    public static void main(String[] args) {
        int max=MIN_VALUE; //минимальный инт
        int[][] n=new int[5][8];
        Random r= new Random();

        for (int i=0;i<5;i++){
            for (int j=0;j<8;j++) {
//                n[i][j]=r.nextInt(198)-99;
                //присваивание значения элементу и сразу нахождение max
                if((n[i][j]=r.nextInt(198)-99)>max) max=n[i][j];
                //форматный вывод для удабства
                System.out.printf("%4d ",n[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMax = "+max);

    }
}