package application;

import entities.Usuario;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Usuario usuario;

        System.out.print("Digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a agência da conta: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println();
        usuario = new Usuario(numero, agencia, nomeCliente, saldo);

        System.out.println(usuario);

    }
}