package org.conta;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta bancária.");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência.");
        String agency = scanner.nextLine();

        System.out.println("Por favor, digite seu nome.");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o valor.");
        double balance = scanner.nextDouble();
        scanner.nextLine();

        scanner.close();

        String feedback = "Ola ".concat(clientName)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agency)
                .concat(", conta ");

        feedback = feedback + accountNumber + " e seu saldo "+balance+" já esta disponivel";

        System.out.println(feedback);

    }

}
