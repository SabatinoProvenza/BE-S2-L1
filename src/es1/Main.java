package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numbers = new int[5];

        //RIEMPIMENTO ARRAY CASUALE
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        System.out.println(Arrays.toString(numbers));

        while (true) {
            System.out.println("Inserisci un numero da inserire nell'elenco (0 per uscire)");
            int number = Integer.parseInt(scanner.nextLine());

            if (number == 0) break;

            System.out.println("Scegli la posizione (da 1 a 5)");
            int position = Integer.parseInt(scanner.nextLine());


            try {
                numbers[position - 1] = number;
                System.out.println(Arrays.toString(numbers));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore! Posizione scelta non valida");
            }
        }
    }
}
