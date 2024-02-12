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
public class hw3_king {

    public class King { int kinghp = 1; int kinggold = 30; }
    public class Ally { int allycost; int allyhp; int allydmg;}
    public static class Creep { int creephp; int creepdmg; int creepdrop; }
    public static void main(String[] args)
    {
        Random gp = new Random();
        int number = gp.nextInt(8) + 1;
        if (number == 2) {  System.out.println("Вас настигла Божья кара... рип"); System.exit(0); }

        System.out.println("""
                0 - писи
                1 - Статы короля
                2 - 
                """);
}}
