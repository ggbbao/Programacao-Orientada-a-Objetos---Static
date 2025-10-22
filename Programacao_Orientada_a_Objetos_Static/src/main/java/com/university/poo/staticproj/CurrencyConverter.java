package com.university.poo.staticproj;

/**
 * Conversor de moedas (USD -> BRL).
 *
 * Observação: a taxa abaixo foi obtida em 21/10/2025 e está embutida como valor padrão.
 * Para uso real em produção, recomenda-se buscar a taxa via API atualizada.
 */
public class CurrencyConverter {
    // taxa USD -> BRL (valor informado em 21/10/2025)
    private static double taxaUsdToBrl = 5.3875;

    public static double getTaxa() {
        return taxaUsdToBrl;
    }

    public static void setTaxa(double novaTaxa) {
        if (novaTaxa > 0) taxaUsdToBrl = novaTaxa;
    }

    public static double converterUsdParaBrl(double valorUsd) {
        if (valorUsd < 0) return -1;
        return valorUsd * taxaUsdToBrl;
    }
}