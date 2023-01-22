import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculadora
        System.out.println("Exercício Calculadora");
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha o tipo de operação: \n1: Soma\n2: Subtração\n3: Multiplicação\n4: Divisão ");
        int tipo = scanner.nextInt();
        while (tipo > 4 || tipo < 1) {
            System.out.println("Tipo Inválido, insira outro número!");
            tipo = scanner.nextInt();
        }
        if (tipo == 1) {
            Calculadora.soma(num1, num2);
        } else if (tipo == 2) {
            Calculadora.subtracao(num1, num2);
        } else if (tipo == 3) {
            Calculadora.multiplicacao(num1, num2);
        } else if (tipo == 4) {
            Calculadora.divisao(num1, num2);
        }
        //Mensagem
        System.out.println("\nExercício Mensagem");
        System.out.println("Que horas são? (Digite só a hora)");
        int horas = scanner.nextInt();
        while (horas > 23) {
            System.out.println("Hora inválida, insira outro número.");
            horas = scanner.nextInt();
        }
        Mensagem.obterMensagem(horas);

        //Empréstimo
        System.out.println("\nExercício Empréstimo");
        System.out.println("Insira o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        Emprestimo.calcular(valorEmprestimo, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(valorEmprestimo, Emprestimo.getTresParcelas());
        Emprestimo.calcular(valorEmprestimo, 4);
    }
}

