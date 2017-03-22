/**
 * Created by Петр on 21.03.2017.
 */
public class Employee {
    private String name,family,position,salary;

    Employee(String n, String f, String p, String s) {
        name=n;
        family=f;
        position=p;
        salary=s;
    }

    Employee() {
        name="";
        family="";
        position="";
        salary="";
    }

    public String Name() {
        return name;
    }

    public String Family() {
        return family;
    }

    public String Position() {
        return position;
    }

    public String Salary() {
        return salary;
    }

    public String[] Empl() {
        String[] s={name,family,position,salary};
        return s;
    }

    //устанавливает все аттрибуты
    public void set(String n, String f, String p, String s) {
        name=n;
        family=f;
        position=p;
        salary=s;
    }

    //устанавливает отдельный аттрибут
    public boolean set(String element, String value) {
        switch (element) {

            case "Family":{ family=value; return true; }
            case "Name":{ name=value; return true; }
            case "Position":{ position=value; return true; }
            case "Salary":{ salary=value; return true; }

            default: return false;
        }
    }

}
