import java.sql.SQLOutput;
import java.util.Scanner;


/**
 * Меню заданий
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

            System.out.println("Что будем делать? ");
            System.out.println("1 - Калькулятор, 2 - Найти самое длинное слово в массиве");
            System.out.println("3 - Найти минимальное и максимальное значение массива");
            System.out.println("4 - Сформировать сладкий подарок, 0 - для выхода");


            actionSelect = scanner.nextLine();
            switch (actionSelect){
                case ("1"):
                    Calc.calc();
                    i=false;
                    break;
                case ("2"):
                    FindMax.findMax();
                    i=false;
                    break;
                case ("3"):
                    SwapMinMax.swapMinMax();
                    i=false;
                    break;
                case ("4"):
                    SweetBag.sweetBag();
                    i=false;
                    break;
                case ("0"):
                    System.out.println("Конец программы");
                    i=true;
                    break;
                default:
                    System.out.println("Некорректный ввод нужного действия. Повторите ввод: 1, 2 или 0 ");
                    i=false;
            }
            if (!i)
                System.out.println("Попробуем еще раз?");

            System.out.println("");

        } while (!i);
        scanner.close();
    }

}