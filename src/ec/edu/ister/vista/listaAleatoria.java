/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import java.util.Random;

/**
 *
 * @author ariel
 */
public class listaAleatoria {
    public class ListaAleatoria {

    }

    public static void main(String[] a) {
        Random r;
        int d;
        lista lista;
        int k;

        r = new Random();
        listaEnteros = new Lista();         // crea lista vacía
        k = Math.abs(r.nextInt() % 55); // número de nodos
// se insertan elementos en la lista
        for (; k > 0; k--) {
            d = r.nextInt() % 99;
            lista.insertarCabezaLista(d);
        }
// recorre la lista para escribir sus elementos System.out.println("Elementos de la lista generados al azar"); lista.visualizar();
    }
}
    

