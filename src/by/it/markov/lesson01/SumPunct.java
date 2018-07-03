package by.it.markov.lesson01;

public class SumPunct {
    public static void main(String args[]) {
        int p = 0;
        String s = "Знаков препинания: ,;.?! может быть много?!";
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if (x == 33 || x == 34)
                p++;
            if (x > 43 && x < 47)
                p++;
            if (x == 58 || x == 59)
                p++;
            if (x == 63)
                p++;
        }

        System.out.println (p);
    }
}