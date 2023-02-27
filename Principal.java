import logica.matematica.Calculadora;
import logica.matematica.Media;
import logica.util.Meses;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Alteracao de codigo teste GIT!");

        System.out.println("Inicio da aplicação");
        System.out.println("Informe o mês do seu nascimento:");
        Scanner sc = new Scanner(System.in);
        String mes = sc.nextLine();
        Meses mesDigitado = Meses.valueOf(mes.toUpperCase());

        switch (mesDigitado){
            case JANEIRO:
                System.out.println("O mes informado foi " + mes);
                break;
            case MARCO:
                System.out.println("O mes informado foi " + mes);
                break;
            case SETEMBRO:
                System.out.println("O mes informado foi " + mes);
                break;
            default:
                System.out.println("Mês não existe");

        }



        System.out.println("Fim da aplicação");
    }

}
