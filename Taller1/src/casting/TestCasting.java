/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casting;

import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

/**
 *
 * @author sandro rendon
 */
public class TestCasting {

    public static void main(String[] args) {
        // Se crea una mascota, en este caso un Gato llamado Michi
        Mascota m = new Gato("Michi");

        // Se verifica si la mascota es un Perro para poder hacer el casting y llamar ladrar()
        if (m instanceof Perro) {
            Perro p = (Perro) m;
            p.ladrar();
        } else {
            // Si no es un Perro, muestra este mensaje
            System.out.println("No es un perro, no se puede ladrar.");
        }
    }

}
