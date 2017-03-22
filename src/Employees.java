import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Петр on 22.03.2017.
 */
public class Employees {
    private Vector<Employee> storage = new Vector<Employee>();

    Employees(Employee[] s) {
        for (int i=0;i<s.length;i++) {
            storage.add(s[i]);
        }
    }

    Employees() {}

    //Добавляет элемент в хранилище
    public void addEmp(Employee s) {
        storage.addElement(s);
    }

    //возвращает хранилище
    public Vector all() {
        return storage;
    }

    //очищает хранилище
    public void Clean() {
        storage.removeAllElements();
    }

    //заполняте хранилище введенным вектором
    public void Fill (Vector<Employee> emp) {
        for (int i=0;i<emp.size();i++) {
            storage.add(emp.get(i));
        }
    }

    //заполняет хранилище введенным массивом
    public void Fill (Employee[] emp) {
        for (int i=0;i<emp.length;i++) {
            storage.add(emp[i]);
        }
    }

    //воод с клавиатуры
    public void Enter() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите Имя, Фамилию, Должность, Зарплату\nОкончание ввода - \"0\" в имени\n");

        while(true) {
            Employee emp = new Employee();

            System.out.print("Имя: ");
            String ifEsc = new String(scan.next());
            if (ifEsc.equals("0")){System.out.println(); break;}
            emp.set("Name", ifEsc);
            System.out.print("Фамилия: ");
            emp.set("Family", scan.next());
            System.out.print("Должность: ");
            emp.set("Position", scan.next());
            System.out.print("Зарплата: ");
            emp.set("Salary", scan.next());

            addEmp(emp);

        }
    }

    //вывод хранилища
    public void Out() {
        for(int i=0;i<storage.size();i++)
        {
            Employee emp = storage.get(i);
            System.out.println(i+": "+emp.Name()+" "+emp.Family()+" "+ emp.Position()+" "+emp.Salary());
        }
        System.out.println();
    }

    //поиск по ключевому слову
    public Vector<Employee> SearchPos(String position) {
        Vector<Employee> founded = new Vector<Employee>();

        System.out.println("Найденные рабочие по должности: "+position);
        for (int i=0;i<storage.size();i++) {
            //если должность совпадает с критерием
            if (storage.get(i).Position().equals(position)) {
                //то добавляем в вектор found и выводим на экран
                founded.add(storage.get(i));
                System.out.println(i+": "+storage.get(i).Name()+" "
                                  +storage.get(i).Family()+" "
                                  +storage.get(i).Position()+" "
                                  +storage.get(i).Salary());
            }
        }
        if (founded.isEmpty()) System.out.println("Ничего не найдено\n");
        else System.out.println();
        return founded;
    }

    //сортировка (пузырек)
    public Vector<Employee> Sort() {
        Employee[] emp = new Employee[storage.size()];
        System.arraycopy(storage.toArray(),0,emp,0,storage.size());

        boolean cng;
        do {
            cng = false;
            for (int i=0;i<emp.length-1;i++) {
                //сортировка по должности
                if (emp[i].Position().compareTo(emp[i+1].Position())>0) {
                    Employee c = emp[i];
                    emp[i] = emp[i+1];
                    emp[i+1] = c;
                    cng = true;
                    //сортировка по зарплате внутри должности
                }else if (emp[i].Position().compareTo(emp[i+1].Position())==0 &&
                          emp[i].Salary().compareTo(emp[i+1].Salary())<0) {
                        Employee c = emp[i];
                        emp[i] = emp[i+1];
                        emp[i+1] = c;
                        cng = true;
                    }
            }

        } while (cng);
        Clean();
        Fill(emp);
        System.out.println("Сортировка: ");
        Out();
        return storage;
    }

}
