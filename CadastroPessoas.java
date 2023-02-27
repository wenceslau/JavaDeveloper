import java.util.Scanner;

public class CadastroPessoas {

    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        mostrarMensagem("----Sistema de Cadastro----");
        String nome = "";
        do{
            switch (opcao){
                case 1:
                    mostrarMensagem("Digite um nome:");
                    nome = sc.next();
                    opcao = mostrarMenu(sc);
                    break;
                case 2:
                    mostrarMensagem("O nome é " + nome);
                    opcao = mostrarMenu(sc);
                    break;
                default:
                    opcao = mostrarMenu(sc);
            }

            if (opcao == 9){
                break;
            }

        }while (true);
    }

    public static int mostrarMenu(Scanner sc){
        System.out.println("1-Cadastro");
        System.out.println("2-Imprimir");
        System.out.println("9-Sair");
        int opcao = sc.nextInt();
        return opcao;
    }

    public static void mostrarMensagem(String mensagem){
        System.out.println(mensagem);
    }

}
