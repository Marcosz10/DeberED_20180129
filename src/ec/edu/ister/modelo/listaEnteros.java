/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author ariel
 */
public class listaEnteros {

    public class Nodo {

        int dato;
        Nodo enlace;

        public Nodo(int x) {
            dato = x;
            enlace = null;
        }

        public int getDato() {
            return dato;
        }

        public Nodo getEnlace() {
            return enlace;
        }

        public void setEnlace(Nodo enlace) {
            this.enlace = enlace;
        }

        public class Lista {

            protected listaEnteros.Nodo primero;

            public Lista() {
                primero = null;
            }

            public Lista insertarCabezaLista(int entrada) {
                listaEnteros.Nodo nuevo;
                nuevo = new listaEnteros.Nodo(entrada);
                nuevo.enlace = primero;
                primero = nuevo;
                return this;
            }

            public void visualizar() {
                listaEnteros.Nodo n;
                int k = 0;

                n = primero;
                while (n != null) {
                    System.out.print(n.dato + "  ");
                    n = n.enlace;
                    k++;
                    System.out.print((k % 15 != 0 ? " " : "\n"));
                }
            }
        }
    }
}
    
       
    

    

       
// clase con método main import java.util.*; import ListaEnteros.*;

    


    
    
    

