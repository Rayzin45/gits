import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.print("Porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }
}