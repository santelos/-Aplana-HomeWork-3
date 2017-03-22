/**
 * Created by Петр on 21.03.2017.
 */

public class MainClass_forTask4 {
    public static void main(String[] args) {
        Task_4 id1 = new Task_4();
        System.out.println("Трехзначный из конструктора: "+id1.getId()); // Трехзначный из конструктора
        System.out.println("Трехзначный из генератора:   "+id1.GenerateNew()); //Трехзначный из генератора
        System.out.println("Двухзначный из генератора:   "+id1.GenerateNew(2)); //Двухзначный из генератора
        System.out.println("Трехзначный из генератора:   "+id1.GenerateNew(3)); //Трехзначный из генератора

        Task_4 id2 = new Task_4(2); //Двухзначный из конструктора
        System.out.println("Двухзначный из конструктора: "+id2.getId());

    }
}
