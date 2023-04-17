import java.util.Scanner;

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


            int result = findMaxString(mass,size);

            System.out.println("Результат. Самая длинная строка массива:  " + mass[result]);
        }

    private static int findMaxString(String[] mass, int size) {
            int max = 0;
            int maxSize=0;
            for (int i=0;i<size;i++){
                if (mass[i].length()>=maxSize){
                    maxSize=mass[i].length();
                    max=i;
                }
            }
            return max;
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

