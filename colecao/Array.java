package colecao;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] materias = new String[]{"Geografia","Fisica","Artes"};

        double[] notas = new double[3];

        System.out.println("Informe as notas das materias abaixo:");

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Nota " + materias[i]);
            notas[i] = sc.nextDouble();
        }

        double somaNotas = 0;
//        for (int i = 0; i < notas.length; i++) {
//            somaNotas += notas[i];
//        }

        for(double nota : notas){
            somaNotas += nota;
        }

        double media = somaNotas / notas.length;

        System.out.println("Media " + media);


    }


}
