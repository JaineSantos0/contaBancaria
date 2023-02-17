package conta;

import conta.model.Conta;

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

        int opcao;

        while(true){
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.println("------------Banco TecWoman----------------");
            System.out.println(                                            );
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
                    System.out.println("1- Criar Conta");
                    break;
                case 2:
                    System.out.println("2- Listar todas Contas");
                    break;
                case 3:
                    System.out.println("3- Buscar Conta por Numero");
                    break;
                case 4:
                    System.out.println("4- Atualizar Dados da Conta");
                    break;
                case 5:
                    System.out.println("5- Apagar Conta");
                    break;
                case 6:
                    System.out.println("6- Sacar");
                    break;
                case 7:
                    System.out.println("7- Depositar");
                    break;
                case 8:
                    System.out.println("8- Transferir valores entre contas");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}