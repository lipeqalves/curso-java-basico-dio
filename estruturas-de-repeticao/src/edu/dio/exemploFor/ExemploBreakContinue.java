package edu.dio.exemploFor;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("Exemplo break \n");
        for(int numero = 1; numero <=5; numero++){
            if(numero ==3)
                break;

            System.out.println(numero);
        }
System.out.println("\nExemplo continue \n");
        for(int numero = 1; numero <=5; numero++){
            if(numero ==3)
                continue;

            System.out.println(numero);
        }
    }
}
