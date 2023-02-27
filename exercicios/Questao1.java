package exercicios;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1:");
        double numero1 = sc.nextDouble();

        System.out.println("Numero 2:");
        double numero2 = sc.nextDouble();

        System.out.println("Media:" + calculaMedia(numero1, numero2));
        System.out.println("Produto: "+ calculaProduto(numero1, numero2));

    }

    public static double calculaMedia(double valor1, double valor2){
        return (valor1 + valor2) / 2 ;
    }

    public static double calculaProduto(double valor1, double valor2){
        return valor1 * valor2;
    }

}
