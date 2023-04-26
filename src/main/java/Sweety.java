import java.util.Random;
/**
 * Формирование сладостей
 *
 * Позволяет задать и запросить данные по сладости, содержит вспомогательные методы для генерации сладости
 *
 * @author Полина Тревогина
 */

public class Sweety {
    private String title;
    private double weight;
    private double price;
    private int unique;
    private static int counter=1;
    private static String[] titles ={"Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice-Cream", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo"};

    public Sweety(String title, double weight, double price){
        setTitle(title);
        setWeight(weight);
        setPrice(price);
        setUnique(counter++);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private void setUnique(int unique) {
        this.unique = unique;
    }

    public static void setCounter(int counter) {
        Sweety.counter = counter;
    }

    public String getTitle() {
        return title;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getUnique() {
        return unique;
    }

    public static String getRandomTitle(){
        int pos= new Random().nextInt(titles.length);
        return titles[pos];
    }
    public static double getRandomPrice(){
        double price= Math.random()*100;
        return price;
    }

    public static double getRandomWeight(){
        double weight= Math.random()*100;
        return weight;
    }

}
