package by.it.markov.lesson01;

public class Rubl {
    public static void main(String[] args) {
        int x = (int) (Math.random()*1000000000);
        int y = x % 100;
        if (11 <= y && y <= 14) {
            System.out.println(x + " рублей");
        }
        else {
            int z = x % 10;
            if (z == 1) {
                System.out.println(x + " рубль");
            }
            else if (2 <= z && z <= 4){
                System.out.println(x + " рубля");
            }
            else {
                System.out.println(x + " рублей");
            }
        }
    }
}