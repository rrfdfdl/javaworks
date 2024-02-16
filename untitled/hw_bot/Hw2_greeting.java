package hw_bot;

import java.time.LocalTime;
import java.util.Scanner;

public class Hw2_greeting {
        public static void main(String[] args)
        {
            System.out.print("Введите ваше имя: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            int hour = LocalTime.now().getHour();
            String greeting = "";

            if (hour < 4 || hour == 23) greeting += "Спокойной ночи";
            else if (hour < 12) greeting += "Доброе утро";
            else if (hour < 18) greeting += "Добрый день";
            else if (hour < 23) greeting += "Добрый вечер";
            greeting += ", " + name;
            System.out.println(greeting);
            System.out.println("Сейчас " + hour + " часов.");
        }
    }
