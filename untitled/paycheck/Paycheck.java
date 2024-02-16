package paycheck;
import java.util.Scanner;
public class Paycheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                System.out.print("Введите зарплату: ");
                int salary = scanner.nextInt();

                System.out.print("Введите затраты на транспорт: ");
                int transportExpenses = scanner.nextInt();

                if (transportExpenses > salary) {  System.out.println("НЕДОСТАТОЧНО СРЕДСТВ!! "); System.exit(0); }

                System.out.print("Введите затраты на еду: ");
                int foodExpenses = scanner.nextInt();

                if (foodExpenses + transportExpenses >= salary) {  System.out.println("НЕДОСТАТОЧНО СРЕДСТВ!! "); System.exit(0); }

                System.out.print("Введите сумму возможных сбережений: ");
                int savings = scanner.nextInt();

                summaryInfo(salary, transportExpenses, foodExpenses, savings);
        }

        public static void summaryInfo(int salary, int transportExpenses, int foodExpenses, int savings) {
            int summExpenses = transportExpenses + foodExpenses + savings;
            int countInfo = salary - summExpenses;
                System.out.println("Общие затраты: " + summExpenses);

            if (countInfo > 0) {
                System.out.println("\nИзлишек средств: " + countInfo);
                System.out.println("Рекомендация: Отложите денег в сбережения.");
            } else if (countInfo < 0) {
                System.out.println("\nНедостаток средств: " + Math.abs(countInfo));
                System.out.println("Рекомендация: Экономьте или найдите еще работу.");
            } else {
                System.out.println("\nП О Р А З И Т Е Л Ь Н О! \nИдеально ровные затраты - без излишка и недостатков... ");
                System.out.println("Рекомендация: Можете сохранить нынешний уровень затрат или сократить расходы.");
            }
        }
    }
