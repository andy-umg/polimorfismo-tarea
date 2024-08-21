/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author Andy Macnab
 */
public class Polimorfismo {

    public static void main(String[] args) {
        // Polimorfismo: una referencia de tipo Animal puede referirse a un objeto Perro o Gato
        Animal miAnimal = new Animal();  // Referencia a la clase base
        Animal miPerro = new Perro();    // Referencia a la subclase Perro
        Animal miGato = new Gato();      // Referencia a la subclase Gato

        // Cada objeto usa su propio método sonido
        miAnimal.sonido();  // Imprime: El animal hace un sonido
        miPerro.sonido();   // Imprime: El perro ladra
        miGato.sonido();    // Imprime: El gato maúlla
    }
}
