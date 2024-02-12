package hw_num;

import java.util.Random;
import java.util.Scanner;
public class hw1_numbers {
        public static void main(String[] args)
        {
            Random random = new Random();
            Scanner scan = new Scanner(System.in);

            int hiddenNum = random.nextInt(9)+1;
            int guess;
            int attempt = 0;

            System.out.println("Угадайте число от 1 до 10.");

            do
            { attempt++;
                if (attempt == 4) { System.out.println("Достигнут предел попыток"); System.exit(0); }

                System.out.print("Введите число: ");
                guess = scan.nextInt();
                if (guess < hiddenNum) { System.out.println("Загаданное Число больше"); }
                if (guess > hiddenNum) { System.out.println(" Загаданное Число меньше"); }
                if (guess > 10 || guess < 0) { System.out.println("Вводите число от 1 до 10"); System.exit(0); }
                if (!scan.hasNextInt()) { System.out.println("Это не число. Введите число."); System.exit(0); }
            }

            while(guess != hiddenNum);
            System.out.println("Вы угадали число!");
        }
    }

