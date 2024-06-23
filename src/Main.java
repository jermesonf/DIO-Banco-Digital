import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Conta contaPoupanca = new ContaPoupanca(cliente);
        Conta contaCorrente = new ContaCorrente(cliente);
        cliente.setNome("Cliente 1");

        System.out.println("\n*** CONTA POUPANÇA *** \n");

        contaPoupanca.imprimirExtrato();

        System.out.println("\n*** REALIZADO DEPOSITO *** ");
        contaPoupanca.depositar(3000);
        contaPoupanca.imprimirExtrato();

        System.out.println("\n*** REALIZADO SAQUE ***");
        contaPoupanca.sacar(1000);
        contaPoupanca.imprimirExtrato();

        System.out.println("\n--------------------------------------------------");

        System.out.println("\n*** CONTA CORRENTE *** \n");

        contaCorrente.imprimirExtrato();

        System.out.println("\n*** REALIZADO DEPOSITO *** ");
        contaCorrente.depositar(5000);
        contaCorrente.imprimirExtrato();

        System.out.println("\n*** REALIZADO SAQUE ***");
        contaCorrente.sacar(1000);
        contaCorrente.imprimirExtrato();

        System.out.println("\n--------------------------------------------------");

        System.out.println("\n*** TRANSFERENCIA ENTRE CONTAS *** \n");

        contaPoupanca.imprimirExtrato();
        System.out.println("\n");
        contaCorrente.imprimirExtrato();

        System.out.println("\n--------------------------------------------------");

        System.out.println("\n*** REALIZADO TRASFERENCIA POUPANÇA PARA CORRENTE ***");
        contaPoupanca.transferir(1000, contaCorrente );

        contaPoupanca.imprimirExtrato();
        System.out.println("\n");
        contaCorrente.imprimirExtrato();

    }

}
