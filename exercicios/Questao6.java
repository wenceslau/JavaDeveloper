package exercicios;

import java.util.Scanner;

public class Questao6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = Questao1.calculaMedia(nota1, nota2);

        identificarAprovacao(media);

    }

    private static void identificarAprovacao(double media) {
        if (media >= 10){
            System.out.println("Aprovado com distinção");
        }else if (media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
         }
    }

}
