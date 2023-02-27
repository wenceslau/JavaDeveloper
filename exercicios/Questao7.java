package exercicios;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario bruto: ");
        double salarioBruto = sc.nextDouble();

        double percentualReajuste = percentualReajuste1(salarioBruto);
        double valorReajuste = Questao1.calculaProduto(salarioBruto, percentualReajuste);
        double salarioReajustado = salarioBruto + valorReajuste;

        System.out.println("Salario antes reajuste: "+ salarioBruto);
        System.out.println("O percentual de aumento aplicado: "+ (percentualReajuste * 100) +"%");
        System.out.println("Valor do aumento: "+ valorReajuste);
        System.out.println("Novo salario apos aumento: "+ salarioReajustado);

    }

    private static double percentualReajuste1(double valorSalario) {
        double reajuste;
        if (valorSalario <= 280.00) {
            reajuste = 0.20;
        } else if (valorSalario > 280.00 && valorSalario <= 700.00) {
            reajuste = 0.15;
        } else if (valorSalario > 700.00 && valorSalario <= 1500.00) {
            reajuste = 0.10;
        } else {
            reajuste = 0.05;
        }
        return reajuste;
    }

    private static double percentualReajuste2(double valorSalario) {
        double reajuste;
        if (valorSalario <= 280.00) {
            reajuste = 0.20;
        } else if (valorSalario <= 700.00) {
            reajuste = 0.15;
        } else if (valorSalario <= 1500.00) {
            reajuste = 0.10;
        } else {
            reajuste = 0.05;
        }
        return reajuste;
    }

}
