// Tablica N elementów, wyznacz średnią oraz mediane, spróbuj zapiać swój kod jeszcze ściślej, bezpieczenie wczytywania liczb przed użytkownikiem bandytą

import java.util.Scanner;
public class ArrayAverageMedian {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(read.nextLine());
                if (n > 0){
                    break;
                } else {
                    System.out.println("Podana wartość musi być większa od 0 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawne dane! " + "\n Podaj dodatnią liczbę całkowitą");
            }
        }
        System.out.println("Podaj wartości tablicy o podanym wcześniej rozmiarze:");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                try {
                    array[i] = Integer.parseInt(read.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Niepoprawne dane! " + "\n Podaj liczbę całkowitą");
                }
            }
        }
        System.out.print("Elementy podanej tablicy to: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(+array[i] + "; ");
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / n;
        System.out.println("Srednia liczb w tablicy wynosi: " + average);
        //babelkowa metoda sortujaca zamiast Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        double median, tempaverage = 0;
        if (array.length % 2 == 0) { //jeżeli tablica zawiera parzystą liczbę elementów to znajdujemyy średnią wartość dwóch środkowych elementów.
            tempaverage = array[array.length / 2] + array[(array.length / 2) - 1];
            median = tempaverage / 2.0;
        } else { // jeżeli tablica zawiera nieparzystą liczbę elementów to mediana jest wartością środkową.
            median = array[array.length / 2];
        }
        System.out.println("Mediana wynosi: " + median);
    }
}
