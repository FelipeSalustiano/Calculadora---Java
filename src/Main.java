import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            // Exibindo o menu
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");

            // Lendo a opção do usuário
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            // Variáveis para armazenar os números digitados pelo usuário
            double num1, num2;

            switch (opcao) {
                case 1: // Soma
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2: // Subtração
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3: // Multiplicação
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4: // Divisão
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5: // Sair
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Calculadora encerrada.");
        scanner.close();
    }
}