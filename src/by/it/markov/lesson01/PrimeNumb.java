package by.it.markov.lesson01;

public class PrimeNumb {
        public static void main(String args[]) {
            int x = 59;
            int i = 2;
            int y = 1;
            if (x < 2) {
                System.out.println("nie prostoye");
            }
            else {
                while (y != 0) {
                    y = x % i;
                    i++;
                }
                if (x == (i-1)) {
                    System.out.println("Простое");
                }
                else {
                    System.out.println("Не простое");
                }
            }
        }
    }
