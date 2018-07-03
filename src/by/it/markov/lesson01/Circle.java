package by.it.markov.lesson01;

public class Circle {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int r = 3;
        if((a * a + b * b) <= 4 * r * r)
        {
            System.out.println("Закроет");
        }
        else
        {
            System.out.println("Не закроет");
        }
    }
}