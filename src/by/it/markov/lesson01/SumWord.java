package by.it.markov.lesson01;

public class SumWord {
    public static void main(String args[]) {
        int p = 0;
        String s ="gbvfb TTTT   \b dsvbdsf";
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if ((x > 64 && x < 91) || (x > 96 && x < 123)){
                p++;
                for (int j = i+1; j < s.length(); j++){
                    char y = s.charAt(j);
                    if ((y > 64 && y < 91) || (y > 96 && y < 123)){
                        i++;
                    }
                    else break;
                }
            }
        }
        System.out.println (p);
    }
}