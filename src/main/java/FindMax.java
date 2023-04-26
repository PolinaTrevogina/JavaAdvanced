import java.util.Scanner;

/**
 * Поиск самого длинного слова в массиве
 *
 * Позволяет ввести размерность массива, заполнить его строковыми переменными
 * Затем находит самое длинное слово, и выводит его на экран
 *
 * @author Полина Тревогина
 */
public class FindMax {



        static Scanner scanner;

        public static void findMax() {
            scanner = new Scanner(System.in);

            System.out.println("--- Поиск самого длинного слова ---");
            System.out.println("");


            System.out.println("Введите размерность массива число:");
            int size = enterSize();
            System.out.println("Введите данные массива. Произвольные строки");
            String[] mass = new String[size];
            for (int i=0;i<size;i++){
                System.out.print("Введите строку номер "+(i+1)+":  ");
                mass[i]= scanner.nextLine();
            }


            int maxLength = findMaxLength(mass,size);

            System.out.println("Результат. В массиве найдены следующие строки с макисмальной длиной:  " + maxLength);
            printMax(mass, maxLength);
            System.out.println("");
            System.out.println("--- Конец поиск самого длинного слова ---");
        }

    private static int findMaxLength(String[] mass, int size) {
            int maxLength=0;
            for (int i=0;i<size;i++){
                if (mass[i].length()>maxLength){
                    maxLength=mass[i].length();
                }

            }
            return maxLength;
    }

    private static void printMax(String[] mass, int maxLength){
        for (int i=0;i<mass.length;i++){
            if (mass[i].length()>=maxLength){
                System.out.println(mass[i]);
            }

        }
    }

    public static int enterSize() {
            int number = 0;
            boolean i;
            do {
                try {
                    i=true;
                    number = scanner.nextInt();
                } catch (Exception e) {
                    i=false;
                    System.out.println("Некорректное число. Введите целое число в качестве размера массива");
                }

                String tail = scanner.nextLine();

            }while (!i);
            return number;
        }

    }

