package colecao;

import java.util.Scanner;

public class Questão1 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da matrix");
        int tamanho = sc.nextInt();

        int matriz[][] = new int[tamanho][tamanho];

        inciarMatriz(matriz);

        imprimerMatriz(matriz);

    }

    private static void inciarMatriz(int[][] matriz) {
        //For para inicializar a matriz

        //JEITO 1 DE INICIALIZAR USANDO O IF COM ||
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                //Aqui verifica a linha e coluna que precisa estar com 1
                    matriz[i][(matriz.length-1) - i] = 1;
            }
        }
    }

    private static void imprimerMatriz(int[][] matriz) throws InterruptedException {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ matriz[i][j]+"]");
            }
            System.out.println();
        }
    }
}
