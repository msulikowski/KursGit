// Podaje ciąg liczb całkowitych (mniej niż 15 sztuk) np, 1,2,3,4,6,6.
// No i z tego trzeba wyszukać największą możliwą liczbę jaką da się z tego ułożyć w tym wypadku to bedzie: 664321;
// Wynik musi być zwrócony w funkcji jako jedna liczba. Czyli na wejściu funkcji cyfry od 0-9,
// maksymalnie mozemy ich podac 15 nie ma co przesadzać. Wynik to jedna liczba najwieksza z możliwych do ułożenia.

import java.util.Scanner;
public class HighestPossibleNumber {
    public static void main(String[] args) {
        System.out.println("Program do znajdywania największej możliwej liczby z podanego ciągu liczb.");
        Scanner read = new Scanner(System.in);
        System.out.println("Podaj z ilu liczb ma składać się ciąg liczb całkowitych (od 1 do 14).");
        int n, i = 0;
        int[] array;
        while (true) {
            n = read.nextInt();
            if (n < 1 || n > 14) {
                System.out.println("Niepoprawna liczba. Liczba ma być dodatnia, całkowita i mniejsza od 15!");
            }
            else {
                array = new int[n];
                break;
            }
        }
        System.out.println("Wprowadź n liczb całkowitych (od 0 do 9).");
        while( i < n ) {
            array[i] = read.nextInt();
            if (array[i] >= 0 && array[i] <= 9) {
                i++;
            } else System.out.println("Niepoprawna liczba. Liczba ma być z przedziału 0 -9 !");
        }
        // Znalezienie największej liczby w tablicy - bonus (ewentlanie można posortować i wyświetlić 0 element (pierwszy)
        int max = array[0];
        for (i=0; i<n; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Najwieksza liczba z tablicy to: "+max);
        //babelkowa metoda sortujaca zamiast Arrays.sort(array);
        for (i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        } //po sortowaniu, odwrócenie tablicy - od największej do najmniejszej
        for (i=0; i<n/2; i++){
            int a = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = a;}
        System.out.print("Największa możliwa liczba z podanego ciągu to: ");
        for (long ar : array) // wyświetlenie liczby, potrzebna zmienna long
            System.out.print(ar);
    }
}