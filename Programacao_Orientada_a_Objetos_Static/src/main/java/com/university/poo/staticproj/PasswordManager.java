package com.university.poo.staticproj;

/**
 * Gerenciador de senhas usando variável estática.
 */
public class PasswordManager {
    // senha padrão compartilhada entre todos os usuários
    private static String senhaPadrao = "p@ssw0rd123";

    public static String getSenhaPadrao() {
        return senhaPadrao;
    }

    public static void setSenhaPadrao(String novaSenha) {
        if (novaSenha != null && !novaSenha.isEmpty()) {
            senhaPadrao = novaSenha;
        }
    }
}