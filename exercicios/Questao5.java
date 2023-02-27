package exercicios;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario bruto: ");
        double salarioBruto = sc.nextDouble();


        double valorInss = calcularInss(salarioBruto);
        double valorFgts = calcularFgts(salarioBruto);
        double valorPlanoSaude = calcularPlanoSaude();

        double salarioLiquido = salarioBruto - valorInss - valorPlanoSaude;

        System.out.println("Salario liquido: " + salarioLiquido + ". FGTS: " + valorFgts);

    }

    public static  double calcularInss(double valorSalario){
        return valorSalario * 0.10;
    }

    public static  double calcularFgts(double valorSalario){
        return valorSalario * 0.08;
    }

    public static  double calcularPlanoSaude(){
        return 100.00;
    }
}
