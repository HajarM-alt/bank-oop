package org.ies.bank;
import components.BankReader;
import models.Bank;

import java.util.Scanner;

public class BankApp {
    private Bank bank;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Crear el banco usando BankReader
        System.out.println("Configuración inicial del banco:");
        bank = BankReader.readBank();

        int option;
        do {
            System.out.println("-------- Menú --------");
            System.out.println("1. Mostrar las cuentas del banco");
            System.out.println("2. Mostrar datos de una cuenta");
            System.out.println("3. Mostrar las cuentas de un cliente");
            System.out.println("4. Ingresar dinero en cuenta");
            System.out.println("5. Sacar dinero de una cuenta");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                bank.showAccounts();

            } else if (option == 2) {

            }


        }
    }
}
