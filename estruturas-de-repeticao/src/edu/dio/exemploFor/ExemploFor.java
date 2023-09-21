package edu.dio.exemploFor;

public class ExemploFor {
    public static void main(String[] args) {

        ///exemplo 1
        System.out.println("Exemplo 1 \n");
        for(int carneirinhos = 1; carneirinhos<=20; carneirinhos++){
            System.out.println("Contando Carneirinhos " + carneirinhos );
        }

        System.out.println(" \n Sofia dormiu \n");

        //exemplo 2
        System.out.println("exemplo 2 \n");
        //em arrays o indece inicia em zero
        String[] alunos  = {"Filipe", "Jonas","Juliana", "Marcos"};

        for(int x =0 ; x < alunos.length; x++){
            System.out.println("O aluno no indece x = "+ x + " é " + alunos[x]);
        }

         //exemplo 3
        System.out.println("\n exemplo 3 \n");

        for(String aluno: alunos){
            System.out.println("Nome do aluno é " + aluno);
        }


        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }

        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);
    }
}
