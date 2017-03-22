import java.util.Random;

/**
 * Created by Петр on 21.03.2017.
 */
public class Task_3 {
    public static void main(String[] args) {
        int[] n=new int[20];
        Random r= new Random();

        System.out.println("Старый массив:");
        for (int i=0;i<n.length;i++){
            n[i]=r.nextInt(50);
            System.out.printf("%2d ",n[i]);
        }

        System.out.println("\nНовый Массив:");

        int t;
        for (int i=0;i<n.length;i++){
            if (i<n.length/2){
                t=n[i];
                n[i]=n[n.length-i-1];
                n[n.length-i-1]=t;
            }
            System.out.printf("%2d ",n[i]);
        }
    }
}
