import java.util.Random;

/**
 * Created by Петр on 21.03.2017.
 */
public class Task_1 {
    public static void main(String[] args) {
        Random r = new Random();
        //массив 5 столбцов, 8 строк
        int[][] n = new int[8][5];
        //обход по строкам
        for (int i=0;i<8;i++) {
            //обзод по столбцам
            for (int j=0;j<5;j++) {
                //случайное значение элемента
                n[i][j] = r.nextInt(89) + 10;
                //вывод
                System.out.print(n[i][j]+" ");
            }
            //новая строка
            System.out.println();
        }
    }
}
