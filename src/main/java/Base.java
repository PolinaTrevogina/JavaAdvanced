import java.sql.SQLOutput;
import java.util.Scanner;


/**
 * Консольный калькулятор
 *
 * Позволяет ввести два дробных числа, с плавающей запятой и действие
 * При вводе некорректного значения в качестве числа, программа ввести число еще раз
 * При вводе некорректного значения в качестве действия, программа позволяет ввести действие заново
 * Вывод результата форматирован до четырех знаков после запятой
 *
 * @author Полина Тревогина
 */

public class Base {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String actionSelect;
        boolean i = false;

        do {

            System.out.println("Что будем делать? 1 - Калькулятор, 2 - Найти самое длинное слово в массиве, 0 - для выхода");

            actionSelect = scanner.nextLine();
            switch (actionSelect){
                case ("1"):
                    Calc.calc();
                    i=false;
                    System.out.println("Попробуем еще раз?");
                    break;
                case ("2"):
                    FindMax.findMax();
                    i=false;
                    System.out.println("Попробуем еще раз?");
                    break;
                case ("0"):
                    System.out.println("Конец программы");
                    i=true;
                    break;
                default:
                    System.out.println("Некорректный ввод нужного действия. Повторите ввод: 1, 2 или 0 ");
                    i=false;
            }
            System.out.println("");

        } while (!i);
        scanner.close();
    }

}