package logica.visualizacao;

import java.util.Scanner;

public class InterfaceUsuario {

    public static double lerNumero(Scanner scanner, String mensagem){
        System.out.println(mensagem);
        double num1 = scanner.nextDouble();
        return num1;
    }

    public static void escreverMensagem(String mensage){
        System.out.println(mensage);
    }

}
