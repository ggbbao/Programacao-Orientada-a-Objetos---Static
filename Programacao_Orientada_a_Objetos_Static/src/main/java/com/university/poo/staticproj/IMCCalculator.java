package com.university.poo.staticproj;

/**
 * Calculadora de IMC usando método estático.
 */
public class IMCCalculator {
    /**
     * Calcula o IMC (Índice de Massa Corporal).
     * @param peso em kg
     * @param altura em metros
     * @return imc ou -1 se entrada inválida
     */
    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) return -1;
        return peso / (altura * altura);
    }

    public static String classificarIMC(double imc) {
        if (imc <= 0) return "Inválido";
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Normal";
        if (imc < 30.0) return "Sobrepeso";
        return "Obesidade";
    }
}