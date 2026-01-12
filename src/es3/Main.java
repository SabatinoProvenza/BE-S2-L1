package es3;

import es3.exception.BancaException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContoCorrente Mario = new ContoCorrente("Mario Rossi", 100.0);
        ContoOnLine Luigi = new ContoOnLine("Luigi Bianchi", 100.0, 5.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli conto:");
            System.out.println("1) ContoCorrente");
            System.out.println("2) ContoOnLine");
            System.out.println("0) Esci");

            int scelta;
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta == 0) break;


            System.out.print("Quanto vuoi prelevare? ");
            double importo;
            importo = Double.parseDouble(scanner.nextLine());


            try {
                if (scelta == 1) {
                    Mario.preleva(importo);
                    System.out.println("Prelievo eseguito. Saldo CC: " + Mario.restituisciSaldo());
                } else if (scelta == 2) {
                    Luigi.preleva(importo);
                    System.out.println("Prelievo eseguito. Saldo CO: " + Luigi.restituisciSaldo());
                } else {
                    System.out.println("Scelta non valida.");
                }

            } catch (BancaException e) {
                System.out.println("OPERAZIONE BLOCCATA: " + e.getMessage());
            }
        }


    }

}
