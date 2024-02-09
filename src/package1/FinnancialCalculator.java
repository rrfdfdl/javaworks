package package1;
import java.util.Scanner;

public class FinnancialCalculator{
    public static void main(String[] args)
{
    int[] spend = new int[30];
    Scanner scanner = new Scanner(System.in);

    while (true) {
        //МЕНЮ
        System.out.println("""
                1 - Ввести расходы за определенный день
                2 - Траты за месяц
                3 - Самая большая сумма расхода за месяц
                0 - Выход
                """);
        int menu = scanner.nextInt();

        //ВЫБОР ДНЯ
        if (menu == 1) {
            System.out.print("Выберите день (Введите число от 1 до 30): ");
            int day = scanner.nextInt() - 1;
            if (day < 0 || day > 29 ) { System.out.print("ДЕНЬ ДОЛЖЕН БЫТЬ ВЫБРАН В ДИАПОЗОНЕ ОТ 1 ДО 30!!\n"); continue;}
            System.out.print("Введите сумму расходов: ");
            int expense = scanner.nextInt();

        //ПЕРЕЗАПИСЬ
            if (spend[day] != 0) {
                System.out.print("За этот день уже указана сумма. Перезаписать? (да/нет): ");
                String answer = scanner.next();
                if (answer.startsWith("да")) {
                    spend[day] = expense;
                }
            } else {
                spend[day] = expense;
            }

        //СПИСОК ТРАТ
        } else if (menu == 2) {
            System.out.println("Список трат:");
            for (int i = 0; i < spend.length; i++) {
                System.out.println((i + 1) + " день – " + spend[i] + " руб / " + spend[i] / 90 + " $ / " + spend[i] / 97 + " € / " + spend[i] / 12.5 + " ¥");
            }

        //САМАЯ БОЛЬШАЯ СУММА ЗА МЕСЯЦ
        } else if (menu == 3) {
            int maxSpend = 0;
            int maxDay = 0;
            for (int i = 0; i < spend.length; i++) {
                if (spend[i] > maxSpend) {
                    maxSpend = spend[i];
                    maxDay = i + 1;
                }
            }
            System.out.println("Самая большая сумма расхода за месяц:\n" + maxDay + " день – " + maxSpend + " руб / " + maxSpend / 90 + " $ / " + maxSpend / 97 + " € / " + maxSpend / 12.5 + " ¥");

        //ПОКА!
        } else if (menu == 0) {
            System.out.println("Пока-пока!");
            System.exit(0);
        }
    }
}
}