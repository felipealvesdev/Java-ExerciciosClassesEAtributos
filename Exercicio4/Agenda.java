package javabasico.aula24.orientacaoobjetos.ExerciciosClassesEAtributos.Exercicio4;

public class Agenda {
    public static void main(String[] args){

        Contato silva = new Contato();

        silva.nome = "Silvio";
        silva.sobrenome = "Silva";
        silva.email = "silviosilva@gmail.com";
        silva.numero = "81900220033";

        System.out.println("Nome: " + silva.nome);
        System.out.println("Sobrenome: " + silva.sobrenome);
        System.out.println("Email: " + silva.email);
        System.out.println("Número: " + silva.numero);
    }
}
