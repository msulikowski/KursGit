// Tablica N elementów, wyznacz średnią oraz mediane.
import java.util.Arrays;
import java.util.Scanner;
public class ArrayAverageMedian {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj rozmiar tablicy:");
            int n = in.nextInt();
            System.out.println("Podaj wartości tablicy o podanym wcześniej rozmiarze:");
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            System.out.print("Elementy podanej tablicy to: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(+array[i]+"; ");
            }
            System.out.println();
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum / n;
            System.out.println("Srednia liczb w tablicy wynosi: "+average);
            double median, tempaverage= 0;
            Arrays.sort(array);
            if (array.length % 2 ==0){ //jeżeli tablica zawiera parzystą liczbę elementów to znajdujemyy średnią wartość dwóch środkowych elementów.
                tempaverage = array[array.length/2]+array[(array.length/2)-1];
                median = tempaverage/2.0;
            }
            else { // jeżeli tablica zawiera nieparzystą liczbę elementów to mediana jest wartością środkową.
                median = array[array.length/2];
            }
            System.out.println("Mediana wynosi :"+median);
    }
}
