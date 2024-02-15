package king;
import java.util.Random;
import java.util.Scanner;

//    Реализовать классы с полями, конструкторами и методами.
//    Создать класс Play с точкой входа, где будут создаваться объекты и пример игрового процесса.

//Король - 100 хп / 30 голды по умолчанию
//Рыцарь - 35 хп 20 дмг / 30 цена
//Пехотинец - 15 хп 10 дмг / 10 цена

//Пипи1 - 1 хп 5 дмг / 0 голды
//Пипи2 - 15 хп 10 дмг / 50 голды
//Пипи3 - 20 хп 50 дмг / 100 голды

class King {
    public static int kinghp = 1;
    public static int kinggold = 30;

    public King(int kinghp, int kinggold) {
    }
}

public class hw3_king {
    public static void main(String[] args)
    {
        Random gp = new Random();
        int number = gp.nextInt(8) + 1;
        if (number == 2) {  System.out.println("Вас настигла Божья кара..."); System.exit(0); }

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                    1 - Стат. КОРОЛЯ
                    2 - Стат. ОППОНЕНТА
                    0 - Выход
                    """);
            int menu = scanner.nextInt();
            if (menu == 1) { System.out.println("dffds"); }
            else if (menu == 2) { System.out.println("dfsfd"); }
            else if (menu == 0) { System.out.println("ПОКА!"); System.exit(0);}
        }
}
}
