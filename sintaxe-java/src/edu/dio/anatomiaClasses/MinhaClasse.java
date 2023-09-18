package edu.dio.anatomiaClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Filipe";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
