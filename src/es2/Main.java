package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km percorsi");
            int kmPercorsi = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci i litri consumati");
            int litri = Integer.parseInt(scanner.nextLine());
            int kmLitro = kmPercorsi / litri;
            System.out.println("Hai consumato " + kmLitro + " km al litro");
        } catch (ArithmeticException e) {
            System.out.println("ERRORE: non si può dividere per 0");
        }

    }
}
