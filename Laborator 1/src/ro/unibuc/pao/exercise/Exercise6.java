package ro.unibuc.pao.exercise;

import java.util.Scanner;

/**
 * Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
 * notelor se opreste si programul afiseaza media acestora.
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Citeste nota: ");
            int nota = scanner.nextInt();
            if (nota == -1) {
                if (count > 0) {
                    System.out.println("Media este: " + sum / count);
                } else {
                    System.out.println("Nu am putut calcula media");
                }
                break;
            } else {
                sum += nota;
                count++;
            }
        }

        System.out.println("Media este: " + sum / count);
    }
}
