package colecao;

public class Questao2 {

    public static void main(String[] args) {

        String[] alunos = new String[]{"Jason", "Kimberly", "Zack", "Trini", "Billy", "Tommy"};

        double[][] notas = new double[][]{
                {9.5, 7.0, 8.0, 7.5},
                {6.0, 7.0, 8.0, 9.0},
                {8.0, 7.0, 8.5, 7.5},
                {0.5, 10.0, 9.75, 9.0},
                {9.75, 9.5, 9.0, 9.5},
                {5.5, 4.5, 3.0, 7.0}
        };

        double somaNotasTurma = 0.0;
        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            somaNotasTurma += mediaAluno(notas, i , aluno);
        }

        System.out.println("------------------------------------------");
        double mediaTurma = somaNotasTurma / (alunos.length * 4);
        System.out.println("Media da turma: " + mediaTurma);

        System.out.println("------------------------------------------");
        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            System.out.println("MAIORES NOTA. ALUNO: " + aluno);
            maiorNotaAlunoPorBimestre(notas,i);
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            System.out.println("PIORES NOTA. ALUNO " + aluno);
            piorNotaAlunoPorBimestre(notas,i);
        }

    }

    private static double mediaAluno(double[][] notas, int posicaoAluno, String aluno) {

        double somaNotas = 0;
        for (int k = 0; k < notas[posicaoAluno].length; k++) {
            somaNotas += notas[posicaoAluno][k];
        }
        double media = somaNotas / notas[posicaoAluno].length;

        System.out.println("Media notas Aluno " + aluno + " " + media);

        return somaNotas;
    }

    private static void maiorNotaAlunoPorBimestre(double[][] notas, int posicaoAluno) {

        double maiorNotaB1 = 0;
        double maiorNotaB2 = 0;
        double maiorNotaB3 = 0;
        double maiorNotaB4 = 0;

        for (int k = 0; k < notas[posicaoAluno].length; k++) {
            if (k == 0) {
                if (notas[posicaoAluno][k] > maiorNotaB1) {
                    maiorNotaB1 = notas[posicaoAluno][k];
                }
            } else if (k == 1) {
                if (notas[posicaoAluno][k] > maiorNotaB2) {
                    maiorNotaB2 = notas[posicaoAluno][k];
                }
            } else if (k == 2) {
                if (notas[posicaoAluno][k] > maiorNotaB3) {
                    maiorNotaB3 = notas[posicaoAluno][k];
                }
            } else if (k == 3) {
                if (notas[posicaoAluno][k] > maiorNotaB4) {
                    maiorNotaB4 = notas[posicaoAluno][k];
                }
            }
        }

        System.out.println("Bimestre 1: " + maiorNotaB1);
        System.out.println("Bimestre 2: " + maiorNotaB2);
        System.out.println("Bimestre 3: " + maiorNotaB3);
        System.out.println("Bimestre 4: " + maiorNotaB4);

    }

    private static void piorNotaAlunoPorBimestre(double[][] notas, int posicaoAluno) {

        double piorNotaB1 = 10;
        double piorNotaB2 = 10;
        double piorNotaB3 = 10;
        double piorNotaB4 = 10;

        for (int k = 0; k < notas[posicaoAluno].length; k++) {
            if (k == 0) {
                if (notas[posicaoAluno][k] < piorNotaB1) {
                    piorNotaB1 = notas[posicaoAluno][k];
                }
            } else if (k == 1) {
                if (notas[posicaoAluno][k] < piorNotaB2) {
                    piorNotaB2 = notas[posicaoAluno][k];
                }
            } else if (k == 2) {
                if (notas[posicaoAluno][k] < piorNotaB3) {
                    piorNotaB3 = notas[posicaoAluno][k];
                }
            } else if (k == 3) {
                if (notas[posicaoAluno][k] < piorNotaB4) {
                    piorNotaB4 = notas[posicaoAluno][k];
                }
            }
        }

        System.out.println("Bimestre 1: " + piorNotaB1);
        System.out.println("Bimestre 2: " + piorNotaB2);
        System.out.println("Bimestre 3: " + piorNotaB3);
        System.out.println("Bimestre 4: " + piorNotaB4);
    }

}
