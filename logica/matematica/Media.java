package logica.matematica;

public class Media {

    public static double calcularMediaSimples(double num1, double num2, double num3) {
        double media = (num1 + num2 + num3) / 3.0;
        return  media;
    }

    public static double calcularMediaPonderada(double valor1, double valor2, double valor3){
        double mediaPond = ((valor1 * 3) + (valor2 * 2) + (valor3 * 4)) / (3 + 2 + 4);
        return mediaPond;
    }

    //outros metodos que calculam medias

}
