package components;

import models.Account;
import models.Customer;

import java.util.Scanner;

public class AccountReader {
    private final Scanner scanner;
    private final CustomerReader customerReader;

    public AccountReader(Scanner scanner, CustomerReader customerReader) {
        this.scanner = scanner;
        this.customerReader = customerReader;
    }

    public Account read() {


        System.out.print("Introduce el IBAN de la cuenta: ");
        String iban = scanner.nextLine();

        System.out.print("Introduce el saldo inicial de la cuenta: ");
        double saldo = scanner.nextDouble();

        Customer customer = customerReader.readCustomer();

        return new Account(iban, saldo, customer );
    }
}
