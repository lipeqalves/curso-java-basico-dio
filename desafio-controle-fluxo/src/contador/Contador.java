package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Disafio De projeto Controle de Fluxo\n");

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o Primeiro Parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o Segundo Parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }

    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        int contagem = paramDois - paramUm;

        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException();
        } else {
            for (int contador = 1; contador <= contagem; contador++) {
                System.out.println("Imprimindo o número " + contador);
            }
        }

    }
}
