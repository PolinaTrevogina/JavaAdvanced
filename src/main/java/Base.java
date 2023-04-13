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
    static Scanner scanner;

    public static void main(String[] args) {
         scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        float a1 = enterFloat();
        System.out.println("Введите второе число:");
        float a2 = enterFloat();
        System.out.println("Введите действие. Допустимые символы: +,-,*,/");
        int action = enterAction();


        float result = makeAction(a1,a2,action);


       System.out.printf("Результат:  %.4f", result);
        scanner.close();
    }

    private static float makeAction(float a1, float a2, int action) {
        switch (action) {
            case (1):
                return a1+a2;
            case (2):
                return a1-a2;
            case (3):
                return a1*a2;
            case (4):
                return a1/a2;
        }
        return 0;
    }

    public static float enterFloat() {
        float number = 0.0F;
        boolean i;
        do {
            try {
                i=true;
                number = scanner.nextFloat();
            } catch (Exception e) {
                i=false;
                System.out.println("Некорректное число. Введите число, допустим разделитель дробной части");
            }

            String tail = scanner.nextLine();

        }while (!i);
        return number;
    }

    public static int enterAction() {
        String actionEnter = scanner.nextLine();

        int action = 0;

        boolean i = false;
        do {
            switch (actionEnter){
                case ("+"):
                    action=1;
                    i=true;
                    break;
                case ("-"):
                    action=2;
                    i=true;
                    break;
                case ("*"):
                    action=3;
                    i=true;
                    break;
                case ("/"):
                    action=4;
                    i=true;
                    break;
                default:
                    System.out.println("Некорректный ввод нужного действия. Допустимые символы: +,-,*,/");
                    actionEnter = scanner.nextLine();
            }
        } while (!i);
        return action;
    }
}