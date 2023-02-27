package colecao;

public class Questao3 {

    public static void main(String[] args) {

        String[][] alunos = new String[][]{
                {"João", "30", "Python", "Data Science"},
                {"Letícia", "23", "Javascript", "Web Full Stack - Frontend"},
                {"Pedro", "40", "Java", "Mobile"},
                {"Luciana", "25", "C#", "Web Full Stack - Backend"},
        };

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i][0].equals("Luciana")) {
                System.out.println("Dados Luciana");
                System.out.println("    Nome: " + alunos[i][0] );
                System.out.println("    Idade: " + alunos[i][1] );
                System.out.println("    Linguage: " + alunos[i][2] );
                System.out.println("    Curso: " + alunos[i][3] );
            }
            if (alunos[i][0].equals("Letícia")) {
                System.out.println("Idade Leticia: " + alunos[i][1] );
            }
            if (alunos[i][0].equals("Pedro")) {
                System.out.println("Curso Pedro Modificado para Data Science");
                alunos[i][3] = " Data Science";
            }

        }

    }
}
