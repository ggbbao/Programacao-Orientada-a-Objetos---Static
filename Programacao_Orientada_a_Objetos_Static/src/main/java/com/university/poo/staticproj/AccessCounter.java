package com.university.poo.staticproj;

/**
 * Contador de acessos usando variável estática e bloco estático.
 */
public class AccessCounter {
    private static int contador;

    // bloco estático inicializa o contador (executado uma vez ao carregar a classe)
    static {
        contador = 0;
        System.out.println("[AccessCounter] Bloco estático executado: contador iniciado em 0");
    }

    public static void registrarAcesso() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }
}