package cat;
import java.util.Random;
import java.util.Scanner;
import cat.Kitty;
import cat.Mouse;

//Хар-ки КОТА - имя, скорость, вес, пойманные мыши
//поедание МЫШИ увеличивает вес - уменьшает скорость
//Хар-ки МЫШИ - скорость
//максимум 10 мышей
//Ловит мышь если скорость КОТА больше МЫШИ
//КОТ может напасть на другого КОТА, если он больше по весу - забирает мышей.
//Но, если мыши быстрее - убегают (У ПОЙМАННЫХ МЫШЕЙ СКОРОСТЬ МЕНЬШЕ)
public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Назовите вашего кота: ");
        String name = scan.next();
        Kitty cat1 = new Kitty(name);

        System.out.println("ИМЯ: " + cat1.getName() + "\nВЕС: " + cat1.getWeight() + "\nСКОРОСТЬ: " + cat1.getSpeed() + "\nПОЙМАННЫЕ МЫШИ: " + cat1.getCapturedmice());

        Mouse ms1 = new Mouse();
        ms1.getMouseSpeedRand();
//      while(cat1.getWeight() >= 100) { System.out.println("\n![ вы стали МАКСИМАЛЬНО ОГРОМНЫМ ОТКОРМЛЕННЫМ КОТОМ ]!"); System.exit(0); }
    }
}
