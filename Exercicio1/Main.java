package javabasico.aula24.orientacaoobjetos.ExerciciosClassesEAtributos.Exercicio1;

public class Main {
    public static void main(String[] args){
        Lampada ultraLed = new Lampada();

        ultraLed.potencia = "40W";
        ultraLed.fluxLuminoso = "3600lm";
        ultraLed.base = "E27";
        ultraLed.anguloAbertura = 180;
        ultraLed.tempCor = 6500;
        ultraLed.eficienciaLuminosa = "90 lm/W";
        ultraLed.equivalencia = "Incandescente 230W / Fluorescente 64W";

        System.out.println("potencia(W): " + ultraLed.potencia);
        System.out.println("Fluxo luminoso(lm): " + ultraLed.fluxLuminoso);
        System.out.println("Base: " + ultraLed.base);
        System.out.println("Ângulo de abertura: " + ultraLed.anguloAbertura);
        System.out.println("Temperatura da cor(K): " + ultraLed.tempCor);
        System.out.println("Eficiencia luminosa: " + ultraLed.eficienciaLuminosa);
        System.out.println("Equivalencia: " + ultraLed.equivalencia);
    }
}
