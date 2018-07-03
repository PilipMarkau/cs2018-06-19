package by.it.markov.lesson01;

public class Sum {
    public static void main(String args[]) {
        int x = ((int) (Math.random () * 100000000));
        int s = 0;
        int y = 0;
        while (x >= 1) {
            y = x % 10;
            s += y;
            x /= 10;
        }
        System.out.println(s);
    }
}