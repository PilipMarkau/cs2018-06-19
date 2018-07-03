package by.it.markov.lesson01;

public class SumMinMaxArray {
    public static void main(String args[]) {
        int[] array = {0,1,8,7,4,8,5,12};
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < array[min]){
                min = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > array[max]){
                max = i;
            }
        }
        if (min > max){
            int t = min;
            min = max;
            max = t;
        }
        for (int i = min + 1; i < max; i++){
            sum += array[i];
        }
        System.out.println (sum);
    }
}