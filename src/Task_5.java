import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Петр on 22.03.2017.
 */
public class Task_5 {

    public static void main(String[] args) {
        Employees employees = new Employees();
        Vector<Employee> emp = new Vector<Employee>();

        //значения по умолчанию
        emp.add(new Employee("aa","aa","aah","8"));
        emp.add(new Employee("bb","bb","aaj","5"));
        emp.add(new Employee("cc","cc","aah","3"));
        emp.add(new Employee("dd","dd","aah","7"));
        emp.add(new Employee("ee","ee","aaj","2"));
        emp.add(new Employee("ff","ff","asd","4"));
        emp.add(new Employee("gg","gg","rrf","0"));
        emp.add(new Employee("hh","hh","asd","7"));
        emp.add(new Employee("ii","ii","asd","0"));
        employees.Fill(emp);

        Scanner s = new Scanner(System.in);


        System.out.println("Начальные условия: ");
        employees.Out();

        //возможность добавления новых сотрудников
        System.out.print("Желаете добавить работников? Y/N = ");
        switch (s.next()) {
            case "y":
            case "Y": {employees.Enter();break;}

            case "n":
            case "N":{System.out.println("Новые работники не будет добавлены"); break;}

            default: System.out.println("Новые работники не будет добавлены");
        }

        System.out.println("Измененные начальные условия: ");
        employees.Out();

        //вызов поиска
        employees.SearchPos("asd");

        //вызов сортировки
        employees.Sort();

    }
}
