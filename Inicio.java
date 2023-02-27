public class Inicio {

    public static int contador;
    public static boolean servidorEmailDisponivel = true;

    public static void main(String[] args) {

        int soma= 0;
        if ((--soma) == 1 ){
            System.out.println("Soma é " + soma);
        }

        int numero = 10;

        if (numero == 10){
            numero = 9;
            System.out.println(numero);
            int numero2 = 10;
            System.out.println(numero2);
        }

        String mensagem  = "Olá como vai...";

        enviarEmail(mensagem);

        enviarEmail(mensagem + " A");

        enviarEmail(mensagem + " B");

        enviarEmail(mensagem + " C");

        enviarEmail(mensagem + " D");

        System.out.println("Numero de emails enviados: " + contador);
    }

    public static void enviarEmail(String corpoEmail){
        System.out.println("Enviando email.....");
        if (servidorEmailDisponivel){
            System.out.println("Email Enviado.... Mensagem: "+ corpoEmail );
            contador++;
        }else{
            System.out.println("Ocorreu um erro ao enviar email....");
        }
    }

}
