import java.util.Scanner;

/**
 * Формирование сладкого подарка
 *
 * Позволяет ввести количество сладостей в сладком подарке,
 * А затем либо заполнить его, введя все данные через консоль
 * Либо сгенерировать сладкий подарок автоматически, выбрав названия сладостей из заранее заданного списка, а вес и цену сгенерировав автоматически
 * После чего выводит сводную информацию о сладостях в подарке, а так же общую сумму, общий вес
 *
 * @author Полина Тревогина
 */

public class SweetBag {
    static Scanner scanner;

    public static void sweetBag() {
        scanner = new Scanner(System.in);

        System.out.println("--- Сформируем сладкий подарок ---");
        System.out.println("");

        //Обнулить счетчик
        Sweety.setCounter(1);


        System.out.println("Сколько сладостей должно быть в подарке?");
        int size = enterInt();

        System.out.println("Создадим автоматически (1) или введем вручную (2)?");
        int selection = enterInt();
        while ((selection!=1)&&(selection!=2)){
                System.out.println("Непонятный выбор. Повторите ввод 1 или 2");
                selection = enterInt();
        }

        Sweety[] box = new Sweety[size];
        if (selection==1){
            for (int i=0;i<size;i++){
                box[i]=genSweety(i+1);
            }}else {
        for (int i=0;i<size;i++){
             box[i]=putSweety(i+1);
        }}




        //int maxLength = findMaxLength(mass, size);

        System.out.println("Результат:");
        System.out.println("Сладостей на сумму  " + findTotalPrice(box));
        System.out.println("Общим вестом  " + findTotalWeight(box));
        System.out.println("Список сладостей:  ");
        printSweeties(box);



        //printMax(mass, maxLength);
        System.out.println("");
        System.out.println("--- Сладкий подарок сформирован ---");
    }

    private static Sweety genSweety(int counter) {
        System.out.println("Сладость номер "+counter);
        String title= Sweety.getRandomTitle();
        double price = Sweety.getRandomPrice();
        double weight = Sweety.getRandomWeight();

        System.out.printf(" %s, весом %.2f с ценой %.2f \n",title, weight, price);

        return new Sweety(title,weight,price);
    }


    private static Sweety putSweety(int counter){
        System.out.println("Сладость номер "+counter);
        System.out.println("Введите название");
        String title= scanner.nextLine();
        System.out.println("Введите цену");
        double price = enterDouble();
        System.out.println("Введите вес");
        double weight = enterDouble();

        return new Sweety(title,weight,price);
    }



    private static double findTotalWeight(Sweety[] box) {
        double totalWeight=0;
        for (int i=0;i<box.length;i++){
            totalWeight=totalWeight+box[i].getWeight();
        }
        double scale = Math.pow(10, 3);
        totalWeight = Math.round(totalWeight * scale) / scale;
        return totalWeight;
    }

    private static double findTotalPrice(Sweety[] box) {
        double totalPrice=0;
        for (int i=0;i<box.length;i++){
            totalPrice=totalPrice+box[i].getPrice();
        }
        double scale = Math.pow(10, 3);
        totalPrice = Math.round(totalPrice * scale) / scale;
        return totalPrice;
    }

    private static void printSweeties(Sweety[] box) {
        for (int i=0;i<box.length;i++){
            System.out.println(" "+box[i].getUnique() + "  "+ box[i].getTitle()+ ", ");
        }
    }

    public static int enterInt() {
        int number = 0;
        boolean i;
        do {
            try {
                i = true;
                number = scanner.nextInt();
            } catch (Exception e) {
                i = false;
                System.out.println("Некорректное число. Введите целое число");
            }

            String tail = scanner.nextLine();

        } while (!i);
        return number;
    }
    public static double enterDouble() {
        double number = 0;
        boolean i;
        do {
            try {
                i = true;
                number = scanner.nextDouble();
            } catch (Exception e) {
                i = false;
                System.out.println("Некорректное число. Введите число, допустимо с разделителем десятичной части");
            }

            String tail = scanner.nextLine();

        } while (!i);
        return number;
    }
}