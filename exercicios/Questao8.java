package exercicios;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Solcita usuario dados
        System.out.println("Valor Hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Quantidade Horas Trabalhada: ");
        double quantidadeHorasMes = sc.nextDouble();

        //Calcula salrio a receber
        double salarioBruto = Questao1.calculaProduto(valorHora, quantidadeHorasMes);

        //Identitica percentual imposto e fgts
        double percentualIr = percentualIR(salarioBruto);
        double percentualInss = 0.10;
        double percentualFgts = 0.11;

        //calcula valore a descontar
        double valorIr = Questao1.calculaProduto(salarioBruto, percentualIr);
        double valorInss = Questao1.calculaProduto(salarioBruto, percentualInss);
        double valorIFgts = Questao1.calculaProduto(salarioBruto, percentualFgts);

        double salarioLiquido = salarioBruto - valorIr - valorInss;

        System.out.printf("Salário Bruto: (%.2f * %.2f)\t: R$ %.2f\n",valorHora, quantidadeHorasMes,salarioBruto);
        System.out.printf("(-) IR (%.2f%%)\t\t\t\t\t: R$ %.2f\n", (percentualIr*100), valorIr);
        System.out.printf("(-) INSS (%.2f%%)\t\t\t\t: R$ %.2f\n",(percentualInss*100), valorInss);
        System.out.printf("FGTS (%.2f%%)\t\t\t\t\t: R$ %.2f\n",(percentualFgts*100), valorIFgts);
        System.out.printf("Total de descontos\t\t\t\t: R$ %.2f\n",(valorIr + valorInss));
        System.out.printf("Salário liquido\t\t\t\t\t: R$ %.2f\n",salarioLiquido);

    }

    private static double percentualIR(double salarioBruto) {
        double percentualIr;
        if (salarioBruto <= 900.00) {
            percentualIr = 0;
        } else if (salarioBruto <= 1500.00) {
            percentualIr = 0.05;
        } else if (salarioBruto <= 2500.00) {
            percentualIr = 0.10;
        } else {
            percentualIr = 0.20;
        }
        return percentualIr;
    }

}
