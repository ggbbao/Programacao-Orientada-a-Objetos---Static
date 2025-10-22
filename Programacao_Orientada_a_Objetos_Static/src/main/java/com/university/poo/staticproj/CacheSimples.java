package com.university.poo.staticproj;

import java.util.*;

/**
 * Cache simples em memória usando uma lista (simulando um array) de Maps.
 * Cada entrada do array representa um "slot" de cache que pode armazenar pares chave->valor.
 *
 * Exemplo de uso:
 * CacheSimples.adicionaCache("user 1", "Jose maria");
 * String nome = CacheSimples.getCache("user 1");
 */
public class CacheSimples {
    // simulamos um array de 10 mapas
    private static List<Map<String, String>> cacheArray = new ArrayList<>();

    static {
        // inicializa 10 "slots" vazios
        for (int i = 0; i < 10; i++) {
            cacheArray.add(new HashMap<>());
        }
    }

    /**
     * Adiciona um par chave->valor no primeiro slot disponível (ou sobrescreve se já existir a chave).
     */
    public static void adicionaCache(String chave, String valor) {
        if (chave == null) return;
        // verificamos se a chave já existe em algum slot e atualizamos
        for (Map<String, String> slot : cacheArray) {
            if (slot.containsKey(chave)) {
                slot.put(chave, valor);
                return;
            }
        }
        // se não existir, adiciona no primeiro slot com menos de 5 entradas (política simples)
        for (Map<String, String> slot : cacheArray) {
            if (slot.size() < 5) {
                slot.put(chave, valor);
                return;
            }
        }
        // se todos cheios, substitui no slot 0 (política de substituição simples)
        cacheArray.get(0).put(chave, valor);
    }

    /**
     * Recupera um valor do cache pela chave.
     */
    public static String getCache(String chave) {
        if (chave == null) return null;
        for (Map<String, String> slot : cacheArray) {
            if (slot.containsKey(chave)) {
                return slot.get(chave);
            }
        }
        return null;
    }

    /**
     * Limpa todo o cache.
     */
    public static void limpaCache() {
        for (Map<String, String> slot : cacheArray) {
            slot.clear();
        }
    }
}