package excecao;

import java.util.Scanner;

public class TratamentoErros {

    public static void main(String[] args) throws Exception {
        testeError();
    }

    public static void testeError() throws Exception {
        testeError2();
    }

    public static void testeError2() throws Exception {

            testeError3();

    }

    public static void testeError3() throws Exception {
        Thread.sleep(1000);
    }

}
