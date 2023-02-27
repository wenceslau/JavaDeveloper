package colecao;

import java.util.Scanner;

public class Matriz {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Array que indica as materias. Posso aumentar o deminuir a quantidade de materias
        //que não é mecessario mexer nos for
        String[] materia = new String[]{"Geografia","Fisica", "Artes"};

        //Matriz dos alunos com as notas das materias
        //Posso aumentar o numero de aluno que fica na dimessão 1 que nào é necessario mexer nos for
        //Se quantidade de materias aumentar automaticamente aumenta a dimessao 2 que contem as notas das materias
        //e também não é necessario mexer nos for.
        String[][] boletin = new String[3][materia.length];

        //percore o boletins de notas na dimensão 1, cada linha é um aluno
        for (int i = 0; i < boletin.length ; i++) {
            System.out.println("----------------------------");
            System.out.println("Notas aluno "+ (i + 1));

            //percore o boletins de notas na dimensão 2, cada coluna é uma materia e o conteudo é a nota
            for (int j = 0; j < boletin[i].length ; j++) {
                System.out.print("Materia: " + materia[j] + ", nota: ");
                boletin[i][j] = sc.nextLine();
            }
        }

        imprimirBoletin(materia, boletin);
    }

    private static void imprimirBoletin(String[] materia, String[][] boletin) {
        System.out.println("BOLETIN DE NOTAS");

        //Espço tab na console
        System.out.print("-------\t");
        for (int i = 0; i < materia.length; i++) {
            System.out.print("\t"+ materia[i]);
        }
        //Quebra de linha da console
        System.out.println();

        //Imprime o boletins de notas
        for (int i = 0; i < boletin.length ; i++) {
            System.out.print("Aluno "+ (i + 1)+"\t");
            //percore o boletins de notas na dimensão 2, cada coluna é uma materia e o conteudo é a nota
            for (int j = 0; j < boletin[i].length ; j++) {
                System.out.print("\t\t"+ boletin[i][j]);
            }
            System.out.println();
        }
    }

}
