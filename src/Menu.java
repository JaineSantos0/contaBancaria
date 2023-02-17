import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        while(true){
            System.out.println("-------------------------------------------------");
            System.out.println("                                                 ");
            System.out.println("----------------Banco Santander------------------");
            System.out.println(                                                   );
            System.out.println("-------------------------------------------------");
            System.out.println("                1-Criar Conta                    ");
            System.out.println("            2-Listar todas Contas                ");
            System.out.println("          3-Buscar Conta por Numero              ");
            System.out.println("         4-Atualizar Dados da Conta              ");
            System.out.println("              5-Apagar Conta                     ");
            System.out.println("                  6-Sacar                        ");
            System.out.println("               7-Depositar                       ");
            System.out.println("       8-Transferir valores entre Contas         ");
            System.out.println("                  9-Sair                         ");

            System.out.println("Digite uma opção: ");
            opcao = sc.nextInt();

            if (opcao == 9) {
                System.out.println("Faça igual a milhares de brasileiros e escolha o Santander");
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