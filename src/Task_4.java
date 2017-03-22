import java.util.Formatter;
import java.util.Random;

/**
 * Created by Петр on 21.03.2017.
 */
public class Task_4 {

    private String id= new String();

    Task_4(int f) {
        String chars1="АВЕКМНОРСТXУ";
        Random r = new Random();
        switch (f) {
            case 2: {
                id=String.format("%s %03d %s%s %02d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //не стал заморачиваться с существующими регионами,
                        //потому что там очень много исключений/правил.
                        //посему, любое двузначное число - регион
                        r.nextInt(99));
                break;
            }
            case 3: {
                id=String.format("%s %03d %s%s %03d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //тут 3х значный регион, так же не заморачиваясь
                        r.nextInt(999));
                break;
            }
            //по умолчанию с 3х значным регионом
            default:{
                id=String.format("%s %03d %s%s %03d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //тут 3х значный регион, так же не заморачиваясь
                        r.nextInt(999));
                break;
            }
        }
    }

    //конструктор по умолчанию создает 3х значный регион
    Task_4() {
        String chars1="АВЕКМНОРСТXУ";
        Random r = new Random();
//        Formatter form = new Formatter();

        id = String.format("%s %03d %s%s %03d",
                chars1.charAt(r.nextInt(chars1.length())),
                r.nextInt(999),
                chars1.charAt(r.nextInt(chars1.length())),
                chars1.charAt(r.nextInt(chars1.length())),
                //тут 3х значный регион
                r.nextInt(999));
    }


    //возвращает хранящийся номер
    public String getId() {
        return id;
    }

    //генерирует новый номер (перегружена - с параметром и нет)
    public String GenerateNew(int f) {
        String chars1="АВЕКМНОРСТXУ";
        Random r = new Random();
        switch (f) {
            case 2: {
                id=String.format("%s %03d %s%s %02d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //не стал заморачиваться с существующими регионами,
                        //потому что там очень много исключений/правил.
                        //посему, любое двузначное число - регион
                        r.nextInt(99));
                break;
            }
            case 3: {
                id=String.format("%s %03d %s%s %03d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //тут 3х значный регион, так же не заморачиваясь
                        r.nextInt(999));
                break;
            }
            //по умолчанию с 3х значным регионом
            default:{
                id=String.format("%s %03d %s%s %03d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //тут 3х значный регион, так же не заморачиваясь
                        r.nextInt(999));
                break;
            }
        }

        return id;
    }

    //генерирует номер без параметра
    public String GenerateNew() {
        String chars1="АВЕКМНОРСТXУ";
        Random r = new Random();
        id=String.format("%s %03d %s%s %03d",
                        chars1.charAt(r.nextInt(chars1.length())),
                        r.nextInt(999),
                        chars1.charAt(r.nextInt(chars1.length())),
                        chars1.charAt(r.nextInt(chars1.length())),
                        //тут 3х значный регион, так же не заморачиваясь
                        r.nextInt(999));

        return id;
    }
}
