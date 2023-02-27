package exercicios;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso 1: ");
        int peso1 = sc.nextInt();

        System.out.println("Peso 2: ");
        int peso2 = sc.nextInt();

        System.out.println("Matricula aluno : ");
        int matricula = sc.nextInt();

        System.out.println("Nota 1: ");
        int nota1 = sc.nextInt();

        System.out.println("Nota 2: ");
        int nota2 = sc.nextInt();

        double mediaPonderada = calcularMediaPonderada(nota1, nota2, peso1, peso2);
        System.out.println("Matricula aluno: " + matricula + ", media ponderada: " + mediaPonderada );

    }

    public static double calcularMediaPonderada(double valor1, double valor2, int peso1, int peso2){
        double produtoValor1 = Questao1.calculaProduto(valor1, peso1);
        double produtoValor2 = Questao1.calculaProduto(valor2, peso2);

        double mediaPond = (produtoValor1 + produtoValor2) / (peso1 + peso2);

        return mediaPond;
    }

}
