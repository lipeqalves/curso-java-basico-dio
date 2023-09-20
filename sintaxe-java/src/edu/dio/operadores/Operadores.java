package edu.dio.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Atribuição
        // Representado pelo símbolo de igualdade "=".

        String nome = "Filipe";
        int idade = 36;
        double peso = 79.6;
        char sexo = 'M';
        boolean doadorOrgao = false;
        // Date dataNascimento = new Date();

        // Aritméticos
        // Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e
        // / (divisão).

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1 + 1 + 1);

        // Unários
        // Esses operadores, são aplicados juntamente com um outro operador aritmético.
        // Eles realizam alguns trabalhos básicos como incrementar, decrementar,
        // inverter valores numéricos e booleanos.

        int numero = 5;

        // Imprimindo o numero negativo
        System.out.println(-numero);

        // incrementando numero em mais 1 numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        // ordem de precedencia conta aqui
        System.out.println(++numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // Ternário

        // O operador ternário é representado pelos símbolos "?" e ":" utilizados na
        // seguinte estrutura de sintaxe:
        // <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição
        // seja false>
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado2);

        // Relacionais
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        // Lógicos
        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico E para fazer a união de duas
         * expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        // Se condicao1 OU condicao2 for verdadeira, executar código.
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");
    }
}
