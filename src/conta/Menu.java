package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta(1, 123, 1, "Erica Araújo", 30000f);

        conta1.visualizar();

        conta1.setSaldo(35000f);

        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta(2, 123, 1, "Dener Cardoso", 50000.0f);

        conta2.visualizar();

        if (conta2.sacar(100000f))
            System.out.println(conta2.getSaldo());

        conta1.depositar(10000f);

        conta1.visualizar();

        ContaCorrente c3 = new ContaCorrente(1, 245, 1, "Jaine Josiane", 10000, 5000);
        c3.visualizar();
        c3.sacar(17000.00f);
        c3.visualizar();
        c3.depositar(5000.00f);
        c3.visualizar();

        ContaPoupanca c4 = new ContaPoupanca(2, 134,2,"Jose Silva",40000.00f,12);
        c4.visualizar();
        c4.sacar(20000.00f);
        c4.visualizar();
        c4.depositar(10000.00f);
        c4.visualizar();

        int opcao;

        int agencia,tipo,aniversario,numero,numeroDestino;
        String titular;
        float saldo,limite,valor;
        while (true) {
            System.out.println(Cores.TEXT_PURPLE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "------------------------------------------");
            System.out.println("                                          ");
            System.out.println("------------Banco TecWoman----------------");
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("             1-Criar Conta                ");
            System.out.println("          2-Listar todas Contas           ");
            System.out.println("        3-Buscar Conta por Numero         ");
            System.out.println("        4-Atualizar Dados da Conta        ");
            System.out.println("             5-Apagar Conta               ");
            System.out.println("                6-Sacar                   ");
            System.out.println("               7-Depositar                ");
            System.out.println("     8-Transferir valores entre Contas    ");
            System.out.println("                 9-Sair                   ");
            System.out.println("------------------------------------------");
            System.out.println("-------Entre com a opção desejada:--------");
            opcao = sc.nextInt();

            if (opcao == 9) {
                System.out.println("O Banco Delas");
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("1- Criar Conta\n\n");
                    System.out.println("Número da Agencia: ");
                    agencia = sc.nextInt();

                    System.out.println("Nome do Titular: ");
                    sc.skip("\\R?");
                    titular = sc.nextLine();
                    do {
                        System.out.println("Tipo da Conta (1-CC / 2-CP:  ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("Saldo da Conta: ");
                    saldo = sc.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Limite da Conta Corrente: ");
                            limite = sc.nextFloat();
                            ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
                        }
                        case 2 -> {
                            System.out.println("Aniversário da Conta Poupança: ");
                            aniversario = sc.nextInt();
                            ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
                        }
                    }
                    keyPress();
                    break;
                case 2:
                    System.out.println("2- Listar todas Contas");
                    keyPress();
                    break;
                case 3:
                    System.out.println("3- Buscar Conta por Numero");
                    System.out.println("Número da Conta: ");
                    numero = sc.nextInt();
                    keyPress();
                    break;
                case 4:
                    System.out.println("4- Atualizar Dados da Conta");
                    System.out.println("Número da Agencia: ");
                    agencia = sc.nextInt();

                    System.out.println("Nome do Titular: ");
                    sc.skip("\\R?");
                    titular = sc.nextLine();
                    do {
                        System.out.println("Tipo da Conta (1-CC / 2-CP:  ");
                        tipo = sc.nextInt();
                    } while (tipo < 1 && tipo > 2);

                    System.out.println("Saldo da Conta: ");
                    saldo = sc.nextFloat();

                    switch (tipo) {
                        case 1 -> {
                            System.out.println("Limite da Conta Corrente: ");
                            limite = sc.nextFloat();
                            ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
                        }
                        case 2 -> {
                            System.out.println("Aniversário da Conta Poupança: ");
                            aniversario = sc.nextInt();
                            ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
                        }
                    }
                    keyPress();
                    break;
                case 5:
                    System.out.println("5- Apagar Conta");
                    System.out.println("Número da Conta: ");

                    keyPress();
                    break;
                case 6:
                    System.out.println("6- Sacar");
                    System.out.println("Número da Conta: ");
                    System.out.println("Valor do Saque: ");

                    keyPress();
                    break;
                case 7:
                    System.out.println("7- Depositar");
                    System.out.println("Número da Conta: ");
                    System.out.println("Valor do depósito: ");
                    keyPress();
                    break;
                case 8:
                    System.out.println("8- Transferência entre contas\n\n");

                    System.out.println("Número da Conta - Origem: ");
                    numero = sc.nextInt();

                    System.out.println("Número da Conta - Destino: ");
                    numeroDestino = sc.nextInt();

                    System.out.println("Valor da Transferência: ");
                    valor = sc.nextFloat();

                    keyPress();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void keyPress() {

        try {

            System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
            System.in.read();

        } catch (IOException e) {

            System.out.println("Você pressionou uma tecla diferente de enter!");

        }
    }
}