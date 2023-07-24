package javabasico.aula24.orientacaoobjetos.ExerciciosClassesEAtributos.Exercicio3;

public class Main {
    public static void main(String[] args){

        ContaCorrente conta01 = new ContaCorrente();

        conta01.nome = "Felipe Alexandre";
        conta01.limite = 999999999;
        conta01.especial = true;
        conta01.numAgencia = 7007;
        conta01.numConta = 1230987;
        conta01.saldo = 999999998;

        System.out.println("Nome: " + conta01.nome);
        System.out.println("Limite: " + conta01.limite);
        System.out.println("Especial: " + conta01.especial);
        System.out.println("Número da agência: " + conta01.numAgencia);
        System.out.println("Número da conta: " + conta01.numConta);
        System.out.println("Valor do saldo: " + conta01.saldo);
    }
}
