package com.university.poo.staticproj;

/**
 * Classe Main para demonstrar os exercícios.
 */
public class Main {
    public static void main(String[] args) {
        // 1. IMC
        double imc = IMCCalculator.calcularIMC(70, 1.75);
        System.out.printf("IMC para 70kg e 1.75m = %.2f (%s)%n", imc, IMCCalculator.classificarIMC(imc));

        // 2. Gerenciador de Senhas
        System.out.println("Senha padrão atual: " + PasswordManager.getSenhaPadrao());
        PasswordManager.setSenhaPadrao("novaSenha!2025");
        System.out.println("Senha padrão alterada para: " + PasswordManager.getSenhaPadrao());

        // 3. Contador de Acessos
        AccessCounter.registrarAcesso();
        AccessCounter.registrarAcesso();
        System.out.println("Contador de acessos: " + AccessCounter.getContador());

        // 4. Conversor de Moedas
        double valorUsd = 100.0;
        double convertido = CurrencyConverter.converterUsdParaBrl(valorUsd);
        System.out.printf("USD %.2f -> BRL %.2f (taxa usada = %.4f)%n", valorUsd, convertido, CurrencyConverter.getTaxa());

        // 5. Cache simples
        CacheSimples.adicionaCache("user 1", "Jose maria");
        String nome = CacheSimples.getCache("user 1");
        System.out.println("Cache: user 1 -> " + nome);
    }
}