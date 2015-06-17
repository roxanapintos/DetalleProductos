package com.productos.detalle.roxana.detalleproductos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by roxana on 17/06/15.
 */
public class Lista_contenido {
    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos estáticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", R.mipmap.kity, "BUHO", "Búho es el nombre común..."));
        aniadirEntrada(new Lista_entrada("1", R.mipmap.kity, "COLIBRÍ", "Los troquilinos (Trochilinae) son..."));
        aniadirEntrada(new Lista_entrada("2", R.mipmap.kity, "CUERVO", "El cuervo común (Corvus corax) es ..."));
        aniadirEntrada(new Lista_entrada("3", R.mipmap.kity, "FLAMENCO", "Los fenicopteriformes..."));
        aniadirEntrada(new Lista_entrada("4", R.mipmap.kity, "KIWI", "Los kiwis (Apterix, gr. 'sin alas') son..."));
        aniadirEntrada(new Lista_entrada("5", R.mipmap.kity, "LORO", "Las Psitácidas (Psittacidae) son..."));
        aniadirEntrada(new Lista_entrada("6", R.mipmap.kity, "PAVO", "Pavo es un género de aves..."));
    }

    /** Añade una entrada a la lista
     * @param entrada Elemento que añadimos a la lista
     */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }
    }
}
