public class EstruturaRepeticao {

    public static void main(String[] args) {

        int contador = 1;
        int resultado = 0;

        if (contador == 1) {
            resultado = 10;
        }else {
            resultado = 100;
        }

        resultado = (contador == 1) ? 10 : 100;

        int salario = 0;
        String funcao = "Gerente";
        int tempoCasa = 1;

        salario = (funcao.equals("Gerente")) ? ((tempoCasa == 1) ? 1000: 900) : 100;

        if (funcao.equals("Gerente")){
            if (tempoCasa == 1){
                salario = 1000;
            }else if (tempoCasa == 2){
                salario = 1100;
            }else{
                salario = 900;
            }
        }else if (funcao.equals("Supervisor")){
            salario = 500;
        }else{
            salario = 100;
        }
    }

}
