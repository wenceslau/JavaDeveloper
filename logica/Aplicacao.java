package logica;

import logica.matematica.Media;
import logica.visualizacao.InterfaceUsuario;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = InterfaceUsuario.lerNumero(sc, "Informe o numero 1");
        double num2 = InterfaceUsuario.lerNumero(sc, "Informe o numero 2");
        double num3 = InterfaceUsuario.lerNumero(sc, "Informe o numero 3");

        double media = Media.calcularMediaSimples(num1, num2, num3);

        InterfaceUsuario.escreverMensagem("Media: " + media);

    }


}
