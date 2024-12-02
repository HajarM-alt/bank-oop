package components;

import models.Customer;

import java.util.Scanner;

public class CustomerReader {
    private final Scanner scanner;

    public CustomerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Customer readCustomer() {


        System.out.print("Introduce el NIF del cliente: ");
        String nif = scanner.nextLine();

        System.out.print("Introduce el nombre del cliente: ");
        String name = scanner.nextLine();

        System.out.print("Introduce los apellidos del cliente: ");
        String surname = scanner.nextLine();

        return new Customer(nif, name, surname);
    }
}

